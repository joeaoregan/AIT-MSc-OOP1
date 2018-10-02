/*
 * Joe O'Regan
 * A00258304
 * 
 * InvoiceApp.java
 * 
 * Chapter 2 Muroch
 * L2S54-56
 */
package com.ait.wk1;

import java.util.Scanner;

public class InvoiceApp {

	public static void main(String[] args) {
		System.out.println("Welcome to the Invoice Total Calculator");
		System.out.println();	// print a blank line
		
		Scanner sc = new Scanner(System.in);
		
		// perform invoice calculatins until choice ins't equal to "y" or "Y"
		String choice = "y";
		while (choice.equalsIgnoreCase("y")) {
			// get the invoice subtotal from the user
			System.out.print("Enter subtotal:  ");
			double subtotal = sc.nextDouble();
			
			// calculate the discount amount and total 
			double discountPercent = 0.0;
			if (subtotal >= 200)
				discountPercent = .2;
			else if (subtotal >= 100)
				discountPercent = .1;
			else
				discountPercent = 0.0;
			
			double discountAmount = subtotal * discountPercent;
			double total = subtotal - discountAmount;
			
			// display the discount amount and total
			String message = "Discount percent: " + discountPercent
					+ "\nDiscount amount:  " + discountAmount +
					"\nInvoice total:  " + total + "\n";
			System.out.println(message);
			
			// see if the user wants to continue
			System.out.print("Continue? (y/n): ");
			choice = sc.next();
			System.out.println();
		}
		sc.close();
	}

}
