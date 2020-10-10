package com.selenium.automation;

import org.openqa.selenium.WebDriver;

public class TestAutomation {

	public static void main(String[] args) {

	WebDriver driver = BaseClassForAutomatio.getdriver();
		// Navigating website
	
	driver.get("https://www.facebook.com/");

	}

}
