/*
 * Joe O'Regan
 * A00258304
 * 02/10/2018
 * 
 * PassReference.java
 */
package com.ait.wk4;

public class PassReference {
	static void f (PassReference h) {
		System.out.println("h inside f() " + h);
	}
	public static void main(String[] args) {
		PassReference p = new PassReference();
		System.out.println("p inside main(): " + p);
		f(p);
	}

}
