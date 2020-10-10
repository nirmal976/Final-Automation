package com.inheritance;

public class TestItemsOrders {

	public static void main(String[] args) {
		
		Orders o1 = new Orders();
		o1.setName("Coca Cola");
		o1.setId("CA-000888");
		o1.setNo(101);
		
		Orders o2 = new Orders();
		o2.setName("Pepsi");
		o2.setId("PE-000777");
		o2.setNo(102);
		
		
		/*System.out.println(o1.getName()); // otherway we can create 1 method in Orders than here we can call
		System.out.println(o1.getId());
		System.out.println(o1.getNo());*/
		
		o1.displayinformation(); // call from display information
		o2.displayinformation();
	}
	
}
