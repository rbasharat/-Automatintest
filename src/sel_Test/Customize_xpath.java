package sel_Test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Customize_xpath {

	public static void main(String[] args) throws InterruptedException {
		
		

		System.setProperty("webdriver.chrome.driver", "/Users/Basharat 1/Documents/Eclipse_docs/Selenium/src/chromedriver");
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://www.facebook.com/");
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.findElement(By.xpath("//input[@name= 'email']")).sendKeys("Shaheer");
		Thread.sleep(4000);
		
		driver.findElement(By.xpath("//input[@type= 'password'and @name= 'pass']")).sendKeys("Khan");
		
		Thread.sleep(4000);
		
		driver.findElement(By.xpath("(//input[contains(@aria-label, ' email')])[1]")).sendKeys("240-495-0000");
		
		Thread.sleep(4000);
		
		//driver.findElement(By.xpath("//input[@type= 'submit']")).click();
		
		//driver.navigate().back();
		
		Thread.sleep(4000);
		driver.findElement(By.xpath("//*[starts-with(@aria-label, 'New')]")).sendKeys("240-495-8334");
		
		Select dropdown=new Select(driver.findElement(By.id("month")));      //it is using constructor of overloading
		dropdown.selectByVisibleText("Aug");
		Thread.sleep(4000);
		Select drop=new Select(driver.findElement(By.name("birthday_day")));
		drop.selectByVisibleText("12");
		Select dropd=new Select(driver.findElement(By.name("birthday_year")));
		dropd.selectByValue("1974");
		
		driver.findElement(By.id("u_0_a")).click();
		
		
		
		
		
		
	
		
		
		
	}

}
