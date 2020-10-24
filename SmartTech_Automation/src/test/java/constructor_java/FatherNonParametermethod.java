package constructor_java;

public class FatherNonParametermethod {

	String Fname, Lname;
	int cell;
	// if I  add 1 method we can do  easy way
	
	/*void setInformation(String fn, String ln,int ph) {
		Fname = fn;
		Lname = ln;
		cell = ph;
		
	}*///   use in parameter method 
	
	// creating contractor 
	
	FatherNonParametermethod(String fn, String ln, int ph){
		Fname= fn;
		Lname=ln;
		cell= ph;
	}
	
	FatherNonParametermethod(){
		System.out.println("Noting to display");
	}
	
	void display() {
		System.out.println("Name : "+ Fname);
		System.out.println("Age : "+ Lname);
		System.out.println("Cell : "+ cell);
	}
}
