package com.selenium.automation;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class loginTestEdge {
	static WebDriver driver;
	
	public static void main(String[] args) {
		
		System.setProperty("webdriver.edge.driver", "C:\\Users\\deynirmal\\eclipse-workspace\\SmartTech_Automation\\Driver\\msedgedriver.exe");
		EdgeDriver driver = new EdgeDriver();

		driver.get("https://google.com");


	}


}
