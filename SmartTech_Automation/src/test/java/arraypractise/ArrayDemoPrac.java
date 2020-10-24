package arraypractise;

public class ArrayDemoPrac {

		public static void singleDimensionArray() {
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
	 public static void twoDimensinonArray() {
		// How to Declare Two Dimension Array
		// String city [][] = new String [2][3];
	String city [][]= {{"Manhattan","Bronx","Queens"} , {"Staten island","Brooklyn","Westchester county"}};
		 
		 
		 // How to initialize Two Dimension Array
		/* city [0][0] = "Manhattan";
		 city [0][1] = "Bronx";
		 city [0][2] = "Queens";
		 
		 city [1][1] = "Staten island";
		 city [1][2]= "Brooklyn";
		 city [1][2]= "WestChester county";*/
		 
		 // How to get length
		 System.out.println(city.length); // only showing row number
		 System.out.println(city[0].length); // only showing column
		 
		 // Return Specific Value
		// System.out.println(city [0][1]);
		//System.out.println(city [1][2]);
		 
		 // How can we get all the value 
		 for (int row=0; row < city.length;row++) {
			  for (int col=0; col< city[row].length;col++) {
				  System.out.println(city[row][col]);
			  }
		 }
		 
	 }
	public static void main(String[] args) {
		singleDimensionArray();
		//twoDimensinonArray();
		
		
	}

}
