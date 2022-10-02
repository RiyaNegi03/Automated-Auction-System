package com.masai.dao;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import com.masai.users.Buyer;
import com.masai.users.Seller;
import com.masai.utility.DBUtil;

public class AdminDaoImpl implements AdminDao{

	@Override
	public Buyer getBuyer() {
		
		Buyer b = null;
		
		try (Connection conn = DBUtil.provideConnection()){
			
            PreparedStatement ps=  conn.prepareStatement("select * from Buyer");
			
			ResultSet rs =  ps.executeQuery();
			
			while(rs.next()) 
			{
				int id= rs.getInt("B_id");
				String name= rs.getString("B_name");
				String email = rs.getString("B_email");
				String password = rs.getString("B_password");
				
				b = new Buyer(id, name, email, password);
			
			}
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		// TODO Auto-generated method stub
		return b;
	}

	@Override
	public Seller getSeeler() {
		
		Seller s = null;
		
            try (Connection conn = DBUtil.provideConnection()){
			
            PreparedStatement ps=  conn.prepareStatement("select * from Seller");
			
			ResultSet rs =  ps.executeQuery();
			
			while(rs.next()) 
			{
				int id= rs.getInt("S_id");
				String name= rs.getString("S_name");
				String email = rs.getString("S_email");
				String password = rs.getString("S_password");
				
				s = new Seller(id, name, email, password);
			
			}
            } catch (Exception e) {
    			e.printStackTrace();
    		}	
		
		// TODO Auto-generated method stub
		return s;
	}

	

}
	
	

