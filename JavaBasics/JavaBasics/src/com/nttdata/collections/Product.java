package com.nttdata.collections;

public class Product {
	
	private int productId;
	private double productPrice;
	private int quantity ;
	private String name;
	
	public int getProductId() {
		return productId;
	}
	public void setProductId(int productId) {
		this.productId = productId;
	}
	public double getProductPrice() {
		return productPrice;
	}
	public void setProductPrice(double productPrice) {
		this.productPrice = productPrice;
	}
	public int getQuantity() {
		return quantity;
	}
	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Product(int productId, double productPrice, int quantity, String name) {
		super();
		this.productId = productId;
		this.productPrice = productPrice;
		this.quantity = quantity;
		this.name = name;
	}
	@Override
	public String toString() {
		return "Product [productId=" + productId + ", productPrice=" + productPrice + ", quantity=" + quantity
				+ ", name=" + name + "]";
	}
	
	
	

}
