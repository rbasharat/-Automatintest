package sel_Test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Locators {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver;
		

		
			
			System.setProperty("webdriver.chrome.driver", "/Users/Basharat 1/Documents/Eclipse_docs/Selenium/src/chromedriver");
			driver=new ChromeDriver();
			
			/*driver.get("https://reg.ebay.com/reg/PartialReg?ru=https%3A%2F%2Fwww.ebay.com%2F");
			
			driver.findElement(By.name("firstname")).sendKeys("Shaheer");
			//driver.findElement(By.id("lbllastname")).sendKeys("Basharat");
			driver.findElement(By.xpath("//*[@id=\"lastname\"]")).sendKeys("Ahmad");
			driver.findElement(By.xpath("//*[@id=\"recaptcha-anchor\"]"));*/
			
			driver.get("https://www.google.com");
			
			driver.findElement(By.xpath("//input[@name='q']")).sendKeys("Shaheer Basharat");
			driver.findElement(By.xpath("//*[@id=\"tsf\"]/div[2]/div[1]/div[3]/center/input[1]")).click();
			
			//for drop down menu we use:
			//select select = new select(driver.findElement...By....)
			//select.selectBy.visibleText("Virginia");
			
			
		
			
			
			
			
			
			
			/*driver.get("https://reg.ebay.com/reg/PartialReg?ru=https%3A%2F%2Fwww.ebay.com%2F");
			driver.findElement(By.id("firstname")).sendKeys("BeautifulName");
			driver.findElement(By.xpath("//input[@id='lastname']")).sendKeys("CoolName");
			driver.findElement(By.xpath("//input[@id='lastname']")).sendKeys("Someone@something.com");
			driver.findElement(By.xpath("//*[@type=\"password\"]")).sendKeys("mypAssW0rd");
			driver.findElement(By.xpath("//div[@class='chkBox chk-med']//ul//li")).click();
			driver.findElement(By.xpath("//button[@class='btn btn--primary']")).click();*/
			
			
			
			driver.get("https://ui.cogmento.com");
			
			driver.findElement(By.name("email")).sendKeys("rabasharat@gmail.com");
			driver.findElement(By.xpath("//input[@placeholder='Password']")).sendKeys("Something@123");
			driver.findElement(By.xpath("//div[@class='ui fluid large blue submit button']")).click();
			
			Thread.sleep(3000);
			
			driver.findElement(By.xpath("//span[contains(text(),'Contacts')]")).click();
			Thread.sleep(3000);
			
			driver.findElement(By.xpath("//span[contains(text(),'Calendar')]")).click();
		
		
		
	}

}
