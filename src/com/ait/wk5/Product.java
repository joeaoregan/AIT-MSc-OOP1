/*
 * L5S11-12
 */
package com.ait.wk5;

import java.text.NumberFormat;

public class Product {
	private String code;
	private String description;
	private double price;
	protected static int count = 0; // a protected static variable

	public Product() {
		code = "";
		description = "";
		price = 0;
	}

	// get and set accessors fo the code, description,
	// and price instance variables

	@Override
	public String toString() {
		return "Code:        " + code + "\n" + "Description: " + description + "\n" +
		// "Price: " + this.getFormattedPrice() + "\n";
				"Price:       " + price + "\n";
	}

	// create public access for the count variable
	public static int getCount() {
		return count;
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

	public String getCode() {
		return code;
	}

	public void setCode(String code) {
		this.code = code;
	}

	// L8S37
	@Override
	public boolean equals(Object object) {
		if (object instanceof Product) {
			Product product2 = (Product) object;
			if (code.equals(product2.getCode()) &&
				description.equals(product2.getDescription()) &&
				price == product2.getPrice()) {
				return true;
			}			
		}
		return false;
	}
}
