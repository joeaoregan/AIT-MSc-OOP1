// Hiding
// Integer variable x is a local variable in method()

package com.ait.wk4.Qs;

public class Q10 {
	public static class Test{
		int x = 12;
		public void method(int x) {
			x+=x;
			System.out.println(x);
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Test t = new Test();
		t.method(5);
	}

}
