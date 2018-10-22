package com.mase.polymorphism2;

public class MusicExample {
	public static void tune(Instrument i){
		i.play();
		//System.out.println(i.toString());
	}

	public static void tuneAll(Instrument[] e){
//		for(int i=0; i<e.length; i++)
//			tune(e[i]);
		for (Instrument instrument : e)
			tune(instrument);
	}

	public static void main(String[] args) {
//		tune(new Guitar());
//		tune(new Wind());
//		Instrument[] orchestra1 = {new Instrument(), new Instrument(), new Instrument(), new Instrument(), new Instrument()};

//		tuneAll(orchestra1);

		//Instrument[] orchestra2 = new Instrument[5];
		Instrument[] orchestra1 = new Instrument[5];
		int i=0;
		orchestra1[i++] = new Wind();
		orchestra1[i++] = new Percussion();
		orchestra1[i++] = new Stringed();
		orchestra1[i++] = new Brass();
		orchestra1[i++] = new Woodwind();
		
		tuneAll(orchestra1);
	}
}
