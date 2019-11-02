package sel_Test;



import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class XPath_Practice {

	public static void main(String[] args) throws InterruptedException {
		
		
		
		System.setProperty("webdriver.chrome.driver", "/Users/Basharat 1/Documents/Eclipse_docs/Selenium/src/chromedriver");
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://www.facebook.com");
		driver.findElement(By.xpath("//input[@id='u_0_f']")).sendKeys("Shaheer Khan");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@id='u_0_h']")).sendKeys("Basharat");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@name= 'reg_email__']")).sendKeys("240-000-0000");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[contains(@aria-label, 'New password')]")).sendKeys("something_nothing");
		Thread.sleep(2000);
		Select drop1 = new Select(driver.findElement(By.xpath("//select[@aria-label= 'Month']")));
		drop1.selectByVisibleText("Aug");
		Thread.sleep(2000);
		Select drop2 = new Select(driver.findElement(By.xpath("//select[@id='day']")));
		drop2.selectByValue("16");
		Thread.sleep(2000);
		Select drop3 = new Select(driver.findElement(By.xpath("//select[@title= 'Year']")));
		drop3.selectByValue("1980");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@id='u_0_a']")).click();
		
		
		String url=driver.getCurrentUrl();  //printing current url to the console
		System.out.println(url);
	    String windows=driver.getWindowHandle();
	    System.out.println(windows);
		
		
		
		
		
		
		
		
	

		
	}

}
