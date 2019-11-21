package seleniiumtest;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class test7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver","C:\\Users\\logesh radhakrishnan\\workspace\\z.selenium\\lib\\chromedriver\\chromedriver.exe");  
		WebDriver driver = new ChromeDriver();
	 driver.manage().window().maximize();
	 driver.get("https://www.redbus.in/?gclid=EAIaIQobChMI46b3itb45AIVwRErCh3j5gKFEAAYASAAEgJ6IPD_BwE");
	WebElement autocomplete1 = driver.findElement(By.xpath("//*[@id='src']"));
	autocomplete1.sendKeys("chennai(All location)");
	autocomplete1.click();
	WebDriverWait wait = new WebDriverWait(driver,10);
	wait.until(ExpectedConditions.visibilityOf(autocomplete1));
	
	WebElement autocomplete2 = driver.findElement(By.xpath("//*[@id='dest']"));
	autocomplete2.sendKeys("palani");
	autocomplete2.click();
	
	WebElement date = driver.findElement(By.xpath("//*[@id='search']/div/div[3]"));
	date.click();
	
	//WebElement option= driver.findElement(By.xpath("//*[@id='search']/div/div[1]/div"));
	
	}

}
