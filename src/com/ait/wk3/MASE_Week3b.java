package com.ait.wk3;

import java.util.InputMismatchException;
import java.util.Scanner;

public class MASE_Week3b {
	static Scanner sc = new Scanner(System.in);

	// Note: order is static and public is irrelevant!
	static public void main(String[] args) {
		methodExercises();
//		loopExercises();
	}

	static public void loopExercises() {
		// whileLoop1(); // Ex1
		// whileLoop2(); // Ex2
		// whileLoop3(); // Ex3
		// doWhileLoop1(); // Ex4
		// doWhileLoop2(); // Ex5
		// doWhileLoop3(); // Ex6
		// forLoop1(); // Ex7
		// forLoop2(); // Ex8
		// forLoop3(); // Ex9
		histogram(); // Ex10
	}

	static public void whileLoop1() {
		int i = 1, n = 5, total = 0;// must init total to 0
		while (i <= n) {
			System.out.println("Loop1:i == " + i);
			total += i; // <==> total = total + i;
			i++;
		}
		System.out.println("Loop1: Total == " + total);

		// get the user to specify the increment value
		i = 1; // reset i back to 1 (it is equal to 'n' after previous loop)
		total = 0; // reset total back to 0
		System.out.print("Enter increment amount? ");
		try {
			int incrAmount = sc.nextInt();
			while (i <= n) {
				System.out.println("Loop2:i == " + i);
				total += i; // <==> total = total + i;
				i += incrAmount;
			}
			System.out.println("Loop2:Total == " + total);
		} catch (Exception e) {
			System.out.println("Caught exception!");
		}

	}

	static public void whileLoop2() {
		int i = 5, n = 1, total = 0;// must init total to 0
		while (i >= n) {
			total += i; // <==> total = total + i;
			i--;
		}
		System.out.println("Total == " + total);

		// get the user to specify the decrement value
		i = 5; // reset i back to 5 (it is equal to 'n' after previous loop)
		total = 0; // reset total back to 0
		System.out.print("Enter decrement amount? ");

		try {
			int decrAmount = sc.nextInt();
			while (i >= n) {
				System.out.println("i == " + i);
				total += i; // <==> total = total + i;
				i -= decrAmount;
			}
			System.out.println("Total == " + total);
		} catch (InputMismatchException e) {
			System.out.println("Caught exception!");
		}

	}

	static public void whileLoop3() {
		int sum = 0, number = 0;

		// Version 1
		try {
			System.out.print("Enter a number (< 0 to exit) --> ");
			number = sc.nextInt();

			while (number >= 0) {
				sum += number;
				System.out.print("Enter a number (< 0 to exit) --> ");
				number = sc.nextInt();
			}

			System.out.println("Sum is " + sum);
		} catch (InputMismatchException e) {
			System.out.println("Caught exception!");
//			e.printStackTrace();
		}

		// Version 2
		sum = 0; // reset "sum"
		try {
			while (true) {
				System.out.print("Enter a number (< 0 to exit) --> ");
				number = sc.nextInt();
				if (number < 0)
					break;
				else
					sum += number;
			}
			System.out.println("Sum is " + sum);
		} catch (InputMismatchException e) {
			System.out.println("Caught exception!");
//			e.printStackTrace();
		}
	}

	static public void doWhileLoop1() {
		int i = 1, n = 5, total = 0;// must init total to 0
		do {
			total += i; // <==> total = total + i;
			i++;
		} while (i <= n);
		System.out.println("Total == " + total);

		// get the user to specify the increment value
		i = 1; // reset i back to 1 (it is equal to 'n' after previous loop)
		total = 0; // reset total back to 0
		System.out.print("Enter increment amount? ");

		try {
			int incrAmount = sc.nextInt();
			do {
				System.out.println("i == " + i);
				total += i; // <==> total = total + i;
				i += incrAmount;
			} while (i <= n);
			System.out.println("Total == " + total);
		} catch (Exception e) {
			System.out.println("Caught exception!");
		}

	}

	static public void doWhileLoop2() {
		int i = 5, n = 1, total = 0;// must init total to 0
		do {
			total += i; // <==> total = total + i;
			i--;
		} while (i >= n);
		System.out.println("Total == " + total);

		// get the user to specify the decrement value
		i = 5; // reset i back to 5 (it is equal to 'n' after previous loop)
		total = 0; // reset total back to 0
		System.out.print("Enter decrement amount? ");
		try {
			int decrAmount = sc.nextInt();
			do {
				System.out.println("i == " + i);
				total += i; // <==> total = total + i;
				i -= decrAmount;
			} while (i >= n);
			System.out.println("Total == " + total);
		} catch (InputMismatchException e) {
			System.out.println("Caught exception!");
		}

	}

	static public void doWhileLoop3() {
		int sum = 0, number = 0;
		/*
		 * // Version 1 - bug Enter a number (-1 to exit) --> -1 Enter a number (-1 to
		 * exit) --> -1 Sum is -1
		 * 
		 * // Version 2 - ok Enter a number (-1 to exit) --> -1 Sum is 0
		 * 
		 */

		// Version 1
		try {
			System.out.print("Enter a number --> ");
			number = sc.nextInt();

			do {
				sum += number;
				System.out.print("Enter a number (negative to exit) --> ");
				number = sc.nextInt();
			} while (number >= 0);

			System.out.println("Sum is " + sum);
		} catch (InputMismatchException e) {
			System.out.println("Caught exception!");
//			e.printStackTrace();
		}

		// Version 2
		sum = 0; // reset "sum"
		try {
			do {
				System.out.print("Enter a number (negative to exit) --> ");
				number = sc.nextInt();
				if (number < 0)
					break;
				else
					sum += number;
			} while (true);
			System.out.println("Sum is " + sum);
		} catch (InputMismatchException e) {
			System.out.println("Caught exception!");
//			e.printStackTrace();
		}
	}

	static public void forLoop1() {
		int total = 0;
		for (int i = 1; i <= 20; i++)
			total += i;
		System.out.println("Total is " + total); // total = 210

		total = 0; // reset
		for (int i = 5; i <= 20; i += 5)
			total += i;
		System.out.println("Total is " + total); // total = 50

	}

	static public void forLoop2() {
		int total = 0;
		for (int i = 40; i >= 30; i--)
			total += i;
		System.out.println("Total is " + total); // total = 385

		total = 0; // reset
		for (int i = 40; i >= 30; i -= 5)
			total += i;
		System.out.println("Total is " + total); // total = 105

	}

	static public void forLoop3() {
		int total = 0, n; // no error for 'n' not being initialised
		try {
			for (;;) {
				System.out.print("Enter a number (-1 to exit) --> ");
				n = sc.nextInt();
				if (n == -1)
					break;
				else
					total += n;
			}
		} catch (InputMismatchException e) {
			System.out.println("Caught exception!");
		}
		System.out.println("Total is " + total);

	}

	static public void histogram() {
		try {
			System.out.print("Enter number of rows --> ");
			int rows = sc.nextInt();
			System.out.print("Enter number of columns --> ");
			int cols = sc.nextInt();

			// for version
			System.out.println("Using for loops:");
			for (int i = 1; i <= rows; i++) {
				for (int j = 1; j <= cols; j++) {
					System.out.print("*");
				}
				System.out.println(); // goto next line
			}

			// while version
			int i = 1;
			System.out.println("\nUsing while loops:");
			while (i <= rows) {
				int j = 1;
				while (j <= cols) {
					System.out.print("*");
					j++;
				}
				System.out.println("");
				i++;
			}
		} catch (InputMismatchException e) {
			System.out.println("Caught exception!");
		}
	}

	static public void methodExercises() {
		// Exercise 1
		System.out.print("Enter x : ");
		int x = sc.nextInt();
		System.out.print("Enter y : ");
		int y = sc.nextInt();
		int sum = calculateSum(x, y);
		System.out.println("The sum of " + x + " and " + y + " is " + sum);
		int product = calculateProduct(x, y);
		System.out.println("The product of " + x + " and " + y + " is " + product);
		int difference = calculateDifference(x, y);
		System.out.println("The difference of " + x + " and " + y + " is " + difference);
		int quotient = calculateQuotient(x, y);
		System.out.println("The quotient of " + x + " and " + y + " is " + quotient);

		// Exercise 2 - passing args to a method
		System.out.print("Enter length : ");
		int length = sc.nextInt();
		System.out.print("Enter width : ");
		int width = sc.nextInt();
		System.out.print("Enter height : ");
		int height = sc.nextInt();

		int volume = calcVolume(length, width, height);
		System.out.println("The volume is " + volume);

		// Exercise 2b - same as 1 except using method overloading and
		// the user input is executed inside calcVolume() as opposed to main()
		System.out.println("The volume is " + calcVolume()); // method overloading (number of args different)

		carPark(); // Ex3
		coordGeometry(); // Ex4

		// Exercise 5 - see http://www.mathsisfun.com/definitions/hypotenuse.html
		System.out.print("Enter opposite side --> ");
		double opposite = sc.nextDouble();
		System.out.print("Enter adjacent side --> ");
		double adjacent = sc.nextDouble();

		double hypotenuse = calcHypotenuse(opposite, adjacent);
		System.out.println("The length of the hypotenuse is : " + hypotenuse);

		// Exercise 6
		int base = 0, exp = 0;

		System.out.print("Enter the base     --> ");
		base = sc.nextInt();
		System.out.print("Enter the exponent     --> ");
		exp = sc.nextInt();

		System.out.println(base + " to the power of " + exp + " is " + intPower(base, exp));

		// Exercise 7
		int n = 0;

		System.out.print("Enter the number of values to be processed: ");
		n = sc.nextInt();
		sum = sumTheValues(n); // reuse 'sum' which is declared earlier

		System.out.println("The sum of the " + n + " values entered is " + sum);

		// Exercise 8
		System.out.println("The square of integer 7 is " + square(7));
		System.out.println("The square of double 7.5 is " + square(7.5));

		// Exercise 9 - calling a non-static method from within a static method
		// The following method call generates an error:
		// "Cannot make a static reference to the non-static method
		// addNumbers(int, int) from the type MASE_Week3"
//		int sum = addNumbers(2,3);

		MASE_Week3 week3 = new MASE_Week3();
		// Calling a non-static method from within a static context using an object...
		sum = week3.addNumbers(2, 3);// addNumbers is non-static
		System.out.println("The sum is " + sum);

		// Calling a static method using an object...
		volume = week3.calcVolume(2, 3, 4);
		System.out.println("The volume is " + volume);

		// Calling a static method using the class name...
		volume = MASE_Week3.calcVolume(2, 3, 4);
		System.out.println("The volume is " + volume);
	}

	public static int calculateSum(int x, int y) {
		return x + y;
	}

	public static int calculateProduct(int x, int y) {
		return x * y;
	}

	public static int calculateDifference(int x, int y) {
		return x - y;
	}

	public static int calculateQuotient(int x, int y) {
		return x / y;
	}

	public static int calcVolume(int l, int w, int h) {
		int volume = l * w * h;
		return volume;
	}

	public static int calcVolume() {
		System.out.print("Enter length : ");
		int length = sc.nextInt();
		System.out.print("Enter width : ");
		int width = sc.nextInt();
		System.out.print("Enter height : ");
		int height = sc.nextInt();

		return length * width * height;
	}

	public static void carPark() {
		double charge = 0, parkingTime = 0;

		System.out.print("How many cars --> ");
		int numCars = sc.nextInt();

		for (int car = 1; car <= numCars; car++) {
			System.out.print("How many hours was cark parked for? -->");
			parkingTime = sc.nextDouble();
			charge = calculateCharges(parkingTime);
			System.out.println(
					"Car # " + car + " was parked for " + parkingTime + " hour(s), and charged " + charge + " Euro");
		}
	}

	public static double calculateCharges(double parkTime) {
		// First hour is free
		// Anything >= 8 hours is 21 euro:
		// if parktime = 7.9 (note: first hour is free)
// 		then Math.ceil(7.9 - 1) = Math.ceil(6.9) = 7 and 7 * 3 = 21
		// Each hour in between is charged at 3 euros/hour; if over an hour
		// you are charged a full hour.
		final int MAX_CHARGE = 21, MIN_CHARGE = 0;
		final int MAX_TIME = 8, MIN_TIME = 1, HOURLY_FEE = 3;
		double extraCharge = 0, extraTime = 0, totalCharge = 0;

		if (parkTime >= MAX_TIME)
			// If parked there for >= 8 hours then the charge is 21 Euro
			totalCharge = MAX_CHARGE;
		else if (parkTime <= MIN_TIME)
			// No charge for the first hour
			// NB: Even though there is no charge for the first hour,
// this could change and if it did (to e.g. 2 euros) then all that 
// would need to change is the constant because I have
			// used a constant throughout (even though it currently represents 0)!
			totalCharge = MIN_CHARGE;
		else {
			// parkTime is > 1 and < 8; thus we must calculate the extra to be added
			// to the minimum charge
			extraTime = Math.ceil(parkTime - MIN_TIME);// get next largest integer
			System.out.println("extraTime == " + extraTime);
			extraCharge = extraTime * HOURLY_FEE; // 3 euros/hour
			totalCharge = MIN_CHARGE + extraCharge;
		}
		return totalCharge;
	}

	public static void coordGeometry() {
		// Declare variables
		double x1 = 0, y1 = 0, x2 = 0, y2 = 0;
		double d = 0, m = 0, midX = 0, midY = 0;

		// Get the coordinates
		System.out.print("Please enter x1 --> ");
		x1 = sc.nextDouble();
		System.out.print("Please enter y1 --> ");
		y1 = sc.nextDouble();
		System.out.print("Please enter x2 --> ");
		x2 = sc.nextDouble();
		System.out.print("Please enter y2 --> ");
		y2 = sc.nextDouble();

		// Calculate the distance between the two points
		d = CalcDistance(x1, y1, x2, y2);
		System.out.println("Distance between the two points is : " + d);

		// Calculate the coordinates of the midpoint
		midX = CalcMidpoint(x1, x2);
		midY = CalcMidpoint(y1, y2);

		System.out.println("Coordinates of the midpoint are (" + midX + "," + midY + ")");

		// Calculate the slope of the line
		// First check that there is a slope ie. that the x-coordinates are not the same
		if (x1 == x2)
			System.out.println("The slope is undefined as the x coordinates are equal");
		else {
			m = CalcSlope(x1, y1, x2, y2);
			System.out.println("The slope is : " + m);
		}
	}

	public static double CalcMidpoint(double p1, double p2) {
		return (p1 + p2) / 2;
	}

	public static double CalcDistance(double x1, double y1, double x2, double y2) {
		// http://www.purplemath.com/modules/distform.htm
		return Math.sqrt(Math.pow((y2 - y1), 2) + Math.pow((x2 - x1), 2));
//		return Math.sqrt( ((y2-y1) * (y2-y1)) + ((x2-x1) * (x2-x1)) );
	}

	public static double CalcSlope(double x1, double y1, double x2, double y2) {
		// http://www.purplemath.com/modules/slope.htm
		return (y2 - y1) / (x2 - x1);
	}

	public static double calcHypotenuse(double opposite, double adjacent) {
		// http://www.mathsisfun.com/definitions/hypotenuse.html
		// 6 and 8 is 10
		return Math.sqrt(opposite * opposite + adjacent * adjacent);
	}

	public static int intPower(int base, int exp) {
		int i = 0, total = 1;

		for (i = 1; i <= exp; i++)
			total *= base;
		return total;
	}

	public static int sumTheValues(int howManyNumbers) {
		int total = 0, value = 0;

		for (int i = 1; i <= howManyNumbers; i++) {
			System.out.print("Enter a value: ");
			value = sc.nextInt();
			total += value;
		}
		return total;
	}

	public int addNumbers(int n1, int n2) {
		return n1 + n2;
	}

	// The next two methods are overloaded - the parameters are of different type
	public static int square(int param) {
		return param * param;
	}

	public static double square(double param) {
		return param * param;
	}
	// The following method gives a compiler error because the return type
	// is NOT part of the method signature
	// Error: "Duplicate method square(double) in type MASE_Week3"
//	public static int square(double param){
//		return 4;
//	}	
}
