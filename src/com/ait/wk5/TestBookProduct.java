/*
 * Chapter 8: L8S17
 */
package com.ait.wk5;

public class TestBookProduct {

	public static void main(String[] args) {
		Book b = new Book();
		b.setCode("java");
		b.setDescription("Murach's Beginning Java");
		b.setPrice(49.50);
		b.setAuthor("Steelman");
		
		Software s = new Software();
		s.setCode("txtp");
		s.setDescription("TextPad");
		s.setPrice(27.00);
		s.setVersion("4.7.3");
		
		Product p;
		p = b;
		System.out.println(p.toString());	// calls toString from the Book class
		
		p = s;
		System.out.println(p.toString());	// calls toString from the Software class
	}

}
