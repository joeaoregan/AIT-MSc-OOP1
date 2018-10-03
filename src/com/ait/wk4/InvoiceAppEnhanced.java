/*
 * Joe O'Regan
 * A00258304
 * 03/10/2018
 * Chapter 4 Muroch
 * L4S20
 */
package com.ait.wk4;

import java.util.Scanner;

public class InvoiceAppEnhanced {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String choice = "y";
		
		while(!choice.equalsIgnoreCase("n")) {
			// get the input from the user
			System.out.print("Enter customer type (r/c): ");
			String customerType = sc.next();
			System.out.print("Enter subtotal:  ");
			double subtotal = sc.nextDouble();
			
			// get the discount percent
			double discountPercent = 0.0;
			if (customerType.equalsIgnoreCase("R")) {
				if (subtotal < 100)
					discountPercent = 0;
				else if (subtotal >= 100 && subtotal < 250)
					discountPercent = .1;
				else if (subtotal >= 250)
					discountPercent = .2;
			} else if (customerType.equalsIgnoreCase("C")) {
				if (subtotal < 250)
					discountPercent = .2;
				else
					discountPercent = .3;
			} else {
				discountPercent = .1;
			}
			
			// format display calc code >>> here
		}
	}

}
