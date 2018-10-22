package com.mase.petmain;

public class Fish extends Animal implements Pet{
	private Nameable nameable;
	
	@Override
	public void eat() {
		System.out.println("Fish eat");
	}
	
	@Override
	public void play() {
		System.out.println("Fish play");
	}
	
	@Override
	public void setName(String name) {
		nameable.setName(name);
	}
	
	@Override
	public String getName() {
		return nameable.getName();
	}
}
