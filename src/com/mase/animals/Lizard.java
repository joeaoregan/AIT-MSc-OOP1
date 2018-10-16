package com.mase.animals;

public class Lizard extends Animal {
	private Owner owner;
	
	public Lizard() {
		super(4);
		owner = new Owner("Joe Bloggs");
	}
	
	@Override
	public void eat() {
		System.out.println("Lizards eat anything...");
	}
}
