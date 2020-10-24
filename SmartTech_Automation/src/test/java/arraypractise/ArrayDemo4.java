package arraypractise;

public class ArrayDemo4 {

	public static void main(String[] args) {
		// How to declare Array
					int a[]= new int [5];  
					
				//	How to initialize Array
					a [0]= 10;
					a [1]= 15;
					a [3]= 20;
					a [4]= 25;
					// How to get length of array
					
					/*int len = a.length;
					System.out.println("The Length of Array is: "+ len);*/
					
					// We can get it following way 
					
					System.out.println("The Length of Array is : "+ a.length);
					
					// sum of Array
					 int sum = (a [0]+ a [1] +a [3]+a [4]);
					System.out.println("The Sum of Array is :" +sum);
					
					// get all data in output
					
					for(int i= 0; i<a.length;i++) {
						System.out.println(a[i]);
					}

	}

}
