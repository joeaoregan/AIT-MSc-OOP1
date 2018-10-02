/*
 * Joe O'Regan
 * A00258304
 * 
 * WhileLoop.java
 */
package com.ait.wk1;

import java.util.Scanner;

public class whileLoop {

	public static void main(String[] args) {
		String choice = "y";
		while (choice.equalsIgnoreCase("y")) {
			// get the invoice subtotal from the user
			Scanner sc = new Scanner(System.in);
			System.out.print("Enter subtotal:  ");
			double subtotal = sc.nextDouble();
			
			// the code that processes the user's entry goes here
			
			// see if the user wants to continue
			System.out.print("Continue? (y/n): ");
			choice = sc.next();
			System.out.println();
		}
	}

}
