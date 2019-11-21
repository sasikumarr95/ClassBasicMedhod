package seleniiumtest;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class dropdowntest4 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
System.setProperty("webdriver.chrome.driver","C:\\Users\\logesh radhakrishnan\\workspace\\z.selenium\\lib\\chromedriver\\chromedriver.exe");
WebDriver driver=new ChromeDriver();
	
	driver.get("https://www.w3schools.com/jsref/tryit.asp?filename=tryjsref_alert");
	driver.manage().window().maximize();
	driver.switchTo().frame("iframeResult");
	
	/*
	WebElement dropdown = driver.findElement(By.xpath("/html/body/select"));
			dropdown.click();
		
		Select s=new Select(dropdown);
		s.selectByVisibleText("Audi");*/
		//s.selectByValue("audi");
		//s.selectByIndex(3);
	
	WebElement tryit = driver.findElement(By.xpath("//button[@onclick='myFunction()']"));
	tryit.click();
	
	Alert a= driver.switchTo().alert();
	System.out.println(a.getText());
	a.accept();
	//a.dismiss();
			
		Thread.sleep(3000);
		driver.quit();
		
		
		
	}

}
