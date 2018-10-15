/*
 * OOP1
 * 01/10/2018
 */
package com.ait.wk4;

class Tag {
	Tag(int marker) {
		System.out.println("Tag(" + marker + ")");
	}
}

class Card {
	Tag t1 = new Tag(1);

	void f() {
		System.out.println("f()");
	}
	Tag t2 = new Tag(2);
	Card() {
		System.out.println("Card()");
		t3 = new Tag(33);
	}

	Tag t3 = new Tag(3);
}

public class OrderOfInitialization {
	public static void main(String[] args) {
		Card c = new Card();
		c.f();
	}

}
