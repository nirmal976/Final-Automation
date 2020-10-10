package com.selenium.automation;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
public class UPSLogInTest {
	// Declare WebDriver  global Variable
	static WebDriver driver; 
	public static void main(String[] args) {
		// Initialize chrome driver
		System.setProperty("webdriver.chrome.driver","./Driver/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		// Navigate the url
		driver.get("https://www.ups.com/us/en/Home.page");
		// Maximize the window
		driver.manage().window().maximize();
		// delete all cookies
		driver.manage().deleteAllCookies();
		// click on sign up /log in button
		driver.findElement(By.xpath("//a[text()='Sign up / Log in']")).click();
		
		// click sign in button
		driver.findElement(By.xpath("//a[@class='ups-link']")).click();
		// enter user name
		driver.findElement(By.id("email")).sendKeys("nirmal976");
		// enter password
		driver.findElement(By.id("pwd")).sendKeys("Bangladesh1971");
		// click log in
		driver.findElement(By.id("submitBtn")).click();
		// get the title page
		System.out.println(driver.getTitle());	
	}

}
