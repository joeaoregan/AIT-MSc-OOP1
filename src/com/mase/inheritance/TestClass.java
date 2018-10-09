/*
 * Joe O'Regan
 * A00258304
 * 09/10/2018
 */

package com.mase.inheritance;

class A {
	public int i = 10;
	private int j = 20;
	int m = 1;
	
	public void nsm() {
		System.out.println("A::nsm()");
	}

	public static void sm() {
			System.out.println("A::sm()");
	}
}

class B extends A {
	private int i = 30;
	public int k = 40;
	int m = 2;

	public void nsm() {
		System.out.println("B::nsm()");
	}

	public static void sm() {
			System.out.println("B::sm()");
	}
}
class C extends B {
	int m=3;
	public void nsm() {
		System.out.println("C::nsm()");
	}
	public static void sm() {
		System.out.println("C::sm()");
	}
}

public class TestClass {

	public static void main(String[] args) {
		C c = new C();
//		System.out.println(c.i);		// i is not visible - i has private access
//		System.out.println(c.j);		// j is not visible - j is private in class a (not in B, or C)
//		System.out.println(c.k);		// 40 - public k in B

//		System.out.println(((A)c).i);	// 10
//		System.out.println(c.m);		// 3
//		System.out.println((B) c.m);	// Cast
//		System.out.println(((B)c).m);	// 2
//		System.out.println(((A)c).m);	// 1

		A a = new C();
//		a.nsm();						// C::nsm() - object type is C
//		a.sm();							// A::sm()
		
//		a = new B();
//		a.nsm();						// B::nsm()
		
//		a=new A();
//		a.nsm();						// A.nsm() - non static methods in A
		
//		a=new C();
//		((A)a).nsm();					// C::nsm() - still gives C even though it is cast. non static / instance methods. Objects matter, not the reference
		
		A aref = new C();
		System.out.println(aref.m);		// 1 - type of reference matters
		aref.nsm();						// C::nsm() - non-static method
		aref.sm();						// A::sm() - static method
		// overriding basically supports late-binding
		// depends on the objects types
		// Its for instance methods only, non-static methods
		
		// Hiding is for all other methods, based on reference type
		// Math.pow() - static method
	}

}
