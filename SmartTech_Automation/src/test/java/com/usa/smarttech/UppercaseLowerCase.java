package com.usa.smarttech;

import java.util.Scanner;

public class UppercaseLowerCase {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		char ch;
		System.out.print("Enter any letter:");
		ch=input.next().charAt(0);

		
		if(ch>='A'&& ch<='Z') {
			System.out.println("Upper Case:"+ch);
		}
		else if(ch>='a'&& ch<='z') {
			System.out.println("Lower Case:"+ch);
		}
		else {
			System.out.println("Not a letter Type"+ch);
		}
		
	}

}
