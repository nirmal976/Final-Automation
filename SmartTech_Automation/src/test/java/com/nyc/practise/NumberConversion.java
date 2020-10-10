package com.nyc.practise;

public class NumberConversion {

	public static void main(String[] args) {

		// Binary, octal, hexadecimal to Decimal

			/*String binary  = "101011";
			Integer decimal = Integer.parseUnsignedInt(binary, 2);
			
			System.out.println("Decimal number:"+decimal);*/
			
			/*String octal  = "456";
			Integer decimal = Integer.parseUnsignedInt(octal, 8);
			
			System.out.println("Decimal number:"+decimal);*/
			
			
			/*String haxadecimal  = "F";
			Integer decimal = Integer.parseUnsignedInt(haxadecimal, 16);
			
			System.out.println("Decimal number:"+decimal);*/
		
		// Decimal To Binary,octal,hexadecimal
		
		/*int decimal = 15;
		String binary = Integer.toBinaryString(decimal);
		
		System.out.println("Binary Number: "+binary);*/
		
		/*int decimal = 15;
		String octal = Integer.toOctalString(decimal);
		
		System.out.println("Octal Number: "+ octal);*/
		
		int decimal = 15;
		String hexadecimal= Integer.toHexString(decimal);
		
		System.out.println("Hexadecimal Number: "+ hexadecimal);
		
		
		

	}

}
