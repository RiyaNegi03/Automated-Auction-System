package com.masai.operations;


import java.sql.Connection;
import java.util.Scanner;


import com.masai.dao.SellerDao;
import com.masai.dao.SellerDaoImpl;
import com.masai.users.Product;
import com.masai.utility.DBUtil;

public class UpdateProduct {

public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Id no. of item you want to update");
		int id = sc.nextInt();
		
		System.out.println("Enter the name of Item");
		String name = sc.next();
		
		System.out.println("Enter the price of item");
		int price = sc.nextInt();
		
		System.out.println("Enter the quantity of item");
		int quantity = sc.nextInt();
		
		
		System.out.println("Enter the category of Item");
		String category = sc.next();
		
		SellerDao s = new SellerDaoImpl();		
		
		Product p  = new Product();
		p.setProductName(name);
		p.setProductPrice(price);
		p.setProductCategory(category);
		p.setQuantity(quantity);
		
		
		
		String result = s.Updateproduct(p, id);
		System.out.println(result);
	}

}