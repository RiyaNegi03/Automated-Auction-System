package com.masai.dao;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import com.masai.users.Buyer;
import com.masai.utility.DBUtil;

public class BuyerDaoImpl implements BuyerDao{

	@Override
	public String RegisterBuyer(Buyer buyer) {
		
		String message = "Not Inserted..";
		
            try(Connection conn= DBUtil.provideConnection()) {
			
			PreparedStatement ps= conn.prepareStatement("insert into Buyer values(?,?,?,?)");
			
			ps.setInt(1, buyer.getBuyerId());
			ps.setString(2, buyer.getName());
			ps.setString(3, buyer.getEmail());
			ps.setString(4, buyer.getPassword());
			
			int x= ps.executeUpdate();
			
			
			if(x > 0)
				message = "Buyer Registered Sucessfully !";
			
			
		} catch (SQLException e) {
			message = e.getMessage();
		}

		return message;
	
	}
		
}
