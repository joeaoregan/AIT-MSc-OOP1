/*
 * Joe O'Regan
 * A00258304
 * 
 * Chapter 2 Muroch
 * L2S58
 */
package com.ait.wk1;

import java.util.Scanner;

public class TestScoreApp {

	public static void main(String[] args) {
		System.out.println("Please enter test scores that range from 0 to 100.");
		System.out.println("To end the program enter 999.");
		System.out.println();

		// initialise variables and create a Scanner object
		double scoreTotal = 0.0;
		int scoreCount = 0;
		int testScore = 0;
		Scanner sc = new Scanner(System.in);

		// get a series of test scores from the user
		while (testScore <= 100) {
			// get the input from the user
			System.out.print("Enter score: ");
			testScore = sc.nextInt();

			// accumulate score count and score total
			if (testScore <= 100) {
				scoreCount += 1;
				scoreTotal += testScore;
			}
		}

		// display the score count, score total, and average score
		double averageScore = scoreTotal / scoreCount;
		String message = "\nScore count:  " + scoreCount + "\nScore total:  " + scoreTotal + "\nAverage score: "
				+ averageScore + "\n";
		System.out.println(message);
		
		sc.close();
	}

}
