package com.usa.smarttech;
import java.util.Scanner;
 
public class CalulatorByMe {
 
	public static void main(String[] args) {
		
		Scanner input =new Scanner(System.in);
		int n1,n2,result;
		
		System.out.print("Enter 1st Number:");
		n1=input.nextInt();
				
		System.out.print("Enter 2nd  Number:");
		n2=input.nextInt();
		
		result = n1+n2;
		System.out.println("sum = :"+result);
		
		result = n1-n2;
		System.out.println("sub = :"+result);
		
		result = n1*n2;
		System.out.println("Multiplication = :"+result);
		
		double result1 = (double) n1 /n2;
		System.out.println("Division= :"+result1);
		
		result = n1%n2;
		System.out.println("Remaining = :"+result);
		
		

	}

}
