package sel_Test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Testing_onceAgain {
	
	public static WebDriver driver;
	

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver", "/Users/Basharat 1/Documents/Eclipse_docs/Selenium/src/chromedriver");
		driver=new ChromeDriver();
		//driver.get("https://www.google.com");
		
		//there are two ways to open a Web in browser, the other way is driver.navigate(),
		
		driver.navigate().to("https://www.facebook.com");
		/*Thread.sleep(6000);
		driver.navigate().refresh();
		Thread.sleep(6000);
		driver.navigate().back();
		Thread.sleep(6000);
		driver.navigate().forward();
		Thread.sleep(6000);
		driver.manage().window().maximize();
		Thread.sleep(6000);
		driver.close();
		driver.quit();*/
		
		
		
		//driver.findElement(By.id("email")).sendKeys("shabirba@yahoo.com");
		//driver.findElement(By.id("pass")).sendKeys("Something@123");
		//driver.findElement(By.id("loginbutton")).click();
		
		
		//driver.findElement(By.linkText("Data Policy")).click();
		//driver.findElement(By.linkText("Terms")).click();
		//driver.findElement(By.linkText("Cookies Policy")).click();
		
		//driver.findElement(By.partialLinkText("Data")).click();
		
		//driver.findElement(By.name("firstname")).sendKeys("Sileeem");
		//driver.findElement(By.name("lastname")).sendKeys("sbz");
		//driver.findElement(By.name("reg_email__")).sendKeys("5717038999");
		
		//driver.findElement(By.className("tinyViewport tinyWidth")).click();
		
		driver.findElement(By.xpath("html/body/div/div/div/div/div/div/div/form/table/tbody/tr/td/input")).sendKeys("shabirba@yahoo.com");
		
		
		
		
		
		
		
		
		
		

	}

}
