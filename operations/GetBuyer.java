package com.masai.operations;
import com.masai.dao.AdminDao;
import com.masai.dao.AdminDaoImpl;
import com.masai.users.Buyer;

public class GetBuyer {

public static void main(String[] args) {
		
		AdminDao ad = new AdminDaoImpl();
		
		Buyer b =  ad.getBuyer();
		
		if(b!=null)
		{
			System.out.println(b);
		}
		else
			System.out.println("No Record Found");
	}
}

