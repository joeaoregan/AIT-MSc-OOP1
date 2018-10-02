/*
 * Joe O'Regan
 * A00258304
 * 
 * 02/10/2018
 * 
 * Chapter 2 Murach
 * InvoiceAppFormatted.java
 */
package com.ait.wk1;

import java.text.NumberFormat;
import java.util.Scanner;

public class InvoiceAppFormatted {

	public static void main(String[] args) {
		final double SALES_TAX_PCT = .05;
		
		Scanner sc = new Scanner(System.in);
		String choice = "y";
		
		while (choice.equalsIgnoreCase("y")) {
			// get the input from the user
			System.out.print("Enter subtotal:   ");
			double subtotal = sc.nextDouble();
			
			// calculate the results
			double discountPercent = 0.0;
			if (subtotal >= 100)
				discountPercent = .1;
			else
				discountPercent = 0.0;
			
			double discountAmount = subtotal * discountPercent;
			double totalBeforeTax = subtotal - discountAmount;
			double salesTax = totalBeforeTax * SALES_TAX_PCT;
			double total = totalBeforeTax + salesTax;
			
			// format and display the results
			NumberFormat currency = NumberFormat.getCurrencyInstance();
			NumberFormat percent = NumberFormat.getPercentInstance();
			
			String message = "Discount percent: " + 
			percent.format(discountPercent) + 
			"\nDiscount amount:  " + 
			currency.format(discountAmount) +
			"\nTotal before tax: " +
			currency.format(totalBeforeTax) +
			"\nSales tax:        " +
			currency.format(salesTax) +
			"\nInvoice total:    " +
			currency.format(total) + "\n";
			System.out.println(message);
			
			// see if the user wants to continue
			System.out.print("Continue? (y/n): ");
			choice = sc.next();
			System.out.println();
		}
		sc.close();
	}
}
