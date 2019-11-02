package sel_Test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class MouseMovement {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "/Users/Basharat 1/Documents/Eclipse_docs/Selenium/src/chromedriver");
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://www.spicejet.com");
		Actions action=new Actions(driver);
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		
		action.moveToElement(driver.findElement(By.xpath("//li[@id='header-addons']//a[@id='highlight-addons']"))).build().perform();
		
		Thread.sleep(2000);
		
		driver.findElement(By.linkText("Visa Services")).click();
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//h3[contains(text(),'Afghanistan')]")).click();
		
		
		
	}

}
