package com.mase.polymorphism1;

class Instrument {
	public void play() {
		System.out.println("Instrument::play()");
	}

	public String what() {
		return "Instrument";
	}

	public void adjust() {};
}