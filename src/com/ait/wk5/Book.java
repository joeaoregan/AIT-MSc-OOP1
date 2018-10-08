package com.ait.wk5;

public class Book extends Product{
	private String author;
	
	public Book() {
		super();	// call constructor of Product
					// superclass
		author = "";
		count++;	// update the count variable in the Product superclass		
	}
	
	public void setAuthor(String author) {
		this.author = author;
	}
	
	public String getAuthor() {
		return author;
	}
	
	// override the toString method
	@Override
	public String toString() {
		// call method of Product superlass
		return super.toString() + "Author:      " + author + "\n";
	}
}
