package com.nyc.practise;

public class Mathematics {

	public static void main(String[] args) {
		
		int  x = 20;
		int	 y = 10;
		int  z = -30;
		double p = 17.49;
		
		int max = Math.max(x, y);
		
		System.out.println("Maximum:"+max); 
		
		int min= Math.min(x, y);
		
		System.out.println("Minimum:" + min); 

		double absolute = Math.abs(z);
				
		System.out.println("Absolute Valu of z:"+absolute);
		
		double round= Math.round(p);
		System.out.println("Round Number:"+round);
		
		double  pi = Math.PI;
		System.out.println("Value of pi:"+pi);
		

		
	}

}
