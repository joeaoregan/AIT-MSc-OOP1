/*
 * Joe O'Regan
 * A00258304
 * Methods and Iteration Labs
 * 16/10/2018
 * Loops Ex 1 to 10
 */
package com.mase.methods;

import java.util.InputMismatchException;
import java.util.Scanner;

public class LoopsEx1To10 {
	private static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
		// whileLoop1();
		// whileLoop2();
		// whileLoop3();
		// doWhileLoop1();
		// doWhileLoop2();
		// doWhileLoop3();
		// forLoop1();
		//forLoop2();
		//forLoop3();
		histogram();
	}

	public static void whileLoop1() {
		try {
			int i = 1;
			int total = 0;
			while (i <= 5) {
				System.out.println("Loop1:i == " + i);
				total += i;
				i++;
			}
			System.out.println("Loop1: Total == " + total);

			i = 1;
			total = 0;

			System.out.print("Enter increment amount? ");
			int incrementAmount = sc.nextInt();

			while (i <= 5) {
				System.out.println("Loop2:i == " + i);
				total += i;
				i += incrementAmount;
			}
			System.out.println("Loop2: Total == " + total);
		} catch (InputMismatchException e) {
			System.out.println("input exception");
		}
	}

	public static void whileLoop2() {
		int total = 0;
		int i = 1;
		while (i <= 5) {
			total += i;
			i++;
		}
		System.out.println("Total == " + total);

		total = 0;
		i = 5;

		System.out.print("Enter decrement amount? ");
		int decrementAmount = sc.nextInt();

		while (i > 0) {
			total += i;
			System.out.println("i == " + i);
			i -= decrementAmount;
		}
		System.out.println("Total == " + total);
	}

	public static void whileLoop3() {
		int number = 0;
		int total = 0;
		while (number >= 0) {
			System.out.print("Enter a number (-1 to exit) --> ");
			number = sc.nextInt();
			if (number > 0)
				total += number;
		}
		System.out.println("Sum is " + total);
	}

	public static void doWhileLoop1() {
		try {
			int i = 1;
			int total = 0;
			do {
				System.out.println("Loop1:i == " + i);
				total += i;
				i++;
			} while (i <= 5);

			System.out.println("Loop1: Total == " + total);

			i = 1;
			total = 0;

			System.out.print("Enter increment amount? ");
			int incrementAmount = sc.nextInt();

			do {
				System.out.println("Loop2:i == " + i);
				total += i;
				i += incrementAmount;
			} while (i <= 5);
			System.out.println("Loop2: Total == " + total);
		} catch (InputMismatchException e) {
			System.out.println("input exception");
		}
	}

	public static void doWhileLoop2() {
		int total = 0;
		int i = 1;
		do {
			total += i;
			i++;
		} while (i <= 5);
		System.out.println("Total == " + total);

		total = 0;
		i = 5;

		System.out.print("Enter decrement amount? ");
		int decrementAmount = sc.nextInt();

		do {
			total += i;
			System.out.println("i == " + i);
			i -= decrementAmount;
		} while (i > 0);

		System.out.println("Total == " + total);
	}

	public static void doWhileLoop3() {
		int number = 0;
		int total = 0;
		do {
			System.out.print("Enter a number (-1 to exit) --> ");
			number = sc.nextInt();
			if (number > 0)
				total += number;
		} while (number >= 0);

		System.out.println("Sum is " + total);
	}

	public static void forLoop1() {
		int total = 0;
		for (int i = 1; i <= 20; i++) {
			total += i;
		}
		System.out.println("Total is " + total);

		total = 0;

		for (int i = 5; i <= 20; i += 5) {
			total += i;
		}
		System.out.println("Total is " + total);
	}

	public static void forLoop2() {
		int total = 0;
		for (int i = 40; i >= 30; i--) {
			total += i;
		}
		System.out.println("Total is " + total);

		total = 0;

		for (int i = 40; i >= 30; i -= 5) {
			total += i;
		}
		System.out.println("Total is " + total);
	}

	public static void forLoop3() {
		try {
			int total = 0;
			for (;;) {
				System.out.print("Enter a number (-1 to exit) --> ");
				int number = sc.nextInt();
				
				if (number == -1) {
					break;
				} else {
					total += number;
				}
			}
			
			System.out.println("Total is " + total);
		} catch (InputMismatchException e) {
			System.out.println("input mismatch exception");
		}
	}
	
	public static void histogram() {
		System.out.print("Enter number of rows --> ");
		int rows = sc.nextInt();
		System.out.print("Enter number of columns --> ");
		int columns = sc.nextInt();
		
		System.out.println("Using for loops:");
		for (int i = 0; i < rows; i++) {
			for (int j = 0; j < columns; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
		
		System.out.println("\nUsing while loops:");
		int i = 0;
		while(i < rows) {
			int j = 0;
			while (j < columns) {
				System.out.print("*");
				j++;
			}
			System.out.println();
			i++;
		}
	}
}
