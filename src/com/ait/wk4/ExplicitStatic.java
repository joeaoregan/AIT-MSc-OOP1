/*
 * Joe O'Regan
 * A00258304
 */
// c04:ExplicitStatic.java
// Explicict static initialization with the "static" clause

package com.ait.wk4;

class Cup {
	Cup(int marker) {
		System.out.println("Cup(" + marker + ")");
	}
	void f(int marker) {
		System.out.println("f(" + marker + ")");
	}
}

class Cups {
	static Cup c1;
	static Cup c2;
	static {
		c1 = new Cup(1);
		c2 = new Cup(2);
	}
	Cups() {
		System.out.println("Cups()");
	}
}

public class ExplicitStatic {

	public static void main(String[] args) {
		System.out.println("Inside main()");
		Cups.c1.f(99);	// (1) - static reference to c1
	}
	// static Cups x = new Cups();	// (2)	- get done first if uncommented
	// static Cups y = new cups();	// (2)
}
