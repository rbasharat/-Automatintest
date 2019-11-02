package sel_Test;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Windows_Act {
	
	static WebDriver driver;

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver", "/Users/Basharat 1/Documents/Eclipse_docs/Selenium/src/chromedriver");
		driver=new ChromeDriver();
		
		 driver.navigate().to("https://jqueryui.com/droppable/");
		String currentwindow=driver.getWindowHandle();
		System.out.println( currentwindow );
		Actions point=new Actions (driver);
		WebElement forgot=driver.findElement(By.xpath("//a[contains(text(),'Forgot account?')]"));
		
	  point.keyDown(Keys.SHIFT).click(forgot).build().perform();
		
		
		Set <String> ids=driver.getWindowHandles();
		System.out.println(ids);
		System.out.println(ids.size());
		
		for(String windowbrowser:ids) {
			if (windowbrowser != currentwindow) {
				driver.switchTo().window(windowbrowser); 
				
				driver.findElement(By.xpath("//input[@id='u_0_2']")).click();
				
		Thread.sleep(4000);
			
		driver.switchTo().frame(0);
		
		
	point.dragAndDrop(driver.findElement(By.id("draggable")),driver.findElement(By.id("droppable"))).build().perform();
	
	
	
	}
		}	

	}
}


