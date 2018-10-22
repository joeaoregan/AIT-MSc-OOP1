package com.mase.petmain;

public class CanWalkImpl implements CanWalk {
	private int legs;
	
	public void CanWalkImpl(int legs) {
		this.legs = legs;
		System.out.println("CanWalkImp " + legs);
	}
	
	@Override
	public void walk() {
		System.out.println("CanWalkImpl walk()");
	}
}
