package com.masai.users;

public class Item {

	private Integer itemtId;
	private String itemName;
	private Integer itemPrice;
	private Integer quantity;

	public Item() {
		super();
	}

	public Item(Integer itemId, String itemName, Integer itemPrice, Integer quantity) {
		super();
		this.itemtId = itemId;
		this.itemName = itemName;
		this.itemPrice = itemPrice;
		this.quantity = quantity;
	}

	public Integer getItemtId() {
		return itemtId;
	}

	public void setItemtId(Integer itemtId) {
		this.itemtId = itemtId;
	}

	public String getItemName() {
		return itemName;
	}

	public void setItemName(String itemName) {
		this.itemName = itemName;
	}

	public Integer getItemPrice() {
		return itemPrice;
	}

	public void setItemPrice(Integer itemPrice) {
		this.itemPrice = itemPrice;
	}

	public Integer getQuantity() {
		return quantity;
	}

	public void setQuantity(Integer quantity) {
		this.quantity = quantity;
	}

	
	
}
