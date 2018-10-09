package com.ait.wk2;

import java.util.Scanner;

enum Direction {
	NORTH, SOUTH, EAST, WEST
}

public class MASE_Week2b {
	static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
		ternaryOperator(); // Ex7 (new)
		switchComparison(); // Ex9
		switchVowelOrConsonant(); // Ex10
		switchEnumType(); // Ex13 - hard
	}

	public static void ternaryOperator() {
		boolean isHappy = true;
		String mood = isHappy ? "I’m Happy!" : "I’m Sad!";
		System.out.println(mood);

		int x = 0, y = 0, minVal = 0;
		System.out.print("Enter x : ");
		x = sc.nextInt();
		System.out.print("Enter y : ");
		y = sc.nextInt();

		minVal = x < y ? x : y;
		System.out.println("minVal == " + minVal);

	}

	/*
	 * switchComparison() is refactored to follow Bob Martin's method size
	 * guidelines of < 20 lines of code and if possible < 10 lines of code; how do
	 * you do this - Clean Code p36 "One Level of Abstraction per Method"
	 */
	public static void switchComparison() {
		int x = getInt("Enter x: ");
		int y = getInt("Enter y: ");
		String mathOp = getString("Enter math operation (lt|gt|eq): ");
		evaluateUsingTernary(x, y, mathOp);
	}

	public static int getInt(String prompt) {
		boolean ok = false;
		int inputFromUser = 0;
		while (!ok) {
			System.out.print(prompt);
			if (sc.hasNextInt()) {
				inputFromUser = sc.nextInt();
				ok = true;
			} else {
				System.out.println("Error! Invalid number - try again...");
			}
			sc.nextLine(); // disregard any other data on the line
		}
		return inputFromUser;
	}

	public static String getString(String prompt) {
		System.out.print(prompt);
		return sc.next().toUpperCase();
	}

	// option 1 - using the ternary operator to keep the code brief - more complex
	// than an if-else stmt
	public static void evaluateUsingTernary(int x, int y, String comparisonToBePerformed) {
		// 13 lines of code (excluding comments)
		switch (comparisonToBePerformed) {
		case "LT":
			System.out.println(x < y ? x + " is < than " + y : x + " is not < than " + y);
			break;
		case "GT":
			System.out.println(x < y ? x + " is > than " + y : x + " is not > than " + y);
			break;
		case "EQ":
			System.out.println(x < y ? x + " == " + y : x + " <> " + y);
			break;
		default:
			System.out.println(comparisonToBePerformed + " is not recognised...");
			break;
		}
	}

	// option 2 - using an if-else stmt - extra lines of code - method long by Bob
	// Martin standards
	public static void evaluateUsingIf(int x, int y, String comparisonToBePerformed) {
		// 29 lines of code (excluding comments)
		switch (comparisonToBePerformed) {
		case "LT":
			if (x < y) {
				System.out.println(x + " is < than " + y);
			} else {
				System.out.println(x + " is not < than " + y);
			}
			break;
		case "GT":
			if (x > y) {
				System.out.println(x + " is > than " + y);
			} else {
				System.out.println(x + " is not > than " + y);
			}
			break;
		case "EQ":
			if (x == y) {
				System.out.println(x + " == " + y);
			} else {
				System.out.println(x + " <> " + y);
			}
			break;
		default:
			System.out.println(comparisonToBePerformed + " is not recognised...");
			break;
		}
	}

	public static void switchVowelOrConsonant() {
		System.out.print("Enter a char: ");
		char letter = sc.next().charAt(0);
		switch (letter) {
		// This works! It is however, bad programming practice - put "default" at the
		// end
		default:
			System.out.println(letter + " is a consonant");
			break;
		case 65:
		case 'a':
		case 'E':
		case 'e':
		case 'I':
		case 'i':
		case 'O':
		case 'o':
		case 'U':
		case 'u':
			System.out.println(letter + " is a vowel");
			break;
		}

	}

	public static void switchEnumType() {
		Direction theWay = null;
		System.out.print("Enter direction (n|s|e|w): ");
		String nsew = sc.next().toUpperCase();
		switch (nsew) {
		case "N":
			theWay = Direction.NORTH;
			break;
		case "S":
			theWay = Direction.SOUTH;
			break;
		case "E":
			theWay = Direction.EAST;
			break;
		case "W":
			theWay = Direction.WEST;
			break;
		default:
			System.out.println(nsew + " is not recognised...");
			break;
		}

		switch (theWay) {
		case NORTH:
			System.out.println("Santy...");
			break;
		case SOUTH:
			System.out.println("Penguins...");
			break;
		case EAST:
			System.out.println("The land of the rising sun...");
			break;
		case WEST:
			System.out.println("Hollywood...");
			break;
		}
		// int randomNumber = (int) Math.random() * 4; // 0 always
		// int randomNumber = (int) (Math.random() * 4); // Correct
	}

///////////////////////////////////////////////////////////////////////////////
	///////////////////////////////////////////////////////////////////////////////
	// Extra exercises.
	///////////////////////////////////////////////////////////////////////////////
	///////////////////////////////////////////////////////////////////////////////
	public static void switchDaysInMonth() {
		System.out.print("Enter year  --> ");
		int year = sc.nextInt();
		System.out.print("Enter month (1..12) --> ");
		int month = sc.nextInt();
		int numDays = 0;

		final int JAN = 1;
		final int FEB = 2;
		final int MAR = 3;
		final int APR = 4;
		final int MAY = 5;
		final int JUN = 6;
		final int JUL = 7;
		final int AUG = 8;
		final int SEP = 9;
		final int OCT = 10;
		final int NOV = 11;
		final int DEC = 12;

		switch (month) {
		case JAN:
		case MAR:
		case MAY:
		case JUL:
		case AUG:
		case OCT:
		case DEC:
			numDays = 31;
			break;
		case APR:
		case JUN:
		case SEP:
		case NOV:
			numDays = 30;
			break;
		case FEB:
			if (((year % 4 == 0) && !(year % 100 == 0)) || (year % 400 == 0))
				numDays = 29; // leap year
			else
				numDays = 28;
			break;
		default:
			System.out.println("Invalid month");
			break;
		}

		System.out.println("Number of days is " + numDays);

	}

	public static void switchMathOperation() {
		double answer = 0;
		boolean charOK = true;

		System.out.print("Enter number1: ");
		double num1 = sc.nextDouble();
		System.out.print("Enter number2: ");
		double num2 = sc.nextDouble();

		System.out.print("Enter a char: ");
		char operation = sc.next().charAt(0);
		switch (operation) {
		case '+':
			answer = num1 + num2;
			break;
		case '-':
			answer = num1 - num2;
			break;
		case '*':
			answer = num1 * num2;
			break;
		case '/':
			answer = num1 / num2;
			break;
		default:
			System.out.println("Unknown mathematical operator: " + operation);
			charOK = false;
			break;
		}
		if (charOK)
			System.out.println("The answer is " + answer);

	}

	public static void unindentedIf1() {
		int x = 5;
		int y = 8;

		// Given the following unindented code, use only indentation and braces
		// to get the desired output. Indentation just helps with clarity.
		if (y == 8)
			if (x == 5)
				System.out.println("@@@@@");
			else
				System.out.println("#####");
		System.out.println("$$$$$");
		System.out.println("&&&&&");

		// a. Output required :
		// @@@@@
		// $$$$$
		// &&&&&

		// b. Output required :
		// @@@@@

		// c. Output required :
		// @@@@@
		// &&&&&

		// d. Output required (note: set y to be 7 for this one):
		// #####
		// $$$$$
		// &&&&&
	}

	public static void unindentedIf2() {
		int x = 9, y = 11;
		// Given the following unindented code, use only indentation and {} to get the
		// correct output
		if (x < 10)
			if (y > 10)
				System.out.println("*****");
			else
				System.out.println("#####");
		System.out.println("$$$$$");

		// a. Output required :
		// *****
		// $$$$$

		// b. Output required (set x to 11 and y to 9):
		// #####
		// $$$$$
	}

	public static void ifMonth() {
		int month = 0;

		System.out.print("Enter month (1-12): ");
		try {
			month = sc.nextInt();
			if (month == 1)
				System.out.println("January");
			else if (month == 2)
				System.out.println("February");
			else if (month == 3)
				System.out.println("March");
			else if (month == 4)
				System.out.println("April");
			else if (month == 5)
				System.out.println("May");
			else if (month == 6)
				System.out.println("June");
			else if (month == 7)
				System.out.println("July");
			else if (month == 8)
				System.out.println("August");
			else if (month == 9)
				System.out.println("September");
			else if (month == 10)
				System.out.println("October");
			else if (month == 11)
				System.out.println("November");
			else if (month == 12)
				System.out.println("December");
			else
				System.out.println("Entry is out of range: " + month);
		} catch (Exception e) {
			System.out.println("Exception!");
			e.printStackTrace();
		}

	}

	public static void largerOfTwoNumbers() {
		int x = 0, y = 0;
		try {
			// code to be protected
			System.out.print("Enter first number : ");
			x = sc.nextInt();
			System.out.print("Enter second number : ");
			y = sc.nextInt();

			if (x < 0 || y < 0) { // if either is negative, error
				System.out.println("Negative values are not allowed; " + x + " " + y);
			} else if (x > 0 && y > 0) { // both are positive
				// which of the two is the larger?
				if (x > y)
					System.out.println(x + " is > " + y);
				else if (y > x)
					System.out.println(y + " is > " + x);
				else
					System.out.println(y + " == " + x);
			}
		} catch (Exception e) {
			System.out.println("Exception caught");
			e.printStackTrace();
		}

	}

	public static void ifGrade() {
		int mark = 0;
		System.out.print("Enter mark : ");
		try {
			mark = sc.nextInt();

			if (mark < 0 || mark > 100) {
				System.out.println("Error in input: " + mark + ". Valid values are 0..100");
			} else {
				// valid mark value
				if (mark >= 70 && mark <= 100)
					System.out.println("A");
				else if (mark >= 60 && mark <= 69)
					System.out.println("B");
				else if (mark >= 50 && mark <= 59)
					System.out.println("C");
				else if (mark >= 40 && mark <= 49)
					System.out.println("D");
				else
					System.out.println("Fail");
			}
		} catch (Exception e) {
			System.out.println("Exception caught");
			e.printStackTrace();
		}
	}

	public static void ifUsingLogicalOps() {
		int num1 = 0, num2 = 0, num3 = 0;
		System.out.print("Enter first number : ");
		num1 = sc.nextInt();
		System.out.print("Enter second number : ");
		num2 = sc.nextInt();
		System.out.print("Enter third number : ");
		num3 = sc.nextInt();

		// Largest - assuming that the numbers are distinct
		if (num1 > num2 && num1 > num3)
			System.out.println(num1 + " is the largest number");
		else if (num2 > num3) // cant be num 1, leave num1 out of comparisons
			System.out.println(num2 + " is the largest number");
		else // can be num1 or num2 so must be num3
			System.out.println(num3 + " is the largest number");

// Alternatively, one can explicitly state using &&
//      if (num1 > num2 && num1 > num3)
//			System.out.println(num1 + " is the largest number");
//		else if (num2 > num3 && num2 > num1) 
//			System.out.println(num2 + " is the largest number");
//		else if (num3 > num1 && num3 > num2)
//			System.out.println(num3 + " is the largest number");

		// Smallest
		if (num1 < num2 && num1 < num3)
			System.out.println(num1 + " is the smallest number");
		else if (num2 < num3)
			System.out.println(num2 + " is the smallest number");
		else
			System.out.println(num3 + " is the smallest number");
	}

	public static void ifUsingNestedIfs() {
		int num1 = 0, num2 = 0, num3 = 0;
		System.out.print("Enter first number : ");
		num1 = sc.nextInt();
		System.out.print("Enter second number : ");
		num2 = sc.nextInt();
		System.out.print("Enter third number : ");
		num3 = sc.nextInt();

		// Largest
		if (num1 > num2) { // num1 > num2 => either num1 or num3 is the largest
			if (num1 > num3)
				System.out.println(num1 + " is the largest number");
			else
				System.out.println(num3 + " is the largest number");
		} else { // num2 > num1 => either num2 or num3 is the largest
			if (num2 > num3)
				System.out.println(num2 + " is the largest number");
			else
				System.out.println(num3 + " is the largest number");
		}
		// Smallest
		if (num1 < num2) { // num1 < num2 => either num1 or num3 is the smallest
			if (num1 < num3)
				System.out.println(num1 + " is the smallest number");
			else
				System.out.println(num3 + " is the smallest number");
		} else { // num2 < num1 => either num2 or num3 is the smallest
			if (num2 < num3)
				System.out.println(num2 + " is the smallest number");
			else
				System.out.println(num3 + " is the smallest number");
		}

	}

	public static void ifTemperature() {
		int temperature = 0;
		final int COLD = 0;
		final int MILD = 15;
		final int WARM = 20;
		final int VERY_WARM = 25;
		final int HOT = 30;

		System.out.print("Enter temperature : ");
		try {
			temperature = sc.nextInt();
			if (temperature <= COLD)
				System.out.println("Cold");
			else if (temperature > COLD && temperature < MILD) // 1..14
				System.out.println("a little cold but OK...");
			else if (temperature >= MILD && temperature < WARM) // 15..19
				System.out.println("Mild");
			else if (temperature >= WARM && temperature < VERY_WARM) // 20..24
				System.out.println("Warm");
			else if (temperature >= VERY_WARM && temperature < HOT) // 25..29
				System.out.println("Very warm");
			else if (temperature >= HOT) // 30+
				System.out.println("Hot");
		} catch (Exception e) {
			System.out.println("Exception caught...");
		}
	}

	public static void switchSquareOrCube() {
		System.out.print("Enter a number (1..10): ");
		int n = sc.nextInt();
		switch (n) {
		case 2:
		case 4:
		case 6:
		case 8:
		case 10:
			System.out.println(n + " squared is " + (n * n));
			break;
		case 1:
		case 3:
		case 5:
		case 7:
		case 9:
			System.out.println(n + " cubed is " + (n * n * n));
			break;
		default:
			System.out.println(n + " is out of range 1..10");
			break;
		}

	}
}
