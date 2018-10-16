package com.mase.animals;

public class Goldfish extends Animal implements Pet{
	private String name;
	private Owner owner;
	
	public Goldfish() {
		super(0);
		owner = new Owner("Joe Blogss");
	}
	
	@Override
	public void eat() {
		System.out.println("Goldfish eat pond scum.");		
	}
	
	@Override
	public String getName() {
		return name;
	}
	
	@Override
	public void setName(String name) {
		this.name = name;
	}
	
	@Override
	public void play() {
		System.out.println("Goldfish just keep swimming.");
	}
	
	@Override
	public void walk() {
		super.walk();
		System.out.println("Goldfish, of course, can't walk; they swim.");
	}
}
