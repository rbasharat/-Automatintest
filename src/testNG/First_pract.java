package testNG;

import org.testng.annotations.Test;

import Browsers.Openbrowsers;
import pom.Home;

import org.testng.annotations.BeforeClass;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterClass;

public class First_pract {
	public WebDriver driver;
		
		

	
  @Test
  public void f() {
	  
	  Home home=new Home (driver);
	  home.clickloginbutton();
	  
  }
  @BeforeClass
  public void beforeClass() {
	  Openbrowsers browser=new Openbrowsers();
	  driver.manage().timeouts().implicitlyWait(6, TimeUnit.SECONDS);
	  browser.openingbrowser("https://www.faecebook.com");
	  
	  
  }

  @AfterClass
  public void afterClass() throws InterruptedException {
	  Thread.sleep(6000);
	  driver.close();
  }

}
