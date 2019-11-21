package testng;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class test2 {

WebDriver driver;

@BeforeTest
	public void method(){ 
	System.setProperty("webdriver.chrome.driver","C:\\Users\\logesh radhakrishnan\\workspace\\z.selenium\\lib\\chromedriver\\chromedriver.exe");
	driver= new ChromeDriver();
	driver.get("https://www.flipkart.com");
}
@Test
	public void flipkart(){
		//driver.get("https://www.flipkart.com");
	WebElement product = driver.findElement(By.name("q"));
	product.sendKeys("redmi5");
	WebElement search = driver.findElement(By.xpath("//button[@type='submit']"));
	search.click();
	
}
@AfterTest
	public void method2(){
	driver.close();
}    

	
}
