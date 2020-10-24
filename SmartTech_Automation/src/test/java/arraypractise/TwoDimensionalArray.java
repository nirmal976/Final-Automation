package arraypractise;

public class TwoDimensionalArray {

	public static void main(String[] args) {

		String nam [][]= new String [2][3];
		
		//System.out.println(nam.length); // only showing row number
		//System.out.println(nam[0].length); // column number 3
		
		// How to insert data in 2d Array
		
		nam[0][0]= "Nirmal";
		nam[0][1]= "Soma";
		nam[0][2] = "Aryan";
		
		nam[1][0] = "Asmita";
		nam[1][1] = "British Bangla";
		nam[1][2] = "Mymensingh";
		
		
		// Specific value
		
	//	System.out.println(nam[1][2]);
		
		// All the value using for loop
		
		/* for(int row=0; row<city.length;row++){
		 for (int col=0; col<city[row].length;col++){
		 System.out.println(city[row][col];
				
			}
		}	*/
		
		for (int row = 0; row < nam.length; row++) {
			
			for (int col = 0; col < nam[row].length; col++) {
				//System.out.println(nam[row][col]);
				nam[row][col]= "row*col";
			}
		}
		
			
		

	}

}
