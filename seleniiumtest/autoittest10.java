package seleniiumtest;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class autoittest10 {

	public static void main(String[] args) throws InterruptedException, IOException {
		// TODO Auto-generated method stub
System.setProperty("webdriver.chrome.driver","C:\\Users\\logesh radhakrishnan\\workspace\\z.selenium\\lib\\chromedriver\\chromedriver.exe");
		
		WebDriver driver =new ChromeDriver();
		driver.manage().window().maximize();
		/*driver.get("https://www.facebook.com");
		WebElement email = driver.findElement(By.id("email"));
		email.sendKeys("java");
		WebElement next = driver.findElement(By.xpath("//span[@class='RveJvd snByac']"));
		next.click();
		WebElement pass = driver.findElement(By.id("pass"));
		pass.sendKeys("abcd");
		WebElement nxt = driver.findElement(By.id("u_0_b"));
		nxt.click();
		*/
		/*
		driver.get("https://sabercathost.com");
		WebElement file = driver.findElement(By.xpath("//a[@class='slider-btn slider-btn-upload']"));
		Thread.sleep(4000);
		file.click();
		*/
		
		driver.get("https://www.4shared.com");
		WebElement file = driver.findElement(By.xpath("//*[@id='fstickcontent']/div[7]/div[1]/div/div[2]/form/div/label"));
	
		file.click();
		Thread.sleep(3000);
		Runtime.getRuntime().exec("C:\\Users\\logesh radhakrishnan\\Desktop\\selenium autoit.exe");
		//*[@id="fstickcontent"]/div[7]/div[1]/div/div[2]/form/div/label
		
		
		
		
	}

}
