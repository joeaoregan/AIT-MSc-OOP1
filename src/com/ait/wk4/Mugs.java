/*
 * Joe O'Regan
 * A00258304
 */
// Java "Instance Initialization." (c04:Mugs.java)
package com.ait.wk4;

class Mug {
	Mug(int marker) {
		System.out.println("Mug(" + marker + ")");
	}
	void f(int marker) {
		System.out.println("f(" + marker + ")");
	}
}
public class Mugs {
	Mug c1;
	Mug c2;
	// Instance block is initialised first
	{
		c1 = new Mug(1);	
		c2 = new Mug(2);
		System.out.println("c1 & c2 initialised");
	}
	Mugs() {
		System.out.println("Mugs()");
	}
	Mugs(String s) {
		System.out.println("Mugs(String)");
	}
	
//	static void x() {}
	public static void main(String[] args) {
		System.out.println("Inside main()");
		Mugs x = new Mugs();
//		Mugs.x();	// 
		Mugs y = new Mugs("SK");
	}

}
