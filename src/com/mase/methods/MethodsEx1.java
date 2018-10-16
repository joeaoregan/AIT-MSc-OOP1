/*
 * Joe O'Regan
 * A00258304
 * Methods and Iteration Labs
 * 16/10/2018
 * Ex1
 */
package com.mase.methods;

import java.util.Scanner;

public class MethodsEx1 {
	
	private static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
		System.out.print("Enter x : ");
		int x = sc.nextInt();
		System.out.print("Enter y : ");
		int y = sc.nextInt();
		System.out.println("The sum of "+x+" and "+y+" is " + (x+y));
		System.out.println("The product of "+x+" and "+y+" is " + (x*y));
		System.out.println("The difference of "+x+" and "+y+" is " + (x-y));
		System.out.println("The quotient of "+x+" and "+y+" is " + (x/y));
	}
}
