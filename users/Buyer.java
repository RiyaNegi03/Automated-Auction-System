package com.masai.users;

public class Buyer {
	private Integer buyerId;
	private String firstName;
	private String lastName;
	private String email;
	private String mobile;

	public Buyer(Integer buyerId, String firstName, String lastName, String email, String mobile, Details details) {
		super();
		this.buyerId = buyerId;
		this.firstName = firstName;
		this.lastName = lastName;
		this.email = email;
		this.mobile = mobile;
		this.details = details;
	}

	public Buyer() {
		super();
	}

	public Integer getBuyerId() {
		return buyerId;
	}

	public void setBuyerId(Integer buyerId) {
		this.buyerId = buyerId;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getMobile() {
		return mobile;
	}

	public void setMobile(String mobile) {
		this.mobile = mobile;
	}

	public Details getAddress() {
		return details;
	}

	public void setAddress(Details details) {
		this.details = details;
	}

	private Details details;

}

