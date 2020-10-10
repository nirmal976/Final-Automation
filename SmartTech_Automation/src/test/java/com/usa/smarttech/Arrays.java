package com.usa.smarttech;

public class Arrays {public static void main(String[] args) {
	//single dimensional array
	//int a[] = new int[5]; //declared array with size 5. index start from 0, last index 4
	 // inserting the values in array
	
	/*a[0]=100;
	a[1]=200;
	a[2]=300;
	a[3]=400;
	a[4]=500; // this is the one way we insert the values in array*/

		//int a[] = {100,200,300,400,500};   // declared the values in array without size

		//System.out.println("The length of array is:"+a.length); // print length/size of an array
		//System.out.println(a[2]); // print specific value */
		
		/*for (int i=0;i< a.length;i++) {
			System.out.println(a[i]); // using for loop
		}*/
	// read values using enhanced for loop
		/*for(int i:a) {
			System.out.println(i);
		}*/

	//int b[]= {5,10,15,20,25,30,35,40,45,50};
	
	//System.out.println("Length of b:"+b.length);
	
	/*for(int i:b) {
		System.out.println(i);
	}*/
	
	/*for (int i:b) {
		System.out.println(i);
	}*/
	
	int a [][]=new int [3][2];
	
	a[0][0]=100;
	a[0][1]=200;
	
	a[1][0]=300;	
	a[1][1]=400;
	
	a[2][0]=500;
	a[2][1]=600;
	
	//int a[][]= {{100,200},{300,400},{500,600}};
	
	System.out.println("Number of rows:"+a.length);
	System.out.println("Number of column:" +a[0].length);
	
	/*for(int i=0;i<a.length;i++) {
		for(int j=0;j<a[i].length;j++) {
			System.out.println(a[i][j]);
		}
	}*/
	
	for(int i[]:a) {
		for(int j:i) {
			System.out.println(j);
		}
	}
	
	
	
	
	
	
}

}
