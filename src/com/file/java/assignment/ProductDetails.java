package com.file.java.assignment;

import java.io.Serializable;

public class ProductDetails implements Serializable {

	private int pid;
	private double cost;
	private int quantity;
	
	
	public ProductDetails(int pid, double cost, int quantity) {
		super();
		this.pid = pid;
		this.cost = cost;
		this.quantity = quantity;
	}
	public int getPid() {
		return pid;
	}
	public void setPid(int pid) {
		this.pid = pid;
	}
	public double getCost() {
		return cost;
	}
	public void setCost(double cost) {
		this.cost = cost;
	}
	public int getQuantity() {
		return quantity;
	}
	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}
	@Override
	public String toString() {
		return "ProductDetails [pid=" + pid + ", cost=" + cost + ", quantity=" + quantity + "]";
	}
	
}
