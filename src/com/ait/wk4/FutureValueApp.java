/*
 * Joe O'Regan
 * A00258304
 * 03/10/2018
 * 
 * Chapter4 Muroch
 * L4S30
 */
package com.ait.wk4;

import java.text.NumberFormat;
import java.util.Scanner;

public class FutureValueApp {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String choice = "y";
		while(!choice.equalsIgnoreCase("n")) {
			// get the input from the user
			System.out.print("Enter monthly investment:   ");
			double monthlyInvestment = sc.nextDouble();
			System.out.print("Enter yearly interest rate: ");
			double interestRate = sc.nextDouble();
			System.out.print("Enter number of years:      ");
			int years = sc.nextInt();
			
			// convert yearly to monthly values and initialise future value
			double monthlyInterestRate = interestRate/12/100;
			int months = years * 12;
			double futureValue = 0.0;
			
			// use a for loop to calculate the future value
			for (int i = 1; i <= months; i++) {
				futureValue = (futureValue + monthlyInvestment) * (1 + monthlyInterestRate);
			}
			
			// format and display the result
			NumberFormat currency = 
					NumberFormat.getCurrencyInstance();
			System.out.println("Future value:      " + currency.format(futureValue));
			System.out.println();
			
			// see if the user wants to continue
			System.out.print("Continue? (y/n): ");
			choice = sc.next();
			System.out.println();
		}
	}

}
