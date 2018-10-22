package com.mase.polymorphism3;

class Percussion implements Instrument {
	public void play(){
		System.out.println("Percussion::play()");
	}
	public String what(){
		return "Percussion";
	}
	public void adjust(){
		System.out.println("Percussion::adjust()");
	}

}
