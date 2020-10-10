package methodoverridding;

public class SubClassB extends SupperClassA {

	int x = 90;
	
	
	void displayvalue() {
		System.out.println("Value of X :"+x );
		
		System.out.println("Value of super class X :"+super.x );
		
	}
	
}
