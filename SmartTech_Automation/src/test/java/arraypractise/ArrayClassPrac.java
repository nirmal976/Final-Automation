package arraypractise;
import java.util.Arrays;
public class ArrayClassPrac {
	
	public static void singleArrayMethod() {
		int[] num = new int[6]; // it is fix
		int[] number = { 1, 2, 3, 4, 5, 6 };

		num[0] = 10;
		num[1] = 20;
		num[2] = 30;
		num[3] = 40;
		num[4] = 50;
		num[5] = 60;
		System.out.println(Arrays.toString(num));
		System.out.println(num[3]);

		for (int i = 0; i < num.length; i++) { // i j k
			System.out.println(i);
		}
		for (int j : num) {
			System.out.println(j);
		}
	}

	public static void multiArrayMethod() {

		String[][] names = { { "Mr. ", "Mrs. ", "Ms. " }, { "Alam", "Juma", "Tasvir" }, { "Alam", "Juma", "Tasvir" },
				{ "Alam", "Juma", "Tasvir" }, { "Alam", "Juma", "Tasvir" } };

		System.out.println(names[0][0] + names[1][2]);

		System.out.println(names[0][1] + names[1][1]);
	}

	/*public static void loopIncreaseValue() {
		for (int i = 0; i <= 1000; i++) {
			System.out.println(i);
		}
	}

	public static void loopDecreaseValue() {
    for(int i =100; i>1; i-- ) {
    	System.out.println(i);
    	
    }}
    public static void whileLoop() {
    	int i =1;
    	while(i<=100) {
    		System.out.println(i);
    		i++;
    	}
	}*/

	public static void main(String[] args) {
		multiArrayMethod();
		
		//whileLoop();
		//loopDecreaseValue();
		/*
		 * int a = 20; int b = 30; int c= 40; int d = 50; System.out.println(a);
		 * System.out.println(b); System.out.println(c); System.out.println(d);
		 */
	}

}


