/*
 * Labs: Bitwise versus logical operators
 * http://stackoverflow.com/questions/4014535/differences-in-boolean-operators-vs-and-vs
 */

package com.ait.wk1;

public class BitwiseVsLogicalOperators {

	public static void main(String[] args) {
		int a = 6;	// 110
		int b = 4;	// 100
		
		// Bitwise AND
		
		int c = a & b;
		//   110
		// & 100
		// -----
		//   100
		
		// Bitwise OR
		
		int d = a | b;
		//   110
		// | 100
		// -----
		//   110
		
		System.out.println(c);	// 4
		System.out.println(d);	// 6

	}

}
