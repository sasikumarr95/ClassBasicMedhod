package seleniiumtest;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class seleniumtest2 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver","C:\\Users\\logesh radhakrishnan\\workspace\\z...seleniumtest\\chromedriver\\chromedriver.exe");

		WebDriver driver=new ChromeDriver();
		
		driver.get("https://ui.freecrm.com");
		
		driver.manage().window().maximize();
		WebElement Loginlink = driver.findElement(By.xpath("/html/body/div[1]/header/div/nav/div[2]/div/div[2]/ul/a"));
		Loginlink.click();
		WebElement user = driver.findElement(By.name("email"));
		
		user.sendKeys("sasikumarr95@gmail.com");
	
		WebElement password =driver.findElement(By.name("password"));
		password.sendKeys("Sasi@2777");
		
		Thread.sleep(2000);
		
		WebElement login =driver.findElement(By.xpath("//*[@id='ui']/div/div/form/div/div[3]"));
		login.click();
		
		
		
		driver.quit();
		
	}

}
