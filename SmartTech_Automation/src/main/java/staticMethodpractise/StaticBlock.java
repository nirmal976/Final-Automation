package staticMethodpractise;

public class StaticBlock {

	static String name;
	static int age;
	
	static {
		name = "Nirmal Dey";
		age = 36;
		
	}
	
	static void display() {
		System.out.println("Name :"+name);
		System.out.println("Age  :"+age);
		
	}
	
	public static void main(String[] args) {
		
		StaticBlock.display();
		
	}
}
