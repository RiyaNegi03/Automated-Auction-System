package com.masai.dao;
import java.sql.Connection;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

import com.masai.exceptions.BuyerException;
import com.masai.users.Buyer;
import com.masai.users.Product;
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

	@Override
	public String registerBuyer(Buyer buyer) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String Buy(String Buyer_email, String Product_Name)throws BuyerException {
		
		String result = "buyer is not registered";
		
		

		try(Connection conn= DBUtil.provideConnection()) {
			
			PreparedStatement ps= conn.prepareStatement("Select b_id from buyer where b_email=?");

			ps.setString(1,Buyer_email);
			
			// email- product -> delete/msg
			ResultSet rs=	ps.executeQuery();
	
			// id exists
			if(rs.next()) {
				
				PreparedStatement ps2= conn.prepareStatement("Select p_id from product where p_name= ?");
				ps2.setString(1,Product_Name);
				
				ResultSet rs2=	ps2.executeQuery();
				
				// id exists
				if(rs2.next()) {
					
					  result = Product_Name +" successfully done";
					   
					   SellerDao seller = new SellerDaoImpl();
					   seller.DeleteProduct(rs2.getInt("p_id"));
				}
				// if not
				else
					 throw new BuyerException("Product deosn't exist");
			
			  }
			
			// if not
			else {				
				 throw new BuyerException("Buyer deosn't exist");
			}
		}
			catch (SQLException e) {
			
		}		
		return result;
	}

	@Override
	public void viewItems(String c) {
		  List<Product> products = null;
			
			try(Connection conn= DBUtil.provideConnection()) {
				
				PreparedStatement ps= conn.prepareStatement("Select * from Product where p_category=?");
							
				ps.setString(1, c);
				
				
//		    ResultSet rs=  ps.getResultSet();
				ResultSet rs=	ps.executeQuery();
				while(rs.next()) {
					System.out.println(rs.getString("p_name"));
				}
				
		    
				
				
			} catch (SQLException e) {
				e.printStackTrace();
			}
			
			
			
	}


	
	
	
	
	
	
	
	
	
	
	
		
}
