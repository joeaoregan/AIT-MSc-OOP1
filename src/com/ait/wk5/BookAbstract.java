/*
 * A class that inherits the abstract Product class
 * L8S40
 */

package com.ait.wk5;

public class BookAbstract extends ProductAbstract {
	private String author;
	
	// regular constructor and methods for the Book class
	
	// implement the abstract method
	@Override
	//public String getDisplayText() {
	public String toString() {
		return super.toString() + "Author:     " + author + "\n";
	}
}
