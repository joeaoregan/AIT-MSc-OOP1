package com.mase.polymorphism3;

public class PolymorphismLab1 {

	public static void main(String[] args) {
		//Instrument instrument = new Instrument();
		//Instrument[] orchestra1 = {new Instrument(), new Instrument(), new Instrument(), new Instrument(), new Instrument()};
		//tuneAll(orchestra1);

		Instrument[] orchestra2 = {new Stringed(), new Wind(), new Percussion(), new Woodwind(), new Brass()};
		tuneAll(orchestra2);
		
		Instrument[] orchestra3 = {new Wind(), new Percussion(),new Stringed(), new Brass(),  new Woodwind()};
		tuneAll(orchestra3);
	}

	public static void tuneAll(Instrument[] orchestra) {
		for (Instrument instrument : orchestra) {
			tune(instrument);
		}
	}
	public static void tune(Instrument instrument) {
		instrument.play();
	}
}
