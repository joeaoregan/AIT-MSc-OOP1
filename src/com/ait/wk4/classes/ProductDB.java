/*
 * Chapter 7: Classes
 * L7S39-40
 * 08/10/2018
 * 
 * The ProductDB class simulates the processing that would be done
 * by a database class. In a more realistic application, this class
 * would retrieve the data for a product from a file or database and
 * then fill the Product object with the data. It would also include
 * methods for adding, modifying, and deleting existing products.
 */

package com.ait.wk4.classes;

public class ProductDB {
	public static Product getProduct(String productCode) {
		
		// create the Product object
		Product p = new Product();
		
		// fill the Product object with data
		p.setCode(productCode);
		if (productCode.equalsIgnoreCase("java")) {
			p.setDescription("Murach's Beginning Java");
			p.setPrice(49.50);
		} else if (productCode.equalsIgnoreCase("jsps")) {
			p.setDescription("Murach's Java Servlets and JSP");
			p.setPrice(49.50);
		} else if (productCode.equalsIgnoreCase("mcb2")) {
			p.setDescription("Murach's Mainframe COBOL");
			p.setPrice(59.50);
		} else {
			p.setDescription("Unknown");
		}
		return p;
	}
}
