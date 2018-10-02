// Q1

package com.ait.wk4.Qs;

public class TestClass {
static String str = "Hello World";	// Strings are immutable
public static void changeIt(String s) {
	s = "Good bye world";	
}
	public static void main(String[] args) {
		changeIt(str);
		System.out.println(str);
	}

}
