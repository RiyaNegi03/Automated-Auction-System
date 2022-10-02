package com.masai.operations;
import com.masai.dao.AdminDao;
import com.masai.dao.AdminDaoImpl;
import com.masai.users.Seller;

public class GetSeller {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		AdminDao ad = new AdminDaoImpl();
		
		Seller s = ad.getSeeler();
		
		if(s != null)
			System.out.println(s);
		else
			System.out.println("No record Found");
	}
}
