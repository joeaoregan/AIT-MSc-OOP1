package com.mase.polymorphism1;

class Percussion extends Instrument {
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
