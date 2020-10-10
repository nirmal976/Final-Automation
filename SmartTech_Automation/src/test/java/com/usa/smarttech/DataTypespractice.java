package com.usa.smarttech;

public class DataTypespractice {

	public static void main(String[] args) {
		byte num; // byte can hold -128 to 127. Default size of this data type: 1 byte.
		num = 123;
				System.out.println(num);
			
		short num1;  // short can hold -32,768 to 32767.Default size of this data type: 2 byte //
		
		num1 = 567;
		
		System.out.println(num1);
		
		
		long num2; // ranging from -9,223,372,036,854,775,808 to 9,223,372,036,854,775,807.size: 8 bytes
		num2 = 777777777777777777L;
		System.out.println(num2);
		
		float num4 = 20.99f; // It holding 6 to 7 decimal digits size: 4 bytes
		System.out.println(num4);

		double num5 = 99.99999999999999; // Sufficient for holding 15 decimal digits size: 8 bytes
		System.out.println(num5);
		// we have to use 'f' after float other wize it will take as a double
		char name = 'N'; // holds characters. size: 2 bytes
		System.out.println(name);
		
		boolean x = true; // it's holds either true of false.
		System.out.println(x);
		
		int y = 15000;  // its range: -2,147,483,648 to 2,147,483,647 Default size: 4 byte
		System.out.println(y);
		
		String DO = "Vote for Trump"; // anything handle with "" quote 
		System.out.println(DO);
		
	}

}
