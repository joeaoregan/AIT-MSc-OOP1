/*
 * Joe O'Regan
 * A00258304
 * 03/10/2018
 * Q14/28
 */
package com.ait.wk4.Qs;

public class Q14 {
	public void switchString(String input) {
		switch(input) {
		case "a": System.out.println("apple");
		case "b": System.out.println("bat");
		break;
		case "c": System.out.println("cat");
		default: System.out.println("none");
		}
	}

	public static void main(String[] args) {
		Q14 tc = new Q14();
		tc.switchString("c");
	}

}
