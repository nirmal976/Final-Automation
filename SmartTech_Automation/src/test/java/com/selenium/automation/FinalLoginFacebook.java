package com.selenium.automation;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class FinalLoginFacebook {

	public static void main(String[] args) {
		
	WebDriver driver=BaseClassForAutomatio .getdriver();

		// goto the https://www.facebook.com/
	
	driver.get("https://www.facebook.com/");
	 
	// enter  email address 
	
	WebElement element = driver.findElement(By.id("email"));
	element.sendKeys("deyaryan976@gmail.com");
	
	// enter Password
	
	driver.findElement(By.id("pass")).sendKeys("Kanchijully1971");
	
	 // click login
	
	driver.findElement(By.id("u_0_b")).click();
	driver.manage().window().maximize();
	System.out.println("You Are Successfully Log into Facebook");
	
	//logout 
	driver.findElement(By.id("pageLoginAnchor")).click();
	
	
	//driver.findElement(By.linkText("Log Out")).click();
	
	driver.findElement(By.id("u_0_3")).click();
	
	System.out.println("You Are Successfully Log Out from Facebook");
	}

}
