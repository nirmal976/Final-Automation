package static_keyword;

public class CallByValueTest {
	
	public static void main(String[] args) {
		
		CallByReferance obj = new CallByReferance();
		int y=10;
		System.out.println("x before Call:" + y);
		
		obj.CallByvalue(y);
		System.out.println("y after call :" +y);
		
	}

}
