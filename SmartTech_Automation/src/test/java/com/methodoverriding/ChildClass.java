package com.methodoverriding;

public class ChildClass extends ParentClass{
	
	public void display() { // overriding method
		
		System.out.println("Most of the Child left their parents");
	}
 public static void main (String[] args) {
	 
	 ParentClass obj = new ParentClass();
	 obj.display();
	 /* When Parent class reference refers to the parent class object
		 * then in this case overridden method (the method of parent class)
		 *  is called.
		 */
	 
		/* When parent class reference refers to the child class object
		 * then the overriding method (method of child class) is called.
		 * This is called dynamic method dispatch and runtime polymorphism
		 */

	 ParentClass obj1 = new ChildClass();
	 obj1.display();
 }
}
