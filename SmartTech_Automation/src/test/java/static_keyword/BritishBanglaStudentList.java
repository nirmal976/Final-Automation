package static_keyword;

public class BritishBanglaStudentList {

	String name;
	int id;
	static String collegeName = "British-Bngla Institute of Management & Technology(BBIMT)";
	
	BritishBanglaStudentList(String n, int i){
		name= n;
		id = i;
		
	}
	
	void displayInformation() {
		
		System.out.println("Student Name :"+ name);
		System.out.println("Student id :"+ id);
		System.out.println("College Name :"+ collegeName);
		System.out.println("\n");
	}
	
	
}
