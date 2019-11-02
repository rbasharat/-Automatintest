package Com.piit_session.amazon;



import org.testng.annotations.Test;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Parameters;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterClass;

public class NewTest {
	WebDriver driver;
  @Test
  public void f() throws InterruptedException {
	  Home ui=new Home(driver);
	  ui.homevalueput("800000");
	  Thread.sleep(6000);
	  ui.downpaymentid("80000");
	  Thread.sleep(6000);
	  ui.ir("28.0");
	  Thread.sleep(6000);
	  ui.bt();
	  
  }
  @BeforeClass
 // @Parameters("browser")
  public void beforeClass() {
		/* if(browsers.equalsIgnoreCase("chrome")) {
		  System.setProperty("webdriver.chrome.driver", "C:\\Users\\VAADMIN\\AppData\\Roaming\\Microsoft\\Windows\\Start Menu\\Programs\\Eclipse\\core_java\\Automation_aps_code\\Drivers\\chromedriver.exe");
			//WebDriver driver=new ChromeDriver();
		  driver=new ChromeDriver();
			driver.manage().timeouts().implicitlyWait(6,TimeUnit.SECONDS);
			driver.navigate().to("https://www.mortgagecalculator.org/");
			}else if (browsers.equalsIgnoreCase("firefox")){
				System.setProperty("webdriver.gecko.driver", "C:\\Users\\VAADMIN\\AppData\\Roaming\\Microsoft\\Windows\\Start Menu\\Programs\\Eclipse\\core_java\\Automation_aps_code\\src\\geckodriver.exe");
				//WebDriver driver=new ChromeDriver();
			 driver=new FirefoxDriver();
				driver.manage().timeouts().implicitlyWait(6,TimeUnit.SECONDS);
				driver.navigate().to("https://www.mortgagecalculator.org/");
				
			}else {
				System.out.println("Correct to digits");
			}*/
	  System.setProperty("webdriver.chrome.driver", "/Users/Basharat 1/Documents/Eclipse_docs/Selenium/src/chromedriver");
		
	  driver=new ChromeDriver();
	  driver.navigate().to("https://www.mortgagecalculator.org/");
	  
  }

  @AfterClass
  public void afterClass() {
  }

}