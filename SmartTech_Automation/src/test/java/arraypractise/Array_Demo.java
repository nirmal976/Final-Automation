package arraypractise;

import java.util.Scanner;

public class Array_Demo {

	public static void main(String[] args) {
		
		@SuppressWarnings("resource")
		Scanner input = new Scanner(System.in);
		double sum = 0;
		double [] number = new double [5];
		System.out.print("Please Input 5 numbers: ");
		
		for (int i=0;i<5;i++) {
			number[i]= input.nextDouble();
		}
		/*number[0]= input.nextDouble(); // instead of this we can use for loop
		number[1]= input.nextDouble();
		number[2]= input.nextDouble();
		number[3]= input.nextDouble();
		number[4]= input.nextDouble();*/
		
		//sum= number[0]+number[1]+number[2]+number[3]+number[4];
		
		for(int i = 0; i<5;i++) {
			
			sum = sum+ number[i];
		}
		
		System.out.println("The sum is : "+ sum);
		
	}
	
}
