package com.masai.operations;
import java.util.Scanner;

import com.masai.dao.SellerDao;
import com.masai.dao.SellerDaoImpl;
import com.masai.users.Seller;
public class RegisterSeller {
	



	public static void main(String[] args) {
			
			Scanner sc = new Scanner(System.in);
			
			System.out.println("Enter Seller Id");
			int id = sc.nextInt();
			
			System.out.println("Enter Seller Name");
			String name = sc.next();
			
			System.out.println("Enter Seller Email");
			String email = sc.next();
			
			System.out.println("Enter Seller Password");
			String password = sc.next();
			
			SellerDao bdao = new SellerDaoImpl();
			
			Seller s = new Seller();
			s.setSellerId(id);
			s.setName(name);
			s.setEmail(email);
			s.setPassword(password);
			
			String result = bdao.RegisterSeller(s);
			System.out.println(result);
		}

	}

