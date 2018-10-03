/*
 * Joe O'Regan
 * A00258304
 * 03/10/2018
 * Q16/28
 */
package com.ait.wk4.Qs;

public class Q16 {

	public static void main(String[] args) {
		switch(Integer.parseInt(args[1])) {
		case 0: 
			boolean b = false;
			break;
		case 1:
			b = true;
			break;
		}
		
		if(b) System.out.println(args[2]); // can't find b, not in scope
	} 

}
