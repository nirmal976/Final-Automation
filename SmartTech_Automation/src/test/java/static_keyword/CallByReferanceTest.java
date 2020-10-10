package static_keyword;

public class CallByReferanceTest {

	public static void main(String[] args) {
		
		CallByReferance   r1 = new CallByReferance();
		r1.name = "Nirmal";
				
		System.out.println("Before Calling : "+ r1.name);
		
		r1.change(r1);
		
		System.out.println("After Calling : "+ r1.name);
		
		
	}

}
