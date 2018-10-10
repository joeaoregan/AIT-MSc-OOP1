//: c07:Sandwich.java
// From 'Thinking in Java, 2nd ed.' by Bruce Eckel
// www.BruceEckel.com. See copyright notice in CopyRight.txt.
// Order of constructor calls.
package com.mase.inheritance;

class Meal {
//	Cheese b = new Cheese("Cheese instance in Meal...");	// instance initialisation occurs before constructor

	Meal() {
		System.out.println("Meal()");
	}
	Cheese b2 = new Cheese("Cheese b2 instance in Meal...");	// instance initialisation occurs before constructor

}

class Bread {
	Bread() {
		System.out.println("Bread()");
	}
	Bread(String s) {
		System.out.println("\nBread::" + s);
	}
}

class Cheese {
	Cheese() {
		System.out.println("Cheese()");
	}

	Cheese(String s) {
		System.out.println("\nCheese::" + s);
	}
}

class Lettuce {
	Lettuce() {
		System.out.println("Lettuce()");
	}

	Lettuce(String s) {
		System.out.println("\nLettuce::" + s);
	}
}

class Lunch extends Meal {
	Bread b = new Bread("Bread instance in Lunch...");
	Lunch() {
		System.out.println("Lunch()");
	}
}

class PortableLunch extends Lunch {
	Lettuce b = new Lettuce("Lettuce instance in PortableLunch...");
	PortableLunch() {
		System.out.println("PortableLunch()");
	}
}

public class Sandwich extends PortableLunch {
	Bread b = new Bread();
	Cheese c = new Cheese();
	Lettuce l = new Lettuce();

	Sandwich() {
		System.out.println("Sandwich()");
	}

	public static void main(String[] args) {
		int i = 0;
		i = 8;
		new Sandwich();
		System.out.println("here");
	}
} /// :~
