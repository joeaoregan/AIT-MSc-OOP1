/*
 * Joe O'Regan
 * A00258304
 * Methods and Iteration Labs
 * 16/10/2018
 * Ex7
 */
package com.mase.methods;

import java.util.Scanner;

public class MethodsEx7 {
	private static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
		int total = 0;
		System.out.print("Enter the number of values to be processed: ");
		int values = sc.nextInt();
		for (int i = 0; i < values; i++) {
			System.out.print("Enter a value: ");
			int value = sc.nextInt();
			total += value;
		}
		System.out.println("The sum of the 3 values entered is " + total);
	}

}
