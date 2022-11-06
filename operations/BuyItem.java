package com.masai.operations;

import java.util.Scanner;


import com.masai.users.*;
import com.masai.dao.BuyerDao;
import com.masai.dao.BuyerDaoImpl;
import com.masai.exceptions.BuyerException;

public class BuyItem {

	public static void main(String[] args) {
		
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter Buyer Email");
		String email = sc.next();
		
		System.out.println("Enter Product Name");
		String name = sc.next();
		
		
		BuyerDao B = new BuyerDaoImpl();
		
		String result;
		try {
			result = B.Buy(email, name);
			System.out.println(result);
		} catch (BuyerException e) {
			System.out.println(e.getMessage());
		}
		

	}

}