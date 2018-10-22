package com.mase.casting2;

public class CastingPgm implements Shape {
	public void draw() {
		System.out.println("CastingPgm draw()");
	}
	public static void upcasting() {
		System.out.println("CastingPgm upcasting()");
	}
	
	public static void downcasting() {
		System.out.println("CastingPgm downcasting()");
	}	

	public static void main(String[] args) {
		upcasting();

//		RightAngledTriangle raTriangle = new Triangle();
//		Triangle raTriangle = new RightAngledTriangle();	// upcasting happens implicitly
//		raTriangle.draw();
//		raTriangle.area(); // not available
		
		/* Upcasting to the parent class */
		
//		Triangle t1 = new Triangle();
//		RightAngledTriangle r1 = new RightAngledTriangle();
//		t1.draw();
//		r1.draw();
//		t1 = r1;
//		t1.draw();
	
		/* Upcasting to the interface */
//		Shape s = new Triangle();
//		s.draw();
//		s = r1;
//		s.draw();
//		progToTheInterface(new Triangle());
//		progToTheInterface(new RightAngledTriangle());
		
		/* Downcasting() method */
//		Triangle t = new Triangle();
//		RightAngledTriangle r = new RightAngledTriangle();
//		t = r;
//		t.draw();
//		t.area();	// Won't compile
//		Triangle t1 = new Triangle();
//		RightAngledTriangle r1 = new RightAngledTriangle();
//		r1 = t1;	// need to cast (Type mismatch: cannot convert from Triangle to RightAngledTriangle)
//		r1 = (RightAngledTriangle) t1;	// Triangle cannot be cast to RightAngledTriangle
//		Triangle t2 = new RightAngledTriangle();
//		RightAngledTriangle t3 = new Triangle();	// type mismatch
//		RightAngledTriangle t3 = (RightAngledTriangle) new Triangle();	// Triangle cannot be cast to RightAngledTriangle
//		Triangle t5 = new RightAngledTriangle();
//		t5.draw(); 		// RightAngledTriangle draw()
//		RightAngledTriangle r5 = new RightAngledTriangle();
//		r5 = (RightAngledTriangle) t5;	// works
//		r5.area();
//		t5.area();
		
		Triangle t6 = new Triangle();
		t6.draw();
		RightAngledTriangle r6 = new RightAngledTriangle();
		r6 = (RightAngledTriangle) t6;
		r6.area();
	}

	public static void progToTheInterface(Shape shape) {
		shape.draw();
	}	
}
