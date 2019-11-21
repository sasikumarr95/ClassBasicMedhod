package seleniiumtest;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class iframeTest3 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub


		System.setProperty("webdriver.chrome.driver","C:\\Users\\logesh radhakrishnan\\workspace\\z.selenium\\lib\\chromedriver\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.w3schools.com/tags/tryit.asp?filename=tryhtml5_input_type_checkbox");
		driver.manage().window().maximize();
	/*WebElement gmail=driver.findElement(By.linkText("Gmail"));
	gmail.click();
	
	driver.navigate().back();
	
	WebElement search=driver.findElement(By.name("q"));
	search.sendKeys("sasi");
	search.sendKeys(Keys.ENTER);*/
		
		driver.switchTo().frame("iframeResult");
		WebElement checkbox1 = driver.findElement(By.name("vehicle1"));
		
		if(checkbox1.isDisplayed()){	
	if(checkbox1.isEnabled()){
		if(!checkbox1.isSelected()){
			checkbox1.click();
		   }
	      }
		}
		/*WebElement checkbox2 = driver.findElement(By.name("vehicle2"));
		if (checkbox2.isDisplayed()){
			if (checkbox2.isEnabled()){
				if (!checkbox2.isSelected()){
					
				}
			}
		}*/
				
		
		
		
	//Thread.sleep(5000);
	//driver.quit();
	
	}

}
