package com.mase.polymorphism2;

abstract class Instrument {
	public void play() {
		System.out.println("Instrument::play()");
	}

	public String what() {
		return "Instrument";
	}

	public abstract void adjust();
}