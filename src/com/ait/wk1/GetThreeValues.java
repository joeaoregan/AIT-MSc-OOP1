package com.ait.wk1;

import java.util.Scanner;

public class GetThreeValues {

	public static void main(String[] args) {
		// create a scanner object
		Scanner sc = new Scanner(System.in);
		
		// read a string
		System.out.print("Enter product code: ");
		String productCode = sc.next();
		
		// read a double value
		System.out.print("Enter price: ");
		double price = sc.nextDouble();
		
		// read an int value
		System.out.print("Enter quantity: ");
		int quantity = sc.nextInt();
		
		// perform a calculation and display the result
		double total = price * quantity;
		System.out.println("\n" + quantity + " " + productCode +
				" @ " + price + " = " + total);
		System.out.println();
		
		sc.close();
	}

}
