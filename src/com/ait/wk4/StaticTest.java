/*
 * Joe O'Regan
 * A00258304
 * 02/10/2018
 * 
 * StaticTest.java
 */
package com.ait.wk4;
class Tag {
	Tag(int marker) {
		System.out.println("Constructor...\t\tTag (" + marker + ")\t\ttagCounter = " + ++tagCounter);	
	}
	static int tagCounter;
} // end Tag constructor

class Card {
	Tag t1 = new Tag(1);						// Before constructor
	static int cardCounter;
	
	Card(int marker) {
		// indicate we are in constructor
		System.out.println("Constructor...\t\tCard(" + marker + ")\t\tcardCounter = " + ++cardCounter);
		t3 = new Tag(33);						// Re-initialise t3, garbage collector can act
	}	// end constructor
	
	static Tag t2 = new Tag(2);					// After constructor - first thing done in this class
	
	Tag t3 = new Tag(3);						// At end - last thing done (tag 3, cardCounter 4)
}	// end Card class

public class StaticTest {
	Card y = new Card(8);
	static Card x = new Card(7);				// 1st thing that's done
	
//	public static void main(String[] args) {
//		new StaticTest();						// 1		
//	}
	public static void main(String[] args) {	// 2 = nothing in main() (note: main() is needed)	
		// static initialiser will run, card 8 will not be done, as no new StaticTest()
	}
}
