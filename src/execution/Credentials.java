package execution;

import static org.junit.Assert.*;

import java.util.concurrent.TimeUnit;

import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import pom.Home;



public class Credentials {
	
public static WebDriver driver;
	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
		System.setProperty("webdriver.chrome.driver", "/Users/Basharat 1/Documents/Eclipse_docs/Selenium/src/chromedriver");
		driver=new ChromeDriver();
		
		 //driver.navigate().to("https://jqueryui.com/slider/");
		 driver.manage().timeouts().implicitlyWait(6, TimeUnit.SECONDS);
		// driver.manage().deleteAllCookies();
		 driver.navigate().to("https://www.facebook.com");
		 
		 
	}

	@AfterClass
	public static void tearDownAfterClass() throws Exception {
	}

	@Before
	public void setUp() throws Exception {
	}

	@Test
	public void test() throws InterruptedException {
		Home homepage=new Home(driver);
		Thread.sleep(6000);
		homepage.enteremail("Basharat@Something.com");
		Thread.sleep(6000);
		homepage.enterpasswd("something");
		Thread.sleep(6000);
		homepage.clickloginbutton();
		
	}

}
