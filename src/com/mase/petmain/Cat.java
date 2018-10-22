package com.mase.petmain;

public class Cat implements CanWalk {
	private Nameable nameable;
	private CanWalk itWalks;
	
	public void eat() {
		System.out.println("Cat eat()");
	}
	public Cat() {
		System.out.println("Cat");
	}
	
	public Cat(String name) {
		System.out.println("Cat " + name);
	}
	
	public void walk() {
		System.out.println("Cat walk");
	}
}
