/*
 * Joe O'Regan
 * A00258304
 * 
 * 02/10/2018
 * 
 * Chapter 2 Murach
 * InvoiceAppBigDecimal.java
 */
package com.ait.wk1;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.text.NumberFormat;
import java.util.Scanner;

public class InvoiceAppBigDecimal {

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

			//double discountAmount = subtotal * discountPercent;
			//double totalBeforeTax = subtotal - discountAmount;
			//double salesTax = totalBeforeTax * SALES_TAX_PCT;
			//double total = totalBeforeTax + salesTax;

			// format and display the results
			NumberFormat currency = NumberFormat.getCurrencyInstance();
			NumberFormat percent = NumberFormat.getPercentInstance();
			
//			String message = "Discount percent: " + percent.format(discountPercent) + "\nDiscount amount:  "
//					+ currency.format(discountAmount) + "\nTotal before tax: " + currency.format(totalBeforeTax)
//					+ "\nSales tax:        " + currency.format(salesTax) + "\nInvoice total:    "
//					+ currency.format(total) + "\n";
//			System.out.println(message);
			
			

			// convert subtotal and discount percent to BigDecimal
			BigDecimal decimalSubtotal = new BigDecimal(Double.toString(subtotal));
			decimalSubtotal = decimalSubtotal.setScale(2, RoundingMode.HALF_UP);
			BigDecimal decimalDiscountPercent = new BigDecimal(Double.toString(discountPercent));

			// calculate discount amount
			BigDecimal discountAmount = decimalSubtotal.multiply(decimalDiscountPercent);
			discountAmount = discountAmount.setScale(2, RoundingMode.HALF_UP);

			// calculate total before tax, sales tax, and total
			BigDecimal totalBeforeTax = decimalSubtotal.subtract(discountAmount);
			BigDecimal salesTaxPercent = new BigDecimal(SALES_TAX_PCT);
			BigDecimal salesTax = salesTaxPercent.multiply(totalBeforeTax);
			salesTax = salesTax.setScale(2, RoundingMode.HALF_UP);
			BigDecimal total = totalBeforeTax.add(salesTax);
	
			String message = "Discount percent: " + percent.format(discountPercent) + "\nDiscount amount:  "
				+ currency.format(discountAmount) + "\nTotal before tax: " + currency.format(totalBeforeTax)
				+ "\nSales tax:        " + currency.format(salesTax) + "\nInvoice total:    "
				+ currency.format(total) + "\n";
			System.out.println(message);
	
			
			String debugMessage = "\nUNFORMATTED RESULTS\n" +
					"Discount percent: " + discountPercent + 
					"\nDiscount amount:  " + discountAmount +
					"\nTotal before tax: " + totalBeforeTax +
					"\nSales tax:        " + salesTax +
					"\nInvoice total:    " + total + "\n";
			System.out.println(debugMessage);
			
			// see if the user wants to continue
			System.out.print("Continue? (y/n): ");
			choice = sc.next();
			System.out.println();
		}
		sc.close();
	}
}
