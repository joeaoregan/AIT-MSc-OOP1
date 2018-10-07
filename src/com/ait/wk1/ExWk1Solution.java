/*
 * Solution to week 1 exercises
 */
package com.ait.wk1;

import java.util.InputMismatchException;
import java.util.Scanner;

public class ExWk1Solution {

	static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
		// 1
//			if(didOswaldActAlone())
//				System.out.println("Oswald acted alone...");
//			else
//				System.out.println("Oswald did not act alone...");
		// 2
//			filmRating();
		// 3,4
		String swimmersCountry = swimmerRating();
		System.out.println("main::swimmersCountry is " + swimmersCountry);
	}

	public static boolean didOswaldActAlone() {
		System.out.print("Did Oswald act alone? ");
		return sc.nextBoolean();
	}

	public static void filmRating() {
		String filmName = "";
		int filmRating = 0;

		System.out.print("Please enter a film: ");
		filmName = sc.next();
		System.out.print("Please enter " + filmName + "'s rating: ");
		try {
			filmRating = sc.nextInt();
		} catch (InputMismatchException e) {
			System.out.println("Exception caught... ");
		}

		System.out.println("Film is: " + filmName);
		System.out.println("Film rating is: " + filmRating);
	}

	public static String swimmerRating() {
		String swimmersName = "", swimmersCountry = "error";
		double swimmersRating = 0;

		System.out.print("Please enter the swimmers name: ");
		swimmersName = sc.nextLine();
		System.out.print("Please enter the swimmers rating: ");
		if (sc.hasNextDouble()) {
			swimmersRating = sc.nextDouble();
			// sc.nextLine(); // to clear out the CR
			System.out.println("Swimmer is: " + swimmersName);
			System.out.println("Swimmer rating is: " + swimmersRating);

			swimmersCountry = getSwimmersCountry(swimmersName);
		} else {
			System.out.println("Invalid input... ");
		}
		// this code is executed regardless of whether an exception occurs or not...
		// thus, if an exception occurs, "error" will be returned
		return swimmersCountry;

	}

	public static String getSwimmersCountry(String swimmersName) {
		System.out.print("Please enter " + swimmersName + " country: ");
//			return sc.nextLine();
		return sc.next();
	}

}
