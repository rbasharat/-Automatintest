package sel_Test;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Pointer {

	static WebDriver driver;

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "/Users/Basharat 1/Documents/Eclipse_docs/Selenium/src/chromedriver");
		driver=new ChromeDriver();
		
		 //driver.navigate().to("https://jqueryui.com/slider/");
		 driver.manage().timeouts().implicitlyWait(6, TimeUnit.SECONDS);
		 
		 Actions hover=new Actions(driver);
		 
		 driver.navigate().to("https://www.walmart.com");
		 
		 driver.manage().window().maximize();
		 
		 driver.findElement(By.xpath("//button[@class='f_a ak_c f_c']//span[@class='g_a g_h']")).click(); 
		 WebElement sign=driver.findElement(By.xpath("//body//button[10]"));
		 
		 hover.moveToElement(sign).build().perform();
		 Thread.sleep(4000);
		 hover.moveToElement(driver.findElement(By.xpath("//div[@id='dept-vHSNmakX-children']//div[@class='n_a n_l n_b'][contains(text(),'Kitchen')]"))).click().build().perform();
		 
		 Thread.sleep(5000);
		 driver.quit();
	}

}
