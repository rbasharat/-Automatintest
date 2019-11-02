package sel_Test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Iframe {

	public static void main(String[] args) {
		


		System.setProperty("webdriver.chrome.driver", "/Users/Basharat 1/Documents/Eclipse_docs/Selenium/src/chromedriver");
		WebDriver driver=new ChromeDriver();
		
		driver.navigate().to("http://demo.automationtesting.in/Frames.html");
		driver.switchTo().frame(driver.findElement(By.name("SingleFrame")));
		
		
		driver.findElement(By.xpath("//div[@class='col-xs-6 col-xs-offset-5']//input")).sendKeys("pitttt");
		
		
		
		
		
		
		
	}

}
