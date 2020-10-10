package com.usa.smarttech;

import java.util.Scanner;

public class Celsiustofhrenheit {
	
	private void man() {
		Scanner input=new Scanner(System.in);
		
		double fahrenheit,celsius;
		
		System.out.print("Enter the fahrenheit:");
		
		fahrenheit=input.nextDouble();
		
		celsius= .55 * fahrenheit-32;
		
	System.out.println("celsius="+celsius);

	}

}
