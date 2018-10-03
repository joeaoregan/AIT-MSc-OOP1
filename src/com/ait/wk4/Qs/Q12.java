/*
 * Joe O'Regan
 * A00258304
 * 03/10/2018
 * Q12/28
 */
package com.ait.wk4.Qs;

public class Q12 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int k = 1;
		int[] a = {1};
		k += (k = 4) * (k + 2);
		a[0] += (a[0] = 4) * (a[0] + 2);
		System.out.println(k + ", " + a[0]);
		
	}

}
