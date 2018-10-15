/*
 * Chapter 9: Interfaces - S5
 * 15/10/2018
 * A Product class that implements the Printable interface
 * 
 * The type Product must implement the inherited abstract method Printable.print()
 */
package com.mase.interfaces;

public class Product implements Printable {
	private String code;
	private String description;
	private double price;
	
	public Product(String code, String description, double price) {
		this.code = code;
		this.description = description;
		this.price = price;
	}
	
	// implement the Printable interface
	public void print() {
		System.out.println("Code:        " + code);
		System.out.println("Description: " + description);
		//System.out.println("Price:       " + this.getFormattedPrice());
		System.out.println("Price:       " + price);
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
	
	public String getFormattedPrice() {
		return "Not implemented";
	}

	public void setPrice(double price) {
		this.price = price;
	}
}
