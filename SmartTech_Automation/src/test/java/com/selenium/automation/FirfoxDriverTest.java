package com.selenium.automation;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;


public class FirfoxDriverTest {

	static WebDriver driver;
	
	
	public static void main(String[] args) {
		System.setProperty("webdriver.gecko.driver","./Driver/geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		driver.navigate() .to ("https://www.zoopla.co.uk");
		driver.manage().window().maximize();
		
		
		
		
	}
	
	

}
