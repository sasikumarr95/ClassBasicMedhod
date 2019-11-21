package seleniiumtest;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.io.FileHandler;


public class test8 {

	

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver","C:\\Users\\logesh radhakrishnan\\workspace\\z.selenium\\lib\\chromedriver\\chromedriver.exe");  
		WebDriver driver = new ChromeDriver();
	 driver.manage().window().maximize();
	 
	driver.get("https://www.facebook.com");
	/* WebElement emailbox = driver.findElement(By.id("email"));
	 Actions a= new Actions(driver);
	 a.moveToElement(emailbox).click()
	 .keyDown(emailbox,Keys.SHIFT)
	 .sendKeys(emailbox,"hellow")
	 .keyUp(emailbox,Keys.SHIFT)
	 .doubleClick()
	 .build().perform();*/
	 
	 WebElement emailbox2 = driver.findElement(By.id("email"));
	 Actions b = new Actions (driver);
	 b.moveToElement(emailbox2).click()
	 .keyDown((emailbox2),Keys.SHIFT)
	 .sendKeys(emailbox2,"welcome")
	 .keyUp((emailbox2),Keys.SHIFT)
	 .doubleClick()
	 .build().perform();
	 
	/* driver.get("https://jqueryui.com/droppable/");
	 driver.switchTo().frame(0);
	 WebElement drag = driver.findElement(By.id("draggable"));
	 WebElement drop = driver.findElement(By.id("droppable"));
	 Actions a= new Actions(driver);
	 a.dragAndDrop(drag,drop).build().perform();
	 
	 File src = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
	 
	FileHandler.copy(src,new File("C:\\Users\\logesh radhakrishnan\\Pictures\\screenshot.jpeg"));*/
	 
	 
	 
	 
	 
	}

}
