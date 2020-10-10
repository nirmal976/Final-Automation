package methodoverridding;

public class TestMethodOverridding {

	public static void main(String[] args) {
		
		Teacher t1 = new Teacher();
		t1.name = "Nirmal Dey";
		t1.age = 35;
		t1.qualification = " M.Sc in Physics";
		
		Teacher t2 = new Teacher();
		t2.name = "Nurunnahar";
		t2.age = 34;
		t2.qualification = " M.Sc in Physics";
		
		
		t1.displayinformation();
		t2.displayinformation();
	}
}
