/*
 * Joe O'Regan
 * A00258304
 * Methods and Iteration Labs
 * 16/10/2018
 * Ex6 - int power of
 */
package com.mase.methods;

import java.util.Scanner;

public class MethodsEx6 {
	private static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
		System.out.print("Enter the base     --> ");
		int base = sc.nextInt();
		System.out.print("Enter the exponent --> ");
		int exponent = sc.nextInt();
		
		System.out.println(base + " to the power of " + exponent + " is " + intPower(base,exponent));
	}
	public static int intPower(int base, int exponent) {
		return (int) Math.pow(base, exponent);
	}
}
