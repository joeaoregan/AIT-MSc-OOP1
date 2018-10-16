/*
 * Joe O'Regan
 * A00258304
 * Methods and Iteration Labs
 * 16/10/2018
 * Ex4: distance between points, midpoint, slope
 */
package com.mase.methods;

import java.util.Scanner;

public class MethodsEx4 {
	private static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
		coordGeometry();
	}

	public static void coordGeometry() {
		System.out.print("Please enter x1 --> ");
		int x1 = sc.nextInt();
		System.out.print("Please enter y1 --> ");
		int y1 = sc.nextInt();
		System.out.print("Please enter x2 --> ");
		int x2 = sc.nextInt();
		System.out.print("Please enter y2 --> ");
		int y2 = sc.nextInt();

		double distance = Math.sqrt(Math.pow((x2 - x1), 2) + Math.pow((y2 - y1), 2));
		double slope = (y1 - y2) / (x1 - x2);
		double midx = (x1 + x2) / 2.0;
		double midy = (y1 + y2) / 2.0;
		System.out.println("Distance between the two pionts is : " + distance);
		System.out.println("\nCoordinates of the midpoint are (" + midx + "," + midy + ")");
		System.out.println("\nThe slope is : " + slope);
	}
}
