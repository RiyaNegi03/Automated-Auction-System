package com.masai.operations;

import java.util.List;
import java.util.Scanner;

import com.masai.dao.BuyerDao;
import com.masai.dao.BuyerDaoImpl;
import com.masai.users.Product;

public class ViewItems {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the category");
		String c = sc.next();
		
		BuyerDao b = new BuyerDaoImpl();
		
		b.viewItems(c);
//		if(p.size() !=n)
//		{
//			System.out.println(p);
//		}
//		else
//			System.out.println("No Record Found");

	}

}