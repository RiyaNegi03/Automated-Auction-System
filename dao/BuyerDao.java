package com.masai.dao;
import java.util.List;

import com.masai.exceptions.BuyerException;
import com.masai.users.Buyer;
import com.masai.users.Product;
public interface BuyerDao {

public String registerBuyer(Buyer buyer);

	public String Buy(String Buyer_email , String Product_Name) throws BuyerException;

	String RegisterBuyer(Buyer buyer);

	public void viewItems(String c);

		
}
