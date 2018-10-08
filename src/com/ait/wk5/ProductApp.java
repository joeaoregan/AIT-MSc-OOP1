package com.ait.wk5;

import java.util.Scanner;

public class ProductApp {

	public static void main(String[] args) {
		// display a welcome message
		System.out.println("Welcome to the Product Selector\n");

		// perform 1 or more selections
		Scanner sc = new Scanner(System.in);
		String choice = "y";
		while(choice.equalsIgnoreCase("y")) {
			System.out.print("Enter product code: ");
			String productCode = sc.next();	// read the product code
			sc.nextLine();	// discard any other data
			
			// get the Product object
			Product p = ProductDB.getProduct(productCode);
			
			// display the output
			System.out.println();
			if(p != null) {
				System.out.println(p);
			} else {
				System.out.println("No product matches this product code.\n");				
			}
			
			// see if the user wants to continue
			System.out.print("Continue? (y/n): ");
			choice = sc.nextLine();
			System.out.println();
		}
	}	

}
