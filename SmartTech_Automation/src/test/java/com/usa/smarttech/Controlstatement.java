package com.usa.smarttech;

import java.util.Scanner;

public class Controlstatement {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int num;
		System.out.print("Enter int value:");
		num = input.nextInt();
		
		if(num>0) {
			System.out.println("Positive");
		}
		else if(num<0) {
			System.out.println("Negative");
		}
		else {
			System.out.println("Print Zero");
		}
		
		
	}

}
