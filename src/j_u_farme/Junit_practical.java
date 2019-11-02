package j_u_farme;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Junit_practical {
	
	static WebDriver driver;

	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
		
		System.setProperty("webdriver.chrome.driver", "/Users/Basharat 1/Documents/Eclipse_docs/Selenium/src/chromedriver");
		driver=new ChromeDriver();
		
		 driver.navigate().to("https://www.facebook.com");
	}

	@AfterClass
	public static void tearDownAfterClass() throws Exception {
		driver.quit();
	}

	@Before
	public void setUp() throws Exception {
		Thread.sleep(4000);
	}

	@After
	public void tearDown() throws Exception {
		Thread.sleep(6000);
		
	}

	@Test
	public void test() {
		driver.findElement(By.id("email")).sendKeys("shaheer@something.com");
		driver.findElement(By.id("pass")).sendKeys("something123");
		driver.findElement(By.xpath("//input[@id='u_0_2']")).click();
	}

}
