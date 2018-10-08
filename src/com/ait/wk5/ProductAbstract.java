package com.ait.wk5;

public class ProductAbstract {
	private String code;
	private String description;
	private double price;
	
	// regular constructors and methods for instance variables
	
	@Override
	public String toString() {
		return "Code:        " + code + 
				"\nDescription: " + description +
				//"\nPrice:       " + this.getFormattedPrice() + "\n";
				"\nPrice:       " + price + "\n";
	}
}
