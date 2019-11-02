package ebay;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeClass;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Reporter;
import org.testng.annotations.AfterClass;

public class Execute_Ebay {
	
	WebDriver driver;
	
  @Test
  public void f() {
	  
	  Reporter.log("This is checking our forgot link is working or not");
	  
	  Home home=new Home (driver);
	  Signin sign=new Signin (driver);
	  Signup s_Up=new Signup (driver);
	  
	  
	  home.clicksignin();
	 sign.creatanaccount();
	 s_Up.Firstname.sendKeys("Shaheer");
	 s_Up.lastname.sendKeys("Basharat");
	 s_Up.email.sendKeys("ShaheerBa@something.com");
	 
	  
	  
	  
	  
  }
  @BeforeClass
  public void beforeClass() {
    System.setProperty("webdriver.chrome.driver", "/Users/Basharat 1/Documents/Eclipse_docs/Selenium/src/chromedriver");
	driver=new ChromeDriver();
	driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
	driver.manage().deleteAllCookies();
		 driver.navigate().to("https://www.ebay.com");  
	 /* System.setProperty("webdriver.gecko.driver", "/Users/Basharat 1/Documents/Eclipse_docs/Selenium/src/geckodriver");
		driver=new FirefoxDriver();
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		driver.manage().deleteAllCookies();
			 driver.navigate().to("https://www.ebay.com");*/
		 
  }

  @AfterClass
  public void afterClass() {
  }

}
