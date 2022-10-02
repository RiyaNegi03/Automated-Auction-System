package com.masai.users;

public class Product {

	private Integer productId;
	private String productName;
	private Integer productPrice;
	private Integer quantity;
	private String productCategory;
	private int SeelerId;
	public Product() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Product(Integer productId, String productName, Integer productPrice, Integer quantity,
			String productCategory, int seelerId) {
		super();
		this.productId = productId;
		this.productName = productName;
		this.productPrice = productPrice;
		this.quantity = quantity;
		this.productCategory = productCategory;
		SeelerId = seelerId;
	}
	public Integer getProductId() {
		return productId;
	}
	public void setProductId(Integer productId) {
		this.productId = productId;
	}
	public String getProductName() {
		return productName;
	}
	public void setProductName(String productName) {
		this.productName = productName;
	}
	public Integer getProductPrice() {
		return productPrice;
	}
	public void setProductPrice(Integer productPrice) {
		this.productPrice = productPrice;
	}
	public Integer getQuantity() {
		return quantity;
	}
	public void setQuantity(Integer quantity) {
		this.quantity = quantity;
	}
	public String getProductCategory() {
		return productCategory;
	}
	public void setProductCategory(String productCategory) {
		this.productCategory = productCategory;
	}
	public int getSeelerId() {
		return SeelerId;
	}
	public void setSeelerId(int seelerId) {
		SeelerId = seelerId;
	}
	@Override
	public String toString() {
		return "Product [productId=" + productId + ", productName=" + productName + ", productPrice=" + productPrice
				+ ", quantity=" + quantity + ", productCategory=" + productCategory + ", SeelerId=" + SeelerId + "]";
	}

	
}