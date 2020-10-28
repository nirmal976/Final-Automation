package com.groupStudy;

public class BreakAndContinue {

	// How to break your loop and continue
	public static void main(String[] args) {

		/*int i ;
		for(i=1;i<10;i++) {
			System.out.println(i);
			if(i==5)
			break;  // break loop
		}*/
		int k;
		for(k=1;k<10;k++) {
			
			if(k==5) { // Skip the number 5
			continue; 
			}
			System.out.println(k);
		}

	}

}
