package c;
import a.A;
import b.B;
public class C extends B{
	public void accessField() {
		a = 2; // works
		A ref = new A();
//		ref.a=8;	// not visible
	}
}
