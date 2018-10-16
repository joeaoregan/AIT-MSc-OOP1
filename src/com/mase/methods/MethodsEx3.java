/*
 * Joe O'Regan
 * A00258304
 * Methods and Iteration Labs
 * 16/10/2018
 * Ex3
 */
package com.mase.methods;

import java.util.Scanner;

public class MethodsEx3 {
	private static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
		carPark();
	}

	public static void carPark() {
		System.out.print("How many cars --> ");
		int numCars = sc.nextInt();
		for (int i = 1; i <= numCars; i++) {
			System.out.print("How many hours was car parked for? -->");
			double hours = sc.nextDouble();
			System.out.println("Car # " + i + " was parked for " + hours + " hour(s), and charged "
					+ calculateCharges(hours) + " Euro");
		}
	}

	public static double calculateCharges(double hours) {
		hours = Math.ceil(hours);
		if (hours <= 1) {
			return 0.0;
		} else if (hours >= 8)
			return 21.0;
		return hours * 3;
	}
}
