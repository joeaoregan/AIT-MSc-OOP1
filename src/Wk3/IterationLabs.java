/*
 * Joe O'Regan
 * A00258304
 * 25/09/2018
 */

package Wk3;

import java.util.InputMismatchException;
import java.util.Scanner;

public class IterationLabs {
	private static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
		loopExercises();

	}

	public static void loopExercises() {
		// whileLoop1();
		// whileLoop2();
		// whileLoop3();
		// doWhileLoop1();
		// doWhileLoop2();
		// doWhileLoop3();
		// forLoop1();
		// forLoop2();
		// forLoop3();
		histogram();
	}

	public static void whileLoop1() {
		int i = 1, total = 0;
		while (i < 6) {
			total += i;
			System.out.println("Loop1:i == " + i);
			i++;
		}
		System.out.println("Loop1: Total == " + total);

		i = 1;
		total = 0;

		try {
			System.out.print("Enter increment amount? ");
			int incrementValue = sc.nextInt();

			while (i < 6) {
				System.out.println("Loop2:i == " + i);
				total += i;
				i += incrementValue;
			}
			System.out.println("Loop2: Total == " + total);
		} catch (Exception e) {
			System.out.println("Caught exception");
		}
	}

	public static void whileLoop2() {
		int i = 5, total = 0;
		while (i > 0) {
			total += i;
			i--;
		}
		System.out.println("Total == " + total);

		try {
			System.out.print("Enter increment amount? ");
			int decrementValue = sc.nextInt();
			total = 0;
			i = 5;
			while (i >= 0) {
				System.out.println("i == " + i);
				total += i;
				i -= decrementValue;
			}
			System.out.println("Total == " + total);
		} catch (Exception e) {
			System.out.println("Caught exception");
		}
	}

	public static void whileLoop3() {
		int number = 0, total = 0;
		while (number >= 0) {
			System.out.print("Enter a number (-1 to exit) --> ");
			number = sc.nextInt();
			if (number > 0) {
				total += number;
			}
		}
		System.out.println("Sum is " + total);

		try {
			total = 0;
			while (true) {
				System.out.print("Enter a number (-1 to exit) --> ");
				number = sc.nextInt();
				if (number < 0) {
					break;
				} else {
					total += number;
				}
			}
			System.out.println("Sum is " + total);
		} catch (Exception e) {
			System.out.println("Caught exception");
		}
	}

	public static void doWhileLoop1() {
		int i = 1, total = 0;
		do {
			total += i;
			System.out.println("Loop1:i == " + i);
			i++;
		} while (i < 6);

		System.out.println("Loop1: Total == " + total);

		i = 1;
		total = 0;

		try {
			System.out.print("Enter increment amount? ");
			int incrementValue = sc.nextInt();
			do {
				System.out.println("Loop2:i == " + i);
				total += i;
				i += incrementValue;
			} while (i < 6);
			System.out.println("Loop2: Total == " + total);
		} catch (Exception e) {
			System.out.println("Caught exception");
		}
	}

	public static void doWhileLoop2() {
		int i = 5, total = 0;
		do {
			total += i;
			i--;
		} while (i > 0);
		System.out.println("Total == " + total);

		try {
			System.out.print("Enter increment amount? ");
			int decrementValue = sc.nextInt();
			total = 0;
			i = 5;

			do {
				System.out.println("i == " + i);
				total += i;
				i -= decrementValue;
			} while (i > 0);
			System.out.println("Total == " + total);
		} catch (Exception e) {
			System.out.println("Caught exception");
		}
	}

	public static void doWhileLoop3() {
		int number = 0, total = 0;
		do {
			System.out.print("Enter a number (-1 to exit) --> ");
			number = sc.nextInt();
			if (number > 0) {
				total += number;
			}
		} while (number >= 0);
		System.out.println("Sum is " + total);

		total = 0;

		try {
			do {
				System.out.print("Enter a number (-1 to exit) --> ");
				number = sc.nextInt();
				if (number < 0) {
					break;
				} else {
					total += number;
				}
			} while (true);
			System.out.println("Sum is " + total);
		} catch (Exception e) {
			System.out.println("Caught exception");
		}
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
		int total = 0;
		
		try {
			for (;;) {
				System.out.print("Enter a number (-1 to exit) --> ");
				int number = sc.nextInt();
				if (number < 0) {
					break;
				} else {
					total += number;
				}
			}
			System.out.println("Total is " + total);
		} catch (InputMismatchException e) {
			System.out.println("Input Exception" + e);
		}
	}

	public static void histogram() {
		try {
			System.out.print("Enter number of rows --> ");
			int rows = sc.nextInt();
			System.out.print("Enter number of columns --> ");
			int cols = sc.nextInt();
			System.out.println("Using for loops:");

			for (int i = 0; i < rows; i++) {
				for (int j = 0; j < cols; j++) {
					System.out.print("*");
				}
				System.out.println();
			}

			System.out.println("\nUsing while loops:");
			int i = 0, j = 0;
			while (i < rows) {
				while (j < cols) {
					System.out.print("*");
					j++;
				}

				System.out.println();
				j = 0;
				i++;
			}
		} catch (Exception e) {
			System.out.println("Caught exception");
		}
	}
}
