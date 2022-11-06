package com.masai.dao;
import com.masai.users.Product;
import com.masai.users.Seller;

public interface SellerDao {

    public String RegisterSeller(Seller seller);
	
	public String ProductList(Product p);
	
	public String Updateproduct(Product p ,int id);

	public String DeleteProduct(int id);	
	
}
