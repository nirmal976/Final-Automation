package com.selenium.automation;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LoginTest {
	
	static WebDriver driver;
	
	
	public static void main(String[] args) {

		System. setProperty("webdriver.chrome.driver", "C:\\Users\\deynirmal\\eclipse-workspace\\SmartTech_Automation\\Driver\\chromedriver.exe");
		// Initialize browser.
		WebDriver driver=new ChromeDriver(); // up casting
		driver.get("https://www.zoopla.co.uk/");

	}

}
