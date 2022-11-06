package com.masai.operations;

import java.util.Scanner;


import com.masai.dao.BuyerDao;
import com.masai.dao.BuyerDaoImpl;
import com.masai.users.Buyer;

public class RegisterBuyer {

public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter Buyer Id");
		int id = sc.nextInt();
		
		System.out.println("Enter Buyer Name");
		String name = sc.next();
		
		System.out.println("Enter Buyer Email");
		String email = sc.next();
		
		System.out.println("Enter Buyer Password");
		String password = sc.next();
		
		BuyerDao bdao = new BuyerDaoImpl();
		
		Buyer b = new Buyer();
		b.setBuyerId(id);
		b.setName(name);
		b.setEmail(email);
		b.setPassword(password);
		
		String result = bdao.RegisterBuyer(b);
		System.out.println(result);
		
	}
}