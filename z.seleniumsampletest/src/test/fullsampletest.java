package test;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class fullsampletest {

	public static void main(String[] args) throws IOException, InterruptedException {
		// TODO Auto-generated method stub
		ChromeOptions chromeOption= new ChromeOptions();
		chromeOption.setBinary("C:\\Program Files\\Google\\Chrome\\Application\\Chrome.exe");
	System.setProperty("webdriver.chrome.driver","C:\\Users\\logesh radhakrishnan\\workspace\\z.selenium\\lib\\chromedriver\\chromedriver.exe");
	WebDriver driver =new ChromeDriver(chromeOption);
	driver.get("https://www.facebook.com");
	driver.manage().window().maximize();
	
	WebElement user = driver.findElement(By.name("email"));
	user.sendKeys("sasikumarr95@gmail.com");
	WebElement password = driver.findElement(By.name("pass"));
	password.sendKeys("sasiramjo");
	WebElement loginlink = driver.findElement(By.xpath("//input[@value='Log In']"));
	loginlink.click();
	
	//upload photo
	WebElement uploadphoto = driver.findElement(By.xpath("//div[@class='uiScaledImageContainer _7h4s']"));
	uploadphoto.click();
	WebElement image = driver.findElement(By.xpath("//input[@type='file']"));
	image.click();
	Thread.sleep(5000);
	
	Runtime.getRuntime().exec("C:\\Users\\logesh radhakrishnan\\Desktop\\selenium autoit2.exe");
	
	
	
	}

}
