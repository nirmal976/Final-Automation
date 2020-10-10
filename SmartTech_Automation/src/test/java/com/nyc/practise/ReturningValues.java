package com.nyc.practise;

public class ReturningValues {

	int square (int value) {
		return value*value;
	}
	
	public static void main(String[] args) {
		
		ReturningValues obj = new ReturningValues();
		//int result = obj.square(3);
		System.out.println("Result of square 3 ="+obj.square(3)); // we can directly run without using previous line
		
		ReturningValues obj1 = new ReturningValues();
		//int result = obj.square(6);
		System.out.println("Result of square 6 ="+obj1.square(6));
		
		ReturningValues obj2 = new ReturningValues();
		//int result = obj.square(9);
		System.out.println("Result of square 9 ="+obj2.square(9));
		
		
	}
}
