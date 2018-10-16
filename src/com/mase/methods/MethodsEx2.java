/*
 * Joe O'Regan
 * A00258304
 * Methods and Iteration Labs
 * 16/10/2018
 * Ex2
 */
package com.mase.methods;

import java.util.Scanner;

public class MethodsEx2 {
	private static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
		System.out.print("Enter length : ");
		int length = sc.nextInt();
		System.out.print("Enter width : ");
		int width = sc.nextInt();
		System.out.print("Enter height : ");
		int height = sc.nextInt();
		
		System.out.println("The volume is " + (length*width*height));
	}

}
