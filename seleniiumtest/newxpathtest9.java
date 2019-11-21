package seleniiumtest;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;


public class newxpathtest9 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
System.setProperty("webdriver.chrome.driver","C:\\Users\\logesh radhakrishnan\\workspace\\z.selenium\\lib\\chromedriver\\chromedriver.exe");
WebDriver driver = new ChromeDriver();
driver.manage().window().maximize();
	
	driver.get("file:///C:/Users/logesh%20radhakrishnan/Downloads/TablePage.html");
	//WebElement company = driver.findElement(By.xpath("//td[contains( text(),'Italy',)]"));
	
	/*//WebElement compant = driver.findElement(By.xpath("td[text()='Italy']"));
	String com = company.getText();
	System.out.println(com);
	*/
	List<WebElement> d = driver.findElements(By.tagName("th"));
	
	
	for(WebElement k:d){
		System.out.println(k.getText());
		}
	/*WebElement checkbox = driver.findElement(By.xpath("//td[text()='Italy']//parent::tr//following::td//input[@type='checkbox']"));
	checkbox.click();*/
	
	//  //td[text()='italy']//parent::tr//child::td//input[@type='checkbox1']
	}

}
