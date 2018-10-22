package com.mase.petmain;

public class Spider extends Animal implements CanWalk {
	private CanWalk itWalks;

	public void Spider() {
		System.out.println("Spider");
	}

	@Override
	public void eat() {
		System.out.println("Spider eat");
	}

	public void walk() {
		System.out.println("Spider walk");
	}
}
