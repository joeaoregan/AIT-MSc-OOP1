package com.mase.inheritance;

class Base{
	private void f() {
		System.out.println("Base::f()");
	}
	Object g(){
		System.out.println("Base::g()"); 
		return new Object();
	}
	void h() {
		System.out.println("Base::h()");
	}
}
class SubClass extends Base{
	// even without the @Override annotation, the next line gives a compiler
	// error - its as if the compiler spots the same signature i.e. "f()" and
	// then checks to see if the return types are compatible...
	// Error is:
	// Multiple markers at this line
	// 	- overrides com.mase.inheritance.Base.f
	//- The return type is incompatible with Base.f()
//	int f() {System.out.println("SubClass::f()"); return 0;}			// 1
	
	//@Override
	public void f() {// Overridden method							
		System.out.println("SubClass::f()");
	}
	// Overloaded method
//	@Override
	void f(int x){
		System.out.println("SubClass::f(int) overloaded : "+x);
	}
	@Override
	String g() {										
		System.out.println("SubClass::g()");
		return "xyz";
	}
}
public class CovariantReturnTypes {								// 2
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SubClass s = new SubClass();
		s.f();						// SubClass::f()
		s.f(1);						// SubClass::f(int) overloaded : 1
		System.out.println(s.g());	// 	 SubClass::g()	
									//	 xyz
		s.h();						// Base::h()
		
	}
}
