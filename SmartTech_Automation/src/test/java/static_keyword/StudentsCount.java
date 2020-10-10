package static_keyword;

public class StudentsCount {
	static int count = 0;   // if i use Instance variable output will come wrong
	
	
	StudentsCount(){
		 count++;
	}
	
	
	void displayTotlStudents() {
		
		System.out.println("Total Number of Student :"+count);
		
	}
	
	
}
