package com.ait.wk4.Qs;

public class Q25 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//ifTest(false);
		ifTest(true);
	}
	
	public  static void ifTest(boolean flag) {
		if (flag) // 1
			if (flag) // 2
				System.out.println("True False");
			else	// 3
				System.out.println("True True");		
		else // 4
			System.out.println("False False");
	}
}
