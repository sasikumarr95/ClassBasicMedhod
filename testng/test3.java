package testng;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class test3 {
WebDriver driver;

@BeforeTest
public void method(){ 
	ChromeOptions chromeOptions= new ChromeOptions();
	chromeOptions.setBinary("C:\\Program Files\\Google\\Chrome\\Application\\Chrome.exe");
System.setProperty("webdriver.chrome.driver","C:\\Users\\logesh radhakrishnan\\workspace\\z.selenium\\lib\\chromedriver\\chromedriver.exe");
driver= new ChromeDriver();
}
 @Test(priority =1)
  public void method1(){
	 driver.get("https://seleniumhq.org");
	
}
@Test(priority=2)
public void method2(){
	driver.findElement(By.xpath("//*[@id='menu_download']/a"));
	
}
@AfterTest
	public void method3(){
	driver.quit();
}
}
