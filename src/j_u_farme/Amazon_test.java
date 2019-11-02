package j_u_farme;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Amazon_test {
	static WebDriver driver;

	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
		System.setProperty("webdriver.chrome.driver", "/Users/Basharat 1/Documents/Eclipse_docs/Selenium/src/chromedriver");
		driver=new ChromeDriver();
		
		 driver.navigate().to("https://amazon.com");
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
		Thread.sleep(4000);
	}

	@Test
	public void test() {
		driver.findElement(By.xpath("//div[@id='nav-signin-tooltip']//span[@class='nav-action-inner']"
				+ "[contains(text(),'Sign in')]")).click();
	}

}
