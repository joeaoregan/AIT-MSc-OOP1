package com.mase.interfaces;

public class UseLineItemClone {

	public static void main(String[] args) {
		ProductClone p1 = new ProductClone();
		p1.setCode("java");
		p1.setDescription("Murach's Beginning Java");
		p1.setPrice(49.50);
		
		LineItem li1 = new LineItem(p1, 3);
		
		// clone the line item
		LineItem li2 = (LineItem) li1.clone();
		
		// change values in the cloned LineItem and its Product object
		li2.setQuantity(2);
		li2.getProduct().setPrice(44.50);
		
		// print the results
		System.out.println(li1);
		System.out.println(li2);
	}

}
