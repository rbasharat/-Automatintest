package Com.piit_session.amazon;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Reporter;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Reporterlog {
	WebDriver driver=new ChromeDriver();
	
	@Test
	public void testReport() {
		WebDriver driver=new ChromeDriver();
		 Reporter.log("Browser, Open");
		 driver.manage().window().maximize();
		 Reporter.log("Browser Maximized");
		 
		 Reporter.log("Application started");
		 driver.quit();
		 Reporter.log("Application closed");
			 
		
	}
	@BeforeTest
	public void BeforeTest() {
		
		System.setProperty("webdriver.chrome.driver", "/Users/Basharat 1/Documents/Eclipse_docs/Selenium/src/chromedriver");
		driver=new ChromeDriver();
		driver.get("https://google.com");
		
	}

}
