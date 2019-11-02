package sel_Test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Slider {
	static WebDriver driver;

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "/Users/Basharat 1/Documents/Eclipse_docs/Selenium/src/chromedriver");
		driver=new ChromeDriver();
		
		 driver.navigate().to("https://jqueryui.com/slider/");
		 
		 driver.switchTo().frame(0);
		 WebElement sliders=driver.findElement(By.xpath("//span[@class='ui-slider-handle ui-corner-all ui-state-default']"));
				 
				 Actions op=new Actions(driver);
		 
		 Thread.sleep(4000);
		 
		 op.dragAndDropBy(sliders, 300, 0).build().perform();
		 
		 
	}

}
