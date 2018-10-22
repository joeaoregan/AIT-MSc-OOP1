package com.mase.polymorphism3;

class Wind implements Instrument, InstrumentI {
	public void play(){
		System.out.println("Wind::play()");
	}
	public String what(){
		return "Wind";
	}
	public void adjust(){
		System.out.println("Wind::adjust()");
	}
	
	public void print(){// InstrumentI interface
		System.out.println("Wind::print()");
		
	}
	
	
//	@Override
//	public String toString(){
//		return "Wind::toString()";
//	}
}