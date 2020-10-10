package com.inheritance;

public class TestPersonTeacher {

	public static void main(String[] args) {
		
		Teacher t1 = new Teacher();
		t1.name = "Nirmal Dey";
		t1.age= 35;
		t1.qualification="M.Sc in Physics";
		t1.display2();
		
		Teacher t2 = new Teacher();
		t2.name = "Nurunnahar";
		t2.age= 34;
		t2.qualification="M.Sc in Physics";
		t2.display2();
		
		Teacher t3 = new Teacher();
		t3.name = "Aryan Nevaan";
		t3.age= 7;
		t3.qualification="2nd Grade";
		t3.display2();
		
		Teacher t4 = new Teacher();
		t4.name = "Asmita Jannat";
		t4.age= 1;
		t4.qualification="Not going to School";
		t4.display2();
	}

}
