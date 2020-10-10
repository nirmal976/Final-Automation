package com.nyc.practise;

public class BreakAndContinue {

	public static void main(String[] args) {

		int i=1;
		
		/*for(i=1;(i<=100);i++) {
			
			if(i==15) {
			break;
			}
		}
		System.out.println(i);;*//// single statement break
		
		for(i=1;(i<=100);i=i+2) {
			
			if(i==20) {
			continue;
			}
			if(i>20) {
			break;	
			}
			System.out.println(i);
			
		}
		
	}

}
