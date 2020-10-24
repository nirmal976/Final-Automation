package constructor_java;

public class Test_FatherNonParametermethod {

	public static void main(String[] args) {
		
		//FatherNonParametermethod f = new FatherNonParametermethod ();
		
		FatherNonParametermethod f = new FatherNonParametermethod ("Nirmal","Dey",3477444);
		
		FatherNonParametermethod f2 = new FatherNonParametermethod();
		
		/*f.Fname = "Nirmal "; // use in non parametermethod
		f.Lname = "Dey"; // Name : Nirmal Age : DeyCell : 111
		f.cell = 111;*/
		
		
	  // f.setInformation ("Nirmal","Dey",222); // use in parameter method 
		
		f.display();
		
		

	}

}
