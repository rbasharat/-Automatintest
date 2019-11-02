package amazon_T;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeClass;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Reporter;
import org.testng.annotations.AfterClass;

public class NewTest {
	WebDriver driver;
	
  @Test
  public void f() {
	  Reporter.log("let's check the status of the report");
	  
	  N_One one=new N_One (driver);
	  N_Two two=new N_Two (driver);
	  N_Three three=new N_Three (driver);
	  one.Signin.click();
	  two.emailid.sendKeys("rabasharat@gmail.com");
	  two.clickcontinue.click();
	  three.password.sendKeys("shaheer2");
	  three.signinclick.click();
  }
  @BeforeClass
  public void beforeClass() {
	  System.setProperty("webdriver.chrome.driver", "/Users/Basharat 1/Documents/Eclipse_docs/Selenium/src/chromedriver");
		driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		driver.manage().deleteAllCookies();
			 driver.navigate().to("https://www.amazon.com");
  }

  @AfterClass
  public void afterClass() {
	  driver.navigate().back();
	  driver.quit();
  }

}
