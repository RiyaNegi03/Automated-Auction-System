package com.masai.users;
public class Seller {

	private int SellerId;
	private String Name;
	private String Email;
    private String Password;
	public Seller() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Seller(Integer sellerId, String name, String email, String password) {
		super();
		SellerId = sellerId;
		Name = name;
		Email = email;
		Password = password;
	}
	public Integer getSellerId() {
		return SellerId;
	}
	public void setSellerId(Integer sellerId) {
		SellerId = sellerId;
	}
	public String getName() {
		return Name;
	}
	public void setName(String name) {
		Name = name;
	}
	public String getEmail() {
		return Email;
	}
	public void setEmail(String email) {
		Email = email;
	}
	public String getPassword() {
		return Password;
	}
	public void setPassword(String password) {
		Password = password;
	}
	@Override
	public String toString() {
		return "Seller [SellerId=" + SellerId + ", Name=" + Name + ", Email=" + Email + ", Password=" + Password + "]";
	}
	
    

}