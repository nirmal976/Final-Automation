package com.usa.smarttech;

import java.util.Scanner;

public class VowelConsonent {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);

		char ch;
		System.out.print("Enter any letter:");
		ch=input.next().charAt(0);
		
		if(ch=='a') {
			System.out.println("The letter is Vowel="+ch);
		}
		else if(ch=='e') {
			System.out.println("The letter is Vowel="+ch);
		}
		else if(ch=='i') {
			System.out.println("The letter is Vowel="+ch);
		}
		else if(ch=='o') {
			System.out.println("The letter is Vowel="+ch);
		}
		else if(ch=='u') {
			System.out.println("The letter is Vowel="+ch);
		}
		else
			System.out.println("The letter is Consonent="+ch);
	}

}
