package seleniiumtest;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class test44 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
System.setProperty("webdriver.chrome.driver","C:\\Users\\logesh radhakrishnan\\workspace\\z.selenium\\lib\\chromedriver\\chromedriver.exe");
  
	WebDriver driver = new ChromeDriver();
	//driver.get("https://ui.freecrm.com");
	
	//driver.manage().window().maximize();
	/*
	WebElement Loginlink = driver.findElement(By.xpath("/html/body/div[1]/header/div/nav/div[2]/div/div[2]/ul/a"));
	Loginlink.click();
	Thread.sleep(4000);
	
	WebElement email = driver.findElement(By.name("email"));
	
	email.sendKeys("sasikumarr95@gmail.com");
	
	WebElement p1 = driver.findElement(By.name("password"));
	p1.sendKeys("sasi@2777");
	Thread.sleep(4000);
	WebElement login = driver.findElement(By.xpath("//div[@class='ui fluid large blue submit button']"));
	login.click();*/
	
	//Thread.sleep(4000);
	
	/*driver.switchTo().frame("iframeResult");
	
	WebElement checkbox1 = driver.findElement(By.name("vehicle1"));
	if(checkbox1.isDisplayed()){
		if(checkbox1.isEnabled()){
			if(checkbox1.isSelected()){
				checkbox1.click();
			}
		}
	}
	//driver.switchTo().frame("iframeResult");
	WebElement checkbox2 = driver.findElement(By.name("vechile2"));
	if(checkbox2.isDisplayed()){
		if(checkbox2.isEnabled()){
		if(checkbox2.isSelected()){
			checkbox2.click();
		
	}
	 }
      }
Thread.sleep(5000);
driver.quit();*/
	
	/*driver.get("https://www.w3schools.com/jsref/tryit.asp?filename=tryjsref_alert");
	driver.manage().window().maximize();
	
	driver.switchTo().frame("iframeResult");
	
	WebElement tryit = driver.findElement(By.xpath("//button[@onclick='myFunction()']"));
	tryit.click();
	
	Alert a =  driver.switchTo().alert();

	System.out.println(a.getText());
	
	a.accept();
	//a.dismiss();
	
	Thread.sleep(5000);
	driver.quit();*/

	
	driver.get("http://book.theautomatedtester.co.uk/chapter1");
	driver.manage().window().maximize();
	WebElement link = driver.findElement(By.id("multiplewindow"));
	 link.click();
	 
	 Set<String> window = driver.getWindowHandles();
	 Iterator <String> it = window.iterator(); 
	 String parentwindow = it.next();
	 String childwindow = it.next();
	 driver.switchTo().window(childwindow);
	 
	 WebElement w1 = driver.findElement(By.id("popuptext"));
	 System.out.println(w1.getText());
	 WebElement w2 = driver.findElement(By.xpath("//p[@onclick='window.close();']"));
	 w2.click();
	 
	 driver.switchTo().window(parentwindow);
	 
	 WebElement radio = driver.findElement(By.id("radiobutton"));
	 radio.click();
	 
	Thread.sleep(5000);
	driver.quit();
	}
}

	


