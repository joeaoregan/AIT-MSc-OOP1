package com.mase.polymorphism3;

//class Instrument {
//	public void play() {
//		System.out.println("Instrument::play()");
//	}
//
//	public String what() {
//		return "Instrument";
//	}
//
//	public void adjust() {};
//// public abstract void adjust();
//}
//abstract class Instrument {
//	public void play(){
//		System.out.println("Instrument::play()");
//	}
//	public String what(){
//		return "Instrument";
//	}
//	public abstract void adjust();
//
//}

interface Instrument {
	int i=5; // static and final
	
	void play();
	
	String what(); // auto public
	//abstract void adjust();
	void adjust();

}
