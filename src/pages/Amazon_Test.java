package pages;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeTest;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.AfterTest;

public class Amazon_Test {
	
	static WebDriver driver;

  @Test
  public void f() {
	  
	  Amazon_home home = PageFactory.initElements(driver, Amazon_home.class);
	  home.BestSellers.click();
	  home.NewReleases.click();
	  home.SearchBox.sendKeys("Find Something Special");
	  home.SearchKey.click();
	  
  }
  
  @BeforeTest
	  public static void setUpBeforeClass() throws Exception {
			System.setProperty("webdriver.chrome.driver", "/Users/Basharat 1/Documents/Eclipse_docs/Selenium/src/chromedriver");
			driver=new ChromeDriver();
			 driver.navigate().to("https://amazon.com");
  }

  @AfterTest
  public void afterTest() {
	  driver.quit();
  }

}
