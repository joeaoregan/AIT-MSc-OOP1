/*
 * Joe O'Regan
 * A00258304
 * Methods and Iteration Labs
 * 16/10/2018
 * Ex8
 */
package com.mase.methods;

public class MethodsEx8 {

	public static void main(String[] args) {
		System.out.println("7 squared is " + square(7));
		System.out.println("7.5 squared is " + square(7.5));

	}

	public static int square(int base) {
		return (int) Math.pow(base, 2);
	}

	public static double square(double base) {
		return Math.pow(base, 2);
	}
}
