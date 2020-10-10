package com.abstraction;

public class TestAbstractmethodlinkwithcollegeHostel extends CollegeHostel {

	@Override
	void getseatno() {
		System.out.println("Seat No : 101");
		
	}
	public static void main(String[] args) {
		
		TestAbstractmethodlinkwithcollegeHostel obj = new TestAbstractmethodlinkwithcollegeHostel();
		obj.StudentName();
		obj.StudentId();
		obj.HallName();
		obj.RoomNo();
		obj.getseatno();
	}

}
