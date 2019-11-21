package seleniiumtest;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;
import org.w3c.dom.Element;

public class test1 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		ChromeOptions chromeOptions= new ChromeOptions();
		chromeOptions.setBinary("C:\\Program Files\\Google\\Chrome\\Application\\Chrome.exe");
		System.setProperty("webdriver.chrome.driver","E:\\Drivers\\chromedriver.exe");
		WebDriver driver =new ChromeDriver(chromeOptions);
		
		/*driver.get("http://newtours.demoaut.com/");*/
		driver.get("https://capital.com");
		System.out.println(driver.getTitle());
		WebElement user = driver.findElement(By.name("email"));
		user.sendKeys("sasi".toUpperCase());
		WebElement password =driver.findElement(By.name("password"));
		password.sendKeys("Sasi@2777");
		
		
		String ToolTipText =driver.findElement(By.name("email")).getAttribute("title"); 
		
		Actions act = new Actions (driver);
		act.clickAndHold(user).moveToElement(password).build().perform();
		act.dragAndDrop(user,password ).build().perform();
		
		
		//Thread.sleep(4000);
		
		/*driver.findElement(By.xpath("//input[@type='text']")).sendKeys("underworld");
		driver.findElement(By.xpath("//input[@type='password']")).sendKeys("ramkumar");
		driver.findElement(By.xpath("//input[@type='image']")).click();*/
		//driver.findElement(By.xpath("//meta[@charset='utf-8']")).sendKeys("sasiramjo");
		//driver.findElement(By.xpath("//div[@jscontroller='mOzJ1b']")).click(); 	
				
	
		/*driver.navigate().back();
		driver.findElement(By.xpath("//a[@title='Overview of Selenium']")).click();
		*/
		
		 
		
		
		
	}

}
 