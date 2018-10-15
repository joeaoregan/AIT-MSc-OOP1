/*
 * Chapter 9: Interfaces - S43
 * A Product class that implements the Cloneable interface
 * 15/10/2018
 */
package com.mase.interfaces;

public class ProductClone implements Cloneable {
	private String code;
	private String description;
	private double price;
	
	ProductClone() {
		this.code = "";
		this.description = "";
		this.price = 0.0;
	}
	
	ProductClone(String code, String description, double price) {
		this.code = code;
		this.description = description;
		this.price = price;
	}
	public String getCode() {
		return code;
	}

	public void setCode(String code) {
		this.code = code;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	@Override
	public Object clone() throws CloneNotSupportedException {
		return super.clone();
	}
}
