package testng;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.Test;

public class emi {
	static WebDriver driver = null;
	//static WebElement element=null;
   @Test
   public void calculation() throws InterruptedException{
	   ChromeOptions chromeOptions= new ChromeOptions();
		chromeOptions.setBinary("C:\\Program Files\\Google\\Chrome\\Application\\Chrome.exe");
	System.setProperty("webdriver.chrome.driver","C:\\Users\\logesh radhakrishnan\\workspace\\z.selenium\\lib\\chromedriver\\chromedriver.exe");
	driver= new ChromeDriver(chromeOptions);
   /*System.setProperty("webdriver.chrome.driver","C:\\Users\\logesh radhakrishnan\\workspace\\z.selenium\\lib\\chromedriver\\chromedriver.exe");
   WebDriver driver = new ChromeDriver();
   */
   driver.get("https://emicalculator.net");
   Thread.sleep(2000);
   driver.manage().window().maximize();
   
   Actions actions = new Actions(driver);
   
   WebElement loanSliderircle = driver.findElement(By.cssSelector("#loanamountslider>span"));
   WebElement intrestSliderCircle = driver.findElement(By.cssSelector("#loaninterestslider>span"));
   WebElement tenureSliderCircle = driver.findElement(By.cssSelector("#loantermslider>span"));
   
   actions.dragAndDropBy(loanSliderircle,83,0).build().perform();
   Thread.sleep(2000);
   
   actions.dragAndDropBy(intrestSliderCircle,86,0).build().perform();
   Thread.sleep(2000);
   
   actions.dragAndDropBy(tenureSliderCircle,-108,0).build().perform();
   Thread.sleep(2000);
   
   WebElement loanEmiElement = driver.findElement(By.cssSelector("#emiamount>p>span"));
   String emiLoanText = loanEmiElement.getText();
   
   Assert.assertEquals("93,672",emiLoanText);
   Thread.sleep(5000);
   
   driver.quit();
   
 }
}
