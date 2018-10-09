package com.ait.wk2;

import java.util.Scanner;

public class MASE_Week2 {
	static Scanner sc = new Scanner(System.in);

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// simpleCalcs(); // Ex1
		// simpleCalcsShorthand(); // Ex2
		// compareTwoValues(); // Ex3
		// incrementDecrement(); // Ex4
		// preAndPostDifference(); // Ex5
		// booleanOperators(); // Ex6a
		// booleanLogicShortCircuitOps(); // Ex6b
		// booleanBitwiseOps(); // Ex7
		compareStrings(); // Ex8
		// System.out.println(admitToFilm(18, 23)); // Ex9
		// orderOfPrecedence(); // Ex10
	}

	public static void simpleCalcs() {
		System.out.println("Enter x: "); // enter 10
		int x = sc.nextInt();
		System.out.println("Enter y: "); // enter 2
		int y = sc.nextInt();
		int sum = x + y;
		int diff = x - y;
		int product = x * y;
		int quotient = x / y;

		System.out.println("The sum of " + x + " and " + y + " is " + sum);
		System.out.println("The difference of " + x + " and " + y + " is " + diff);
		System.out.println("The product of " + x + " and " + y + " is " + product);
		System.out.println("The quotient of " + x + " and " + y + " is " + quotient);
	}

	public static void simpleCalcsShorthand() {
		System.out.println("Enter x: "); // enter 10
		int x = sc.nextInt();
		System.out.println("Enter y: "); // enter 2
		int y = sc.nextInt();
//		int sum=diff=product=quotient=x;	// compiler errors
		int sum = x, diff = x, product = x, quotient = x;
//		int sum += 4; // syntax error, '=' expected
		sum += y;
		diff -= y;
		product *= y;
		quotient /= y;

		System.out.println("The sum of " + x + " and " + y + " is " + sum);
		System.out.println("The difference of " + x + " and " + y + " is " + diff);
		System.out.println("The product of " + x + " and " + y + " is " + product);
		System.out.println("The quotient of " + x + " and " + y + " is " + quotient);
	}

	public static void compareTwoValues() {
		System.out.println("Enter x: ");
		int x = sc.nextInt();
		System.out.println("Enter y: ");
		int y = sc.nextInt();
		if (x > y)
			System.out.println(x + " is greater than " + y);
		else if (y > x)
			System.out.println(y + " is greater than " + x);
		else
			System.out.println(y + " is equal to " + x);
	}

	public static void incrementDecrement() {
		System.out.println("Enter x: ");
		int x = sc.nextInt(); // assume 5
		// Assuming 5 then the line below outputs 51
		// System.out.println("x+1 == "+x+1);
		System.out.println("x+1 == " + (x + 1)); // outputs 6, x still 5
		x++; // x is now 6
		++x; // x is now 7
		System.out.println("x == " + x); // outputs 7
		x--;
		--x;
		System.out.println("x == " + x); // outputs 5
	}

	public static void preAndPostDifference() {
		int x = 5, y = 10;

		System.out.println("The value of x is " + x); // 5
		System.out.println("The value of ++x is " + ++x); // 6
		System.out.println("The value of x++ is " + x++); // 6
		System.out.println("The value of x is " + x); // 7

		System.out.println("The value of y is " + y); // 10
		System.out.println("The value of --y is " + --y); // 9
		System.out.println("The value of y-- is " + y--); // 9
		System.out.println("The value of y is " + y); // 8

	}

	public static void booleanOperators() {
		int w = 20, x = 10, y = -5, z = 0;
		System.out.println("(w == x && y != z) == " + (w == x && y != z)); // false
		System.out.println("(w == x || y != z) == " + (w == x || y != z)); // true
		System.out.println("!(w == (x+z)) == " + !(w == (x + z))); // true

	}

	public static void booleanLogicShortCircuitOps() {
		// Note: see also p72 #7 of AP Computer Science; p73 #12

		System.out.print("Enter num1: ");
		int num1 = sc.nextInt();
		System.out.print("Enter num2: ");
		int num2 = sc.nextInt();

		// compare using the short circuit operators
		// the right hand side of the expression is evaluated only if necessary!
		// Example:
		// Enter num1: -3
		// Enter num2: 3
		// One of the numbers is negative
		// One is neg: num2 == 5
		// num2 == 5
		if (num1 < 0 && num2++ < 0) { // T && F - num2 goes to 4 as && is evaluated
			System.out.println("Both numbers are negative");
			System.out.println("Both neg: num2 == " + num2);
		} else if (num1 > 0 && num2++ > 0) { // F (&& not evaluated)
			System.out.println("Both numbers are positive");
			System.out.println("Both pos: num2 == " + num2);
		} else if (num1 == 0 || num2++ == 0) { // F || F - num2 goes to 5 as || is evaluated
			System.out.println("One of the numbers is 0");
			System.out.println("One is 0: num2 == " + num2);
		} else if (num1 < 0 || num2++ < 0) { // T (|| not evaluated)
			System.out.println("One of the numbers is negative");
			System.out.println("One is neg: num2 == " + num2);
		}

		// -3 and -3 => -2
		// 3 and 3 => 4
		// 0 and 3 => 3
		// -3 and 3 => 5
		System.out.println("num2 == " + num2);

	}

	public static void booleanBitwiseOps() {
		System.out.print("Enter num1: ");
		int num1 = sc.nextInt();
		System.out.print("Enter num2: ");
		int num2 = sc.nextInt();

		// compare using the bitwise (non-short circuit) operators
		// both sides of expressions are evaluated regardless!
		if (num1 < 0 & num2++ < 0) {
			System.out.println("Both numbers are negative");
		} else if (num1 > 0 & num2++ > 0) {
			System.out.println("Both numbers are positive");
		} else if (num1 == 0 | num2++ == 0) {
			System.out.println("One of the numbers is 0");
		} else if (num1 < 0 | num2++ < 0) {
			System.out.println("One of the numbers is negative");
		}
		// -3 and -3 => -2
		// 3 and 3 => 5
		// 0 and 3 => 6
		// -3 and 3 => 7
		System.out.println("num2 == " + num2);

	}

	public static void compareStrings() {
		// 1. Using Scanner
		System.out.print("Enter string 1: ");
		String s1 = sc.next(); // "sean"
		System.out.print("Enter string 2: ");
		String s2 = sc.next(); // "sean"

		System.out.println("Scanner : using == returns : " + s1 == s2);// just "false"
		System.out.println("Scanner : using == returns : " + (s1 == s2)); // false
		System.out.println("Scanner : using equals() returns : " + s1.equals(s2)); // true

		// 2. Using "new" for one of the strings
		// Two ways to declare a String
		String name1 = "john"; // shortcut
		String name2 = new String("john"); // using "new"

		System.out.println("usingNewOnce : using == returns : " + (name1 == name2));
		System.out.println("usingNewOnce : using equals() returns : " + name1.equals(name2));

		// 3. Using "new" for both of the strings
		// Two ways to declare a String
		String name3 = new String("john");
		String name4 = new String("john"); // using "new"

		System.out.println("usingNewTwice : using == returns : " + (name3 == name4));
		System.out.println("usingNewTwice : using equals() returns : " + name3.equals(name4));

		// 4. interning the String literal
		// Wikipedia : In computer science, string interning is a method of storing only
		// one copy of each distinct string value
		// *** Java API String::intern() states "All literal strings and string-valued
		// constant expressions are interned." ***
		String sean1 = "sean";
		String sean2 = "sean";

		System.out.println("interningTheStringLiteral : using == returns " + (sean1 == sean2)); // true

		String paul1 = "paul";
		String paul2 = new String("paul").intern();
		System.out.println("intern () results in " + (paul1 == paul2)); // true

		// interning Scanner...
		System.out.print("Enter dogs name: ");
		String dogName1 = sc.next().intern(); // "rex"
		System.out.print("Enter dogs name: ");
		String dogName2 = sc.next().intern(); // "rex"
		System.out.println("interning Scanner == results in " + (dogName1 == dogName2)); // true

	}

	public static boolean admitToFilm(int certForFilm, int age) {
		boolean isOK = (age >= certForFilm) ? true : false;
		return isOK;
	}

	public static void orderOfPrecedence() {
		// a.
		System.out.println("5 + 3 * 2 - 11 % 3 == " + (5 + 3 * 2 - 11 % 3)); // 5 + 6 - 2 == 9

		// b.
		int x = 5, y = 10;
		int z = ++x * y--;
		System.out.println("z == " + z + "; x == " + x + "; y == " + y); // z == 60; x == 6; y == 9

		// c.
		System.out.println("1 + 2 = " + 1 + 2); // 1 + 2 = 12
		System.out.println("1 + 2 = " + (1 + 2)); // 1 + 2 = 3

		// d.
		// Add parentheses to the following expression to make the order of evaluation
		// more clear:
		// Q: year % 4 == 0 && year % 100 != 0 || year % 400 == 0
		// A: ((year % 4 == 0) && (year % 100 != 0)) || (year % 400 == 0)

		// e.
		// Q: What does the following code fragment print?
		// A: 3abc and abc12, respectively. The + operator is left associative, whether
		// it is
		// string concatenation or arithmetic plus.
		System.out.println(1 + 2 + "abc" + 3 + 3); // 3abc33
		System.out.println("abc" + 1 + 2); // abc12

		// f.
		int a = -3, b = 10, c = 5;
		System.out.println("a * --b + (3 - c++) == " + (a * --b + (3 - c++))); // -3 * 9 + -2 == -27 + -2 == -29

		// g.
//		double x1 = 14.7;
//		int y1 = x1; // compiler error - need to cast

		// h.
		int result = 13 - 3 * 6 / 4 % 3;
		System.out.println("result == " + result); // 13 - 18 / 4 % 3 == 13 -4 % 3 == 13-1 == 12

	}

}
