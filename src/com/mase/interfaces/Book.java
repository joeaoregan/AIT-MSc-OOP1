/*
 * Chapter 9: Interfaces - S18
 * 15/10/2018
 * A Book class that inherits Product and implements Printable
 */
package com.mase.interfaces;

public class Book extends Product implements Printable {
	private String author;

	public Book(String code, String description, double price, String author) {
		super(code, description, price);
		this.author = author;
	}

	public void setAuthor(String author) {
		this.author = author;
	}

	public String getAuthor() {
		return author;
	}

	// implement the Printable interface
	@Override
	public void print() {
		System.out.println("Code:\t" + super.getCode());
		System.out.println("Title:\t" + super.getDescription());
		System.out.println("Author:\t" + this.author);
		System.out.println("Price:\t" + super.getFormattedPrice());
	}
}
