package com.ait.wk4.Qs;

public class Q07 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int rate = 10;
		int t = 5;
//		int amount = 1000.0;
//		long amount = 1000.0;
//		float amount = 1000.0;
		double amount = 1000.0;
		for(int i=0;i<t;t++) {
			amount = amount * (1 - rate/100);
		}
	}

}
