package sel_Test;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Calender {

	public static void main(String[] args) throws InterruptedException {
		

		System.setProperty("webdriver.chrome.driver", "/Users/Basharat 1/Documents/Eclipse_docs/Selenium/src/chromedriver");
		WebDriver driver=new ChromeDriver();
		
		
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		
		WebDriverWait ui=new WebDriverWait(driver, 10);
		
		driver.get("https://www.expedia.com");
		driver.findElement(By.xpath("//input[@id='package-departing-hp-package']")).click();
		
		ui.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//button[@data-day='26' and @data-month='9']")));
		
		driver.findElement(By.xpath("//button[@data-day='26' and @data-month='9']")).click();
		

		
		
		driver.findElement(By.id("package-returning-hp-package")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//button[@class='datepicker-cal-date end']")).click();
		
		
		

		
		

	}

}
