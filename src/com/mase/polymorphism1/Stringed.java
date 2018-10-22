package com.mase.polymorphism1;

class Stringed extends Instrument {
	public void play(){
		System.out.println("Stringed::play()");
	}
	public String what(){
		return "Stringed";
	}
	public void adjust(){
		System.out.println("Stringed::adjust()");
	}

}
