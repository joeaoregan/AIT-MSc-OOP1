/*
 * Chapter 7
 * L7S10-12
 */
package com.ait.wk4.classes;

import java.text.NumberFormat;

public class Product {
	// the instance variables
	private String code;
	private String description;
	private double price;
	
	// the constructor - assigns default values
	public Product() {
		code = "";
		description = "";
		price = 0;
	}

	// the set and get methods for the code variable
	public String getCode() {
		return code;
	}

	public void setCode(String code) {
		this.code = code;
	}

	// the set and get methods for the description variable
	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	// the set and get methods for the price variable
	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}
	
	// a custom get method for the price variable
	public String getFormattedPrice() {
		NumberFormat currency = NumberFormat.getCurrencyInstance();
		return currency.format(price);
	}
}
