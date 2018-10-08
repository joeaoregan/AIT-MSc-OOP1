package com.mase.inheritance;

class Art {
	Art() { System.out.println("Art constructor"); }
	public void methodX() { System.out.println("Art::methodX"); }
	@Override
	public String toString() { return "Art::toString()"; }
}

class Drawing extends Art {
	Drawing() {
		System.out.println("Drawing constructor");
	}

	@Override
	public void methodX() {
		System.out.println("Drawing::methodX");
	}

	@Override
	public String toString() {
		return "Drawing::toString()";
	}
}

public class Cartoon extends Drawing {
	Cartoon() {
		System.out.println("Cartoon constructor");
	}

	@Override
	public void methodX() {
		System.out.println("Cartoon::methodX");
	}

	public void y() {
		System.out.println("Cartoon::y");
	}

	public static void main(String[] args) {
		Cartoon c = new Cartoon(); 	// Art constructor, Drawing constructor, Cartoon constructor

		methodY(new Cartoon());		// Art constructor, Drawing constructor, Cartoon constructor, Cartoon: methodX
		upcasting();
		downcasting();
	}

	public static void methodY(Art a) {
		a.methodX();
//		a.y();
	}
	
	public static void upcasting() {
		// upcasting (implicitly done)
		// a reference of type X can refer to an object of type X or any subtype of X
		
		System.out.println("\nUpcasting:\n");
		
		Art a1 = new Art();						// Art constructor
		System.out.println(a1);					// Art::toString()
		
		Art a2 = new Drawing();					// Art constructor, Drawing constructor
		System.out.println(a2);					// Drawing::toString()
		
		Art a3 = new Cartoon();					// Art constructor, Drawing constructor, Cartoon constructor
		System.out.println(a3);					// Drawing::toString() (no toString() in Cartoon)
		
		Drawing d1 = new Drawing();				// Art constructor, Drawing constructor
		System.out.println(d1);					// Drawing::toString()
		
		Drawing d2 = new Cartoon();				// Art constructor, Drawing constructor, Cartoon constructor
		System.out.println(d2);					// Drawing::toString()
		
		Cartoon c1 = new Cartoon();				// Art constructor, Drawing constructor, Cartoon constructor
		System.out.println(c1);					// Drawing::toString()
	}
	
	public static void downcasting() {
		// downcasting (explicitly done)

		System.out.println("\nDowncasting:\nSAFE DOWNCASTS");
		
		// SAFE DOWNCASTS
		// Art reference - pointing to a Drawing object
		Art a1 = new Drawing();					// Art constructor, Drawing constructor
		// a Drawing reference can point to a Drawing oject
		Drawing d1 = (Drawing) a1;				// A d1 referene (of type Drawing) can refer to a Drawing object
		System.out.println(d1);					// Drawing::toString()
		
		// Art reference - pointing to a Cartoon object
		Art a2 = new Cartoon();					// Art constructor, Drawing constructor, Cartoon constructor
		// a Drawing reference can point ot a Cartoon object
		Drawing d2 = (Drawing) a2; 				// a d2 reference (of type Drawing) can refer to a Cartoon object
		System.out.println(d2);					// Drawing::toString()
		// a Cartoon reference can point to a Cartoon object
		Cartoon c1 = (Cartoon) a2;				// a c1 reference (of type Cartoon) can refer to a Cartoon object
		System.out.println(c1);					// Drawing::toString()
		
		// Drawing reference - pointing to a Cartoon object
		Drawing d3 = new Cartoon();				// Art constructor, Drawing constructor, Cartoon constructor
		// a Cartoon reference can point to a Cartoon object
		Cartoon c2 = (Cartoon) d3;				// a c2 reference (of type Cartoon) can refer to a Cartoon object
		System.out.println(c2);					// Drawing::toString()
		
		
		// ClassCastExceptions
		// A ref of type X *cannot* refer to an object of superclass (i.e. up the hierarcy)

		System.out.println("\nClassCastExceptions\n");
		
		// A drawing reference cannot refer to an Art object
		Drawing d4 = (Drawing) new Art();		// ClassCastException
		
		// A Cartoon reference cannot refer to an Art object
		Cartoon c3 = (Cartoon) new Art();		// ClassCastException
		
		// A Cartoon reference cannot refer to an Drawingobject
		Cartoon c4 = (Cartoon) new Drawing();	// ClassCastException
	}
}