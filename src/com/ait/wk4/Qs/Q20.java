package com.ait.wk4.Qs;

public class Q20 {

	public void switchTest(byte x) {
		switch(x) {
		case 'b':	// 1
		default : 	// 2
		case -2:	// 3
		case 80:	// 4
		}
	}
	
	public  void main(String[] args) {
		// TODO Auto-generated method stub
		switchTest((byte) 10);
	}

}
