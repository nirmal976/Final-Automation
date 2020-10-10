package com.nyc.practise;

public class OverLoadingConstractorTest {

	public static void main(String[] args) {

		OverloddingConstactor overloddingConstactor1 =new OverloddingConstactor();
		
		overloddingConstactor1.desplayInformation();
		
		OverloddingConstactor overloddingConstactor2 =new OverloddingConstactor("Nirmal Dey","Male");
		
		overloddingConstactor2.desplayInformation();
		
		OverloddingConstactor overloddingConstactor3 =new OverloddingConstactor("Soma","Female",6822270557l);
		
		overloddingConstactor3.desplayInformation();
	}

}
