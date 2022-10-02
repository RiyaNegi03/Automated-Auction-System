package com.masai.operations;


	import java.util.Scanner;

	import com.masai.dao.SellerDao;
	import com.masai.dao.SellerDaoImpl;
	import com.masai.users.Product;

	public class DeleteProduct {

	public static void main(String[] args) {
			
			Scanner sc = new Scanner(System.in);
			
			System.out.println("Enter the Product Id");
			int id = sc.nextInt();
			
			SellerDao s = new SellerDaoImpl();
			
			Product p = new Product();
			p.setProductId(id);
			
			String result =s.DeleteProduct(p, id);
			System.out.println(result);
		}
	}

