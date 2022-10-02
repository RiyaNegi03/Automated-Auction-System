package com.masai.operations;


import java.util.Scanner;

import com.masai.dao.SellerDao;
import com.masai.dao.SellerDaoImpl;
import com.masai.users.Product;

public class UpdateProduct {

public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Id no. of item you want to update");
		int id = sc.nextInt();
		
		System.out.println("Enter the name of Item");
		String name = sc.next();
		
		System.out.println("Enter the price of item");
		int price = sc.nextInt();
		
		
		System.out.println("Enter the category of Item");
		String category = sc.next();
		
		SellerDao s = new SellerDaoImpl();
		
		
		
		//make the objec and pass the data
		Product p  = new Product();
		p.setProductName(name);
		p.setProductPrice(price);
		p.setProductCategory(category);
		
		
		
		String result = s.Updateproduct(p, id);
		System.out.println(result);
	}

}