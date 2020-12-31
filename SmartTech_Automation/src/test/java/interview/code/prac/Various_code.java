package interview.code.prac;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Various_code {

	public static void click() {
		
		System.setProperty("webdriver.chrome.driver", "./Driver/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.amazon.com/");
		driver.manage().window().maximize();
		// 1st way
	//	driver.findElement(By.xpath("//span[@id='nav-link-accountList-nav-line-1']")).click();
		
		// 2nd way webElement object
		//WebElement element = driver.findElement(By.xpath("//span[@id='nav-link-accountList-nav-line-1']"));
	//	element.click();
		
		// 3rd way Actions Class
		
//		WebElement element = driver.findElement(By.xpath("//span[@id='nav-link-accountList-nav-line-1']"));
//		Actions action = new Actions(driver);
//		action.click(element).build().perform();
		
		// 4th way by JavaScriptExecutor
//		WebElement element = driver.findElement(By.xpath("//span[@id='nav-link-accountList-nav-line-1']"));
//		JavascriptExecutor js = (JavascriptExecutor)driver;
//		js.executeScript("arguments[0].click()", element);
		
		// 5th way for loop
		WebElement element = driver.findElement(By.xpath("//span[@id='nav-link-accountList-nav-line-1']"));
		for(int i=0;i<50;i++) {
			element.click();
			break;
		}
		
	}
	
public static void SendKeys() {
	System.setProperty("webdriver.chrome.driver", "./Driver/chromedriver.exe");
	WebDriver driver = new ChromeDriver();
	driver.get("https://www.amazon.com/");
	driver.manage().window().maximize();
	WebElement element = driver.findElement(By.xpath("//span[@id='nav-link-accountList-nav-line-1']"));
	for(int i=0;i<50;i++) {
		element.click();
		break;
	}
	
	// 1st way to send keys
	//driver.findElement(By.xpath("//input[@id='ap_email']")).sendKeys("deyaryan976@gmail.com");;
	
	// 2nd way
	WebElement sendkey = driver.findElement(By.xpath("//input[@id='ap_email']"));
	Actions action = new Actions(driver);
	action.sendKeys(sendkey, "deyaryan976@gmail.com").build().perform();


		
	}
	
	public static void problem() {
		
		int x= 10;
		int y= 20;
	//	x+=y;  // x= x+y
		x =+y;  //             if + is before the = sign than x=x+y , if + is after = than x = 0+y
		System.out.println(x);
				/*x += y is 	x = x + y
				x -= y is 		x = x - y
				x *= y is		x = x * y
				x /= y is 		x = x / y
				x %= y is 		x = x % y
				x ^= y is		x = x ^ y
				x &= y is 		x = x & y
				x |= y is 		x = x | y */
		
	}
	
	
	
	
	
	
	
	public static void main(String[] args) {
		//click();
		//SendKeys();
		problem();
}
	
}
