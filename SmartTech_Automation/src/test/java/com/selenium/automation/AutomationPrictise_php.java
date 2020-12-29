package com.selenium.automation;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

	public class AutomationPrictise_php {
	static WebDriver driver;
	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver","./Driver/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://automationpractice.com/index.php");
		driver.manage().window().maximize();
		driver.findElement(By.partialLinkText("Sign in")).click();
		driver.findElement(By.xpath("//*[@id='email']")).sendKeys("deyaryan976@gmail.com");
		driver.findElement(By.xpath("//*[@id='passwd']")).sendKeys("nirmal976");
		System.out.println(driver.getTitle());
		
		driver.findElement(By.xpath("//*[@id='SubmitLogin']")).click();
		driver.findElement(By.xpath("(//*[contains(@class,'sf-with-ul')])[4]")).click();
		List <WebElement> list = driver.findElements(By.xpath("//*[@itemprop='price']")); ///////
		System.out.println("Total dress count num :" + list.size());
		for(WebElement select : list) {
			String listPrice = select.getText();
			System.out.println("Dress Price :" +listPrice);	
	}
		driver.findElement(By.xpath("(//*[@class='product-name'])[4]")).click();
		driver.findElement(By.xpath("//span[contains(text(),'Add to cart')]")).click();
		
		
	
		JavascriptExecutor js = (JavascriptExecutor) driver;  
		js.executeScript("arguments[0].click();",driver.findElement(By.xpath("(//*[@class='icon-chevron-right right'])[2]")));
		// Proceed to checkout 
		System.out.println("Total Shipping :"+ driver.findElement(By.xpath("//*[@id='total_shipping']")).getText());
		System.out.println("Total Price :"+ driver.findElement(By.xpath("//*[@id='total_price']")).getText());
		driver.findElement(By.partialLinkText("Sign out")).click();
		System.out.println("Logout Title :" + driver.getTitle());
		driver.quit();
	}
	
	
	
}
