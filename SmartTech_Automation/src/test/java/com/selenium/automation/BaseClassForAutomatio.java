package com.selenium.automation;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

public  class BaseClassForAutomatio {

	public static WebDriver getdriver() {
		
		System.setProperty("webdriver.edge.driver" ,"C:\\Users\\deynirmal\\eclipse-workspace\\SmartTech_Automation\\Driver\\msedgedriver.exe");
		WebDriver driver = new EdgeDriver();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		return driver;
		
		
	}
		

	

}
