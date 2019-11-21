package test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

class test2webclass {
	public static void main(String[] args) throws InterruptedException{
	
	System.setProperty("webdriver.chrome.driver","C:\\Users\\logesh radhakrishnan\\workspace\\z...seleniumtest\\chromedriver\\chromedriver.exe");
	
	WebDriver driver=new ChromeDriver();
	
	driver.get("https://freecrm.com");
	driver.manage().window().maximize();
	Thread.sleep(4000);
    WebElement loginlink = driver.findElement(By.xpath("/html/body/div[1]/header/div/nav/div[2]/div/div[2]/ul/a"));
    loginlink.click();
    Thread.sleep(4000);
    
    WebElement user = driver.findElement(By.xpath("//input[@type='text']"));
    user.sendKeys("sasikumarr95@gmail.com");
    
    WebElement password = driver.findElement(By.xpath("//input[@type='password']"));
    password.sendKeys("Sasi@2777");
    Thread.sleep(4000);
    
    WebElement login = driver.findElement(By.xpath("//div[@class='ui fluid large blue submit button']"));
    login.click();
    Thread.sleep(7000);
    
    
    driver.quit();
    
	}
	
	}


