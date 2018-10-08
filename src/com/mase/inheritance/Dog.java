/*
 * 08/10/2018
 * Stack and Heap
 */
package com.mase.inheritance;

class Collar {}

public class Dog {
	Collar c;						// instance variable
	String name;					// instance variable
	
	public static void main(String [] args) {
		Dog d;						// local variable: d
		d = new Dog();
		d.go(d);
	}
	
	void go(Dog dog) {				// local variable: dog
		c = new Collar();
		dog.setName("Aiko");
	}
	void setName(String dogName) {	// local var: dogName
		name = dogName;
	}
}
