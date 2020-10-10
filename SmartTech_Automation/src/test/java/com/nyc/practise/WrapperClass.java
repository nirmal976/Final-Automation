package com.nyc.practise;

public class WrapperClass {

	public static void main(String[] args) {
		/*int x=40;  // primitive to class
		Integer y= Integer.valueOf(x);
		System.out.println("The Value Of Y: "+y);

		Integer z = x; /// directly we can use it, this is call autoboxing
		System.out.println("The Value Of z: "+z);*/
		
		Double d = new Double(7.99);
		System.out.println("the value of d "+d); // Class to primitive

		double e = d.doubleValue();
				System.out.println("the value of e "+e); /// unboxing
		
	}

}
