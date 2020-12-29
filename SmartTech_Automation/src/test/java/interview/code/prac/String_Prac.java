package interview.code.prac;

public class String_Prac {

	public static void compareString() {
		// compare two string  by == and .equal method
		String s1 = new String("Java");
		String s2 = new String("Java");
		System.out.println(s1==s2);
	//	System.out.println(s1=s2);
		//System.out.println( s1.equals(s2));	
		
		// Compare the obj
		String s3 = "Nirmal";
		String s4 = "Nirmal";
		System.out.println(s3==s4);
	}
	
	public static void splitWord() {
		//How to break long string to small part
		String word = "United States of America";
		String [] wd = word.split(" ");
		for(String w : wd) {
			System.out.println(w);
		}
		
	}
	
	public static void ReverseString() {
		// Reverse String
		String obj = new String ("Nirmal");
		System.out.println("Before reversing method : "+ obj);
		String rev = new StringBuffer(obj).reverse().toString();
		System.out.println("After reversing method : "+ rev);
		
		
	}
	
	public static void getspecifier() {
		// How to get specific index value
		String obj = new String("Nirmal");
		char ch = obj.charAt(3);
		System.out.println("The specific char : " + ch);
	}
	
	public static void main(String[] args) {
		compareString();
	//	splitWord();
	//	ReverseString();
		//getspecifier();
		
		
	}
	
	
}
