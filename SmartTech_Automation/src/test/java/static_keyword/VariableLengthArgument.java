package static_keyword;

public class VariableLengthArgument {

	void variableLengthArgument(int ...num) {
		
		int sum = 0;
		for(int x:num) {
			sum = sum + x;
		}
		
		System.out.println(sum);
	}
	
	
}
