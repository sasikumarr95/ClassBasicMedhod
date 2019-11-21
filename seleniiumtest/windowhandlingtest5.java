package seleniiumtest;

import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class windowhandlingtest5 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","C:\\Users\\logesh radhakrishnan\\workspace\\z.selenium\\lib\\chromedriver\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
			driver.get("http://book.theautomatedtester.co.uk/chapter1");
	driver.manage().window().maximize();
	WebElement link=driver.findElement(By.id("multiplewindow"));
	link.click();
	 Set<String> window = driver.getWindowHandles();
	 Iterator<String> it = window.iterator();
	 String parentwindow = it.next();
	 String childwindow = it.next();
	 driver.switchTo().window(childwindow);
	 
	//(synchronization method)
	 driver.manage().timeouts().implicitlyWait(10,TimeUnit.MICROSECONDS);
	 
	 WebElement text = driver.findElement(By.id("popuptext"));
	 
	 WebDriverWait wait = new WebDriverWait(driver, 10);
	 wait.until(ExpectedConditions.visibilityOf(text));
	 
	 
	 
	
	System.out.println(text.getText());
	WebElement close = driver.findElement(By.xpath("//p[@onclick='window.close();']"));
	close.click();
	driver.switchTo().window(parentwindow);
	
	wait.until(ExpectedConditions.presenceOfElementLocated(By.id("radiobutton")));
	
	WebElement h1 =driver.findElement(By.id("radiobutton"));
	h1.click();
	

	
	
	//Thread.sleep(4000);
	//driver.quit();
	 
	 
	
	
	}
	

}
