package com.selenium.automation;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ZooplaLoginTest {

	static WebDriver driver;
	
	public static void main(String[] args) {
	
		System.setProperty("webdriver.chrome.driver","./Driver/chromedriver.exe");/// upcasting
		
		WebDriver driver = new ChromeDriver();
		
		
		// Navigate to https://www.zoopla.co.uk/
		driver.get("https://www.zoopla.co.uk");
		driver.manage().window().maximize();
	
		
		driver.manage().timeouts().pageLoadTimeout(10, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
		
		//driver.findElement(By.className("css-fa8dvy e11d441i1")).click();
		//driver.close();
		
		driver.findElement(By.xpath("//button[@class='ui-button-primary ui-cookie-accept-all-medium-large']")).click();
		
		driver.findElement(By.xpath("(//*[@class='css-fa8dvy e11d441i1'])[4]")).click();
		driver.findElement(By.id("signin_email")).sendKeys("deyaryan976@gmail.com");
		driver.findElement(By.id("signin_password")).sendKeys("Nirmal976");
		driver.findElement(By.id("signin_submit")).click();
		driver.findElement(By.xpath("(//a[@data-testid='header-profile-account'])[1]")).click();
		System.out.println(driver.getTitle());
		
	}

}
