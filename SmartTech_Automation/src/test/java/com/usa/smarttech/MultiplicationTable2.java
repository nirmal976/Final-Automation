package com.usa.smarttech;

import java.util.Scanner;

public class MultiplicationTable2 {

	public static void main(String[] args) {
		   Scanner input =new Scanner(System.in);
		   
		   int num,range;
		   
		   System.out.print("Enter the number: ");
		   num=input.nextInt();
		   
		   System.out.print("Enter the range: ");
		   range=input.nextInt();
		   
		   for(int i=1; i<=range; i++){
			   
		   System.out.println(num+"x"+i+"="+num*i);
		   }
		   

	}

}
