package test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class firstseleniumtest {

	public static void main(String[] args) {
	    
		//String projectLocation=System.getProperty("user.dir");
		
		
		System.setProperty("webdriver.chrome.driver","C:\\Users\\logesh radhakrishnan\\workspace\\z.selenium\\lib\\chromedriver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://seleniumhq.org/");
		driver.findElement(By.xpath("//a[@title='Selenium Projects']"));
		
		//Thread.sleep(millis);
		driver.quit();
		
		
	}

}
