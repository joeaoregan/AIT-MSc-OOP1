
// java.lang.ArithmeticException; // by zero
package com.ait.wk4.Qs;


public class Q24 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int d = 0;
		try {
			int i = 1 / (d* doIt());			
		} catch (Exception e) {
			System.out.println(e);
		}
	}
	
	public static int doIt() throws Exception {
		throw new Exception("Forget it");
	}
}
