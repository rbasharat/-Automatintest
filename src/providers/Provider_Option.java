package providers;

import org.testng.annotations.Test;


import org.testng.annotations.DataProvider;
import org.testng.annotations.Parameters;
import org.testng.annotations.BeforeClass;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterClass;

public class Provider_Option {
	public static WebDriver driver;
  @Test(dataProvider = "dp")
  public void f(String first, String second) throws InterruptedException {
	  driver.findElement(By.id("email")).sendKeys(first);
	  Thread.sleep(3000);
	  driver.findElement(By.id("pass")).sendKeys(second);
	  driver.findElement(By.xpath("//input[@id='u_0_2']")).click();
	  Thread.sleep(3000);
	  driver.navigate().back();
	  driver.findElement(By.id("email")).clear();
	  Thread.sleep(3000);
	  driver.findElement(By.id("pass")).click();
	  Thread.sleep(3000);
	  
  }

  @DataProvider
  public Object[][] dp() {
    return new Object[][] {
      new Object[] { "something@gmail.com", "a" },
      new Object[] { "theOldOne", "b" },
      new Object[] {"240-495-8554","c" },
    };
  }
  @BeforeClass
 @Parameters ("browser")
  public void beforeClass(String browsers) {
	 if(browsers.equalsIgnoreCase("chrome")) {
	
		System.setProperty("webdriver.chrome.driver", "/Users/Basharat 1/Documents/Eclipse_docs/Selenium/src/chromedriver");
		driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(6, TimeUnit.SECONDS);
		driver.navigate().to("https://www.facebook.com");
	  

 }else if(browsers.equalsIgnoreCase("firefox")) {
	  System.setProperty("webdriver.gecko.driver", "/Users/Basharat 1/Documents/Eclipse_docs/Selenium/src/geckodriver");
	driver=new FirefoxDriver();
	driver.manage().timeouts().implicitlyWait(6, TimeUnit.SECONDS);
	driver.navigate().to("https://www.facebook.com");
 
	
  }else 
	  System.out.println("Correct to digits");
	  
  

}

	 
  
	  
  

  @AfterClass
  public void afterClass() {
	  driver.quit();
  }
  }


