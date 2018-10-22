package com.mase.polymorphism3;

public class MusicExample {
	public static void tune(Instrument i){
		i.play();
		//System.out.println(i.toString());
	}
	public static void tuneAnother(InstrumentI i){
		i.print();
		//System.out.println(i.toString());
	}
	public static void tuneAll(Instrument[] e){
		for(int i=0; i<e.length; i++)
			tune(e[i]);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		tune(new Guitar());
		tune(new Wind());
		tuneAnother(new Wind());
		
		
//		Instrument[] orchestra = new Instrument[5];
//		int i=0;
//		orchestra[i++] = new Wind();
//		orchestra[i++] = new Percussion();
//		orchestra[i++] = new Stringed();
//		orchestra[i++] = new Brass();
//		orchestra[i++] = new Woodwind();
//		tuneAll(orchestra);
	}

}
