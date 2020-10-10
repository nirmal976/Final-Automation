package static_keyword;

public class VariableLengthArgumentTest {

	public static void main(String[] args) {
		VariableLengthArgument obj = new VariableLengthArgument();
		
		obj.variableLengthArgument(10,20);
		obj.variableLengthArgument(10,20,30);
		obj.variableLengthArgument(10,20,30,40);
		obj.variableLengthArgument(10,20,30,40,50);
		obj.variableLengthArgument(10,20,30,40,50,60);

	}

}
