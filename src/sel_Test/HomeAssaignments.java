package sel_Test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class HomeAssaignments {

	public static void main(String[] args) throws InterruptedException {
	
		WebDriver driver;
			System.setProperty("webdriver.chrome.driver", "/Users/Basharat 1/Documents/Eclipse_docs/Selenium/src/chromedriver");
			driver=new ChromeDriver();
			
			

			driver.get("https://www.amazon.com");
			driver.findElement(By.xpath("//input[@id='twotabsearchtextbox']")).sendKeys("Iphone");
			driver.findElement(By.xpath("//*[@id=\"nav-search\"]/form/div[2]/div/input")).click();
			driver.findElement(By.linkText("Simple Mobile - Apple iPhone 11 (64GB) - Black")).click();
			driver.findElement(By.linkText("Technical details")).click();
			Thread.sleep(3000);
			driver.navigate().back();
			driver.findElement(By.xpath("//img[@class='kfs-img']")).click();
			Thread.sleep(4000);
			driver.findElement(By.xpath("//div[@id='kfs_family_3']//img[@class='kfs-img']")).click();
			//driver.navigate().back();
			
			
			
			
			

	}

}
