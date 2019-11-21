package seleniiumtest;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class autooptionTest6 {

	public static void main(String[]args){ 
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver","C:\\Users\\logesh radhakrishnan\\workspace\\z.selenium\\lib\\chromedriver\\chromedriver.exe");  
		WebDriver driver = new ChromeDriver();
	 driver.manage().window().maximize();
	 driver.get("https://jqueryui.com/autocomplete/");
	 driver.switchTo().frame(0);
	 WebElement autocomplete = driver.findElement(By.xpath("//*[@id='tags']"));
	 autocomplete.sendKeys("a");
	 
	 WebElement autoOptions = driver.findElement(By.id("ui-id-1"));
	 WebDriverWait wait = new WebDriverWait(driver,10);
	 wait.until(ExpectedConditions.visibilityOf(autoOptions));
	
	 List<WebElement> option= autoOptions.findElements(By.tagName("li"));
	 for(WebElement options:option){
		 if(options.getText().equals("BASIC")){
			 options.click();
			 
		 }
		 
	 }
	 }
	

	}
			 

		 
		 
	 
	 
	 
	 
	 
	


