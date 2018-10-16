/*
 * Joe O'Regan
 * A00258304
 * Methods and Iteration Labs
 * 16/10/2018
 * Ex5 - Hypotenuse
 */
package com.mase.methods;

import java.util.Scanner;

public class MethodsEx5 {
	private static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
		System.out.print("Enter opposite side --> ");
		int opposite = sc.nextInt();
		System.out.print("Enter adjacent side --> ");
		int adjacent = sc.nextInt();
		
		//double hypotenuse = Math.sqrt(Math.pow(opposite, 2) + Math.pow(adjacent, 2));
		//System.out.println("The length of the hypotenuse is : " + hypotenuse);
		System.out.println("The length of the hypotenuse is : " + calcHypotenuse(opposite, adjacent));
	}

	public static double calcHypotenuse(int opposite, int adjacent) {
		return Math.sqrt(Math.pow(opposite, 2) + Math.pow(adjacent, 2));
	}
}
