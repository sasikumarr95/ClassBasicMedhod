package TestCases;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class HomePageTest {
WebDriver driver;
 @Given("^Open facebook$")
 public void openfacebook(){
	 ChromeOptions chromeOptions= new ChromeOptions();
		chromeOptions.setBinary("C:\\Program Files\\Google\\Chrome\\Application\\Chrome.exe");
	System.setProperty("webdriver.chrome.driver","C:\\Users\\logesh radhakrishnan\\workspace\\z.selenium\\lib\\chromedriver\\chromedriver.exe");
	driver= new ChromeDriver(chromeOptions);
	driver.get("https://facebook.com");
	driver.manage().window().maximize();
 }
@When ("^validate data$")
	public void validatedata() throws InterruptedException{
	WebElement user = driver.findElement(By.name("email"));
	user.sendKeys("sasikumarr95@gmail.com");
	WebElement password = driver.findElement(By.name("pass"));
	password.sendKeys("sasiramjo");
	WebElement loginlink = driver.findElement(By.xpath("//input[@value='Log In']"));
	loginlink.click();
	//Thread.sleep(5000);
	
	//driver.navigate().back();
	try{
		Alert a = driver.switchTo().alert();
	}
	catch(){
		
	}
	
}
@And ("^Validate other$")
	public void vaidateother(){
	
	
	WebElement homepage = driver.findElement(By.xpath("//*[@id='navItem_100004503519907']/a/div"));
	homepage.click();
	driver.navigate().back();
}
@Then("^outcome$")
	public void outcome(){
	WebElement notification = driver.findElement(By.xpath("//*[@id='js_w']/div"));
	notification.click();
	driver.navigate().back();
	
}
@And("^close browser$")
	public void closebrowser(){
	System.out.println(driver.getTitle());
	driver.quit();
}
	
}

