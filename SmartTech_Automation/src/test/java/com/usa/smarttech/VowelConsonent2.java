package com.usa.smarttech;

import java.util.Scanner;

public class VowelConsonent2 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		char ch;
		System.out.print("Enter any letter:");
		ch=input.next().charAt(0);
		
		if (ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u') {
			System.out.println("The letter is Vowel:"+ch);
		}
		else if(ch=='A'||ch=='E'||ch=='I'||ch=='O'||ch=='U'){
			System.out.println("The letter is Vowel:"+ch);
			
		}
		else {
			System.out.println("The letter is consonent:"+ch);
		}
	}

}
