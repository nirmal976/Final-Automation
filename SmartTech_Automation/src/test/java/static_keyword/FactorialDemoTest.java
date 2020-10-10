package static_keyword;

public class FactorialDemoTest {

	public static void main(String[] args) {
		
		FactorialDemo obj = new FactorialDemo();
		int result = obj.fact(5);
		System.out.println("Factorial of 5 = "+result);
		
		result = obj.fact(4);
		System.out.println("Factorial of 4 = "+result);
		
		result = obj.fact(3);
		System.out.println("Factorial of 3 = "+result);
		
	}

}
