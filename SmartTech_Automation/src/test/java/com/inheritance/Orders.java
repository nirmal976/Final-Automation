package com.inheritance;

public class Orders extends Items {
	
	private int no;

	public int getNo() {
		return no;
	}

	public void setNo(int no) {
		this.no = no;
	}
	
	
	void displayinformation() {
		
		System.out.println(getName()); // otherway we can create 1 method in Orders than here we can call
		System.out.println(getId());
		System.out.println(getNo());
		System.out.println("\n");
		
	}
	
 
}
