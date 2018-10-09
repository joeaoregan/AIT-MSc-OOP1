/*
 * Joe O'Regan
 * 09/10/2018
 * PIE.java
 * Polymorphism, Inheritance, Encapsulation
 */
package com.mase.inheritance;

class Human {
	public String whoAmI() {
		return "I am a Human";
	}

	@Override	// At override tells you if you are trying to override a class that doesn't exist in the parent
	public String toString() {
		return "Human";
	}
}

class Male extends Human {
	@Override
	public String whoAmI() {
		return "I am a Male";
	}

	@Override
	public String toString() {
		return "Male";
	}

	public String Show() {
		return "Show Male";
	}
}

class Female extends Human {
	@Override
	public String toString() {
		return "Female";
	}

	@Override
	public String whoAmI() {
		return "I am a Female";
	}
}

class Man extends Male {
	@Override
	public String toString() {
		return "Man";
	}
}

class Boy extends Male {
}

class Woman extends Female {
	@Override
	public String toString() {
		return "Woman";
	}
}

class Girl extends Female {
	@Override
	public String toString() {
		return "Girl";
	}
}

public class PIE {

	public static void main(String[] args) {
		// human reference can point anywhere
		Human h = new Human();
		System.out.println(h); // When Human.toString() commented out, prints object hashcode
		h = new Male();
		System.out.println(h); // Prints Male - Male has toString()
		h = new Female();
		System.out.println(h);
		h = new Boy();
		System.out.println(h); // Prints Male - no toString() in Boy

		Boy b = new Boy();
		System.out.println(b.Show()); // Prints "Show Male" - no compile error, as Show() is inherited from Male

		// Polymorphism - treat as top of hierarchy
		// Human has subset of the methods in these objects
		doSomething(new Human());
		doSomething(new Male());
		doSomething(new Female());
		doSomething(new Boy());
		doSomething(new Girl());
		doSomething(new Man());
		doSomething(new Woman());
	}

	// Take in top class
	public static void doSomething(Human h) {
		System.out.println(h.whoAmI());
	}
}
