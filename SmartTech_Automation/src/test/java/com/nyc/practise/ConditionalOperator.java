package com.nyc.practise;

import java.util.Scanner;

public class ConditionalOperator {

	public static void main(String[] args) {
		@SuppressWarnings("resource")
		Scanner input =new Scanner(System.in);
		
		int number1,number2, large;
		System.out.print("Enter Number:");
		number1=input.nextInt();
		System.out.println("Enter Number");
		number2=input.nextInt();
		
		large= (number1>number2) ? number1 : number2;
		
		System.out.println("Large number:"+large);
		
	}

}
