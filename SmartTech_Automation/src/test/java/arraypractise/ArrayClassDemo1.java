package arraypractise;

public class ArrayClassDemo1 {

	public static void main(String[] args) {
		String[][] names = { { "Mr. ", "Mrs. ", "Ms. " }, { "Alam", "Juma", "Tasvir" }};
		
		names [0][0]= "Mr.";
		names [0][1]= "Mrs.";
		names [0][2]= "Ms.";
		
		names [1][0]= "Alam";
		names [1][1]= "Juma";
		names [1][2]= "Tasvir";
		
		
		System.out.println(names [0][0]+names [1][0]);
		System.out.println(names [0][1]+ names [1][1]);

	}

}
