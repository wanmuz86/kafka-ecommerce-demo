package com.example.kafka_ecommerce.model;

// For simplicity, we do not cover the DB part
// By right, this will be connected to the DB @Entity

public class Order {
	
	private String orderId;
	private String product; // In real scenario you will have Product Entity
	private int quantity;
	
	
	public String getOrderId() {
		return orderId;
	}
	public void setOrderId(String orderId) {
		this.orderId = orderId;
	}
	public String getProduct() {
		return product;
	}
	public void setProduct(String product) {
		this.product = product;
	}
	public int getQuantity() {
		return quantity;
	}
	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}
	
	

}
