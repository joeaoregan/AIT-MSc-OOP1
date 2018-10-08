/*
 * HumanMale Casting
 * 08/10/2018
 * 
 * Male.java
 */

package com.mase.casting;

class Human {
	//@override
	public String toString() {
		return "Human";
	}
}
public class Male extends Human {
	@Override
	public String toString() {
		return "Male";
	}
	
	public static void main(String[] args) {
		// 1
		Human human = new Human();		// human can pt to Human objects and Male objects
		Human humanBeing = new Male();	// humanBeing can pt to Human objects and Male objects
		human = humanBeing;				// human now pointing at a Male object
		humanBeing = human;				// humanBeing now pointing at the same Male object
		System.out.println(human);		// Male
		System.out.println(humanBeing);	// Male
		
		// 2
		Male john = (Male) human;		// john now pointing at the Male object
		Male mike = (Male) humanBeing;	// mike now pointing at the Male object
		System.out.println(john);		// Male
		System.out.println(mike);		// Male
		
		human = new Human();			// reassign human to point at a new Human object
		john = (Male) human;			// need to downcast; john now pointing at a Human object - ClassCastException
										// i.e. a Male ref now pointing at a Human object (up the tree)
		System.out.println(john);
		
		human=john;						// implicit upcast performed
		
		john=(Male)human;				// explicit downcast required
		
		
	}

}
