package test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class crmfreetest22 {

	public static void main(String[]args) throws InterruptedException{
	
		System.setProperty("webdriver.chrome.driver","C:\\Users\\logesh radhakrishnan\\workspace\\z...seleniumtest\\chromedriver\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://freecrm.com");
		driver.manage().window().maximize();
		WebElement loginlink = driver.findElement(By.xpath("/html/body/div[1]/header/div/nav/div[2]/div/div[2]/ul/a"));
	    loginlink.click();
	    WebElement user = driver.findElement(By.name("email"));
	    user.sendKeys("sasikumarr95@gmail.com");
	    
	    WebElement password = driver.findElement(By.name("password"));
	    password.sendKeys("Sasi@2777");
	    Thread.sleep(4000);
	    
	    WebElement login = driver.findElement(By.className("ui fluid large blue submit button"));
	    login.click();
	    
		WebElement company=driver.findElement(By.className("item"));
		company.click();
		
		WebElement newcompany= driver.findElement(By.className("ui linkedin button"));
		newcompany.clear();
		
		WebElement companyname = driver.findElement(By.className("ui right corner labeled input"));
		companyname.sendKeys("hdb finacial services ltd");
		
		WebElement website = driver.findElement(By.className("field"));
		website.sendKeys("hdbfs.com");
		
		WebElement address = driver.findElement(By.name("address"));
		address.sendKeys("71a,wesr street");
		address.findElement(By.name("city"));
		address.sendKeys("coimbatore");
		address.findElement(By.name("state"));
		address.sendKeys("tamilnadu");
		address.findElement(By.name("zip"));
		address.sendKeys("641014");
		address.findElement(By.name("country"));
		address.sendKeys("india");
		
		WebElement phone=driver.findElement(By.className("dropdown icon"));
		phone.click();
		phone.findElement(By.xpath("//*[@id='ui']/div/div[2]/div[2]/div/div[2]/form/div[4]/div[1]/div/div/div/div[1]/div[2]/div[100]"));
		phone.click();
		phone.findElement(By.name("value"));
		phone.sendKeys("7010141629");
		
		WebElement description = driver.findElement(By.name("description"));
		description.sendKeys("nbfc");
		
		WebElement industry = driver.findElement(By.name("industry"));
		industry.sendKeys("banking");
		
		WebElement employe =driver.findElement(By.xpath("//*[@id='ui']/div/div[2]/div[2]/div/div[2]/form/div[8]/div[1]/div"));
		employe.sendKeys("25");
		
		WebElement stock = driver.findElement(By.name("symbol"));
		stock.sendKeys("hdfc");
		
		driver.quit();
	
	}
}

