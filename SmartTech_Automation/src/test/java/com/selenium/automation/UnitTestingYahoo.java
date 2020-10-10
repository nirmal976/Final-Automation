package com.selenium.automation;

import org.openqa.selenium.By;

import org.openqa.selenium.WebDriver;

import org.openqa.selenium.edge.EdgeDriver;

public class UnitTestingYahoo {
	
	static WebDriver driver;
	
	public static void main(String[] args) {
	
	System.setProperty("webdriver.edge.driver","./Driver/msedgedriver.exe");
	
	WebDriver driver = new EdgeDriver();
		
	driver.get("https://www.yahoo.com/");
	driver.manage().window().maximize();
	//driver.findElement(By.xpath("(//a[@class='_yb_1wm7v '])[1]")).click();
	driver.findElement(By.xpath("//span[@class='ybar-icon-sprite _yb_6h1kd _yb_pqjv3']")).click();
	driver.findElement(By.xpath("//*[@id=\"signin-main\"]/div[1]/a[2]/span")).click();
	driver.manage().deleteAllCookies();
	driver.findElement(By.id("login-username")).sendKeys("talk2nirmol@yahoo.com");
	driver.findElement(By.id("login-signin")).click();
	
	
	}

}
