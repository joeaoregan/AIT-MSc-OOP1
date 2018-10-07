/*
 * Joe O'Regan
 * A00258304
 * 07/10/2018
 * Week 1 Exercises
 */
package com.ait.wk1;

import java.util.InputMismatchException;
import java.util.Scanner;

public class ExWk1 {
	private static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
		/*
		if (didOswaldActAlone()) {
			System.out.println("Oswald acted alone");
		} else {
			System.out.println("Oswald did not act alone");
		}

		filmRating();
		*/
		String country = swimmerRating();
		System.out.println("main::swimmersCountry is " + country);
	}

	static boolean didOswaldActAlone() {
		System.out.println("Did Oswald Act Alone? ");
		return sc.nextBoolean();
	}

	static void filmRating() {
		System.out.println("Enter film title: ");
		String title = sc.next();
		int rating=12;
		try {
			System.out.println("Enter rating: ");
			rating = sc.nextInt();

		} catch (InputMismatchException e) {
			System.out.println("Error");
		}
		System.out.println("Movie: " + title + " is rated " + rating);
	}

	static String swimmerRating() {
		String name = "";
		try {
			System.out.print("Please enter the swimmers name: ");
			name = sc.nextLine();
			// String test = sc.nextLine();
			System.out.print("Please enter the swimmers rating: ");
			float rating = sc.nextFloat();
			System.out.println("Swimmer is: " + name);
			System.out.println("Swimmer rating is: " + rating);
			
		} catch (InputMismatchException e) {
			System.out.println("Error");
		}
		String country = getSwimmersCountry(name);
		return country;
	}

	static String getSwimmersCountry(String name) {
		System.out.println("Please enter " + name + " country: ");
		return sc.next();
	}
}
