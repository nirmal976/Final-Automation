package com.usa.smarttech;

import java.util.Scanner;

public class EvenOddnumber {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		int num;
		System.out.print("Enter any Positive Integer:");
		num=input.nextInt();
		
		if(num%2==0) {
			System.out.println("The Number is Even:" +num);
		}
		else {
			System.out.println("The number is Odd:" +num);
		}
		
		
		
	}

}
