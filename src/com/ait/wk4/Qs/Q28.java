package com.ait.wk4.Qs;

public class Q28 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int k = 9, s = 5;
		switch(k) {
		default:
			if(k == 10) { s = s*2;}
			else {
				s = s+4;
				break;
			}
		case 7: s = s+3;
		}
		System.out.println(s);
	}

}
