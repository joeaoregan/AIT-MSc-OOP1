/*
 * Joe O'Regan
 * A00258304
 * 
 * ThreeValuesFromOneLine.java
 * 
 * Chapter 2 Muroch
 * L2S43
 */
package com.ait.wk1;

import java.util.Scanner;

public class ThreeValuesFromOneLine {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		// read three int values
		System.out.print("Enter three integer values: ");
		int i1 = sc.nextInt();
		int i2 = sc.nextInt();
		int i3 = sc.nextInt();

		// calculate the average and display the result
		int total = i1 + i2 + i3;
		int avg = total / 3;
		System.out.println("Average: " + avg);
		System.out.println();
	}

}
