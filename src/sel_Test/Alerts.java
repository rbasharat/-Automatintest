package sel_Test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Alerts {

	public static void main(String[] args) throws InterruptedException {
		
		

		System.setProperty("webdriver.chrome.driver", "/Users/Basharat 1/Documents/Eclipse_docs/Selenium/src/chromedriver");
		WebDriver driver=new ChromeDriver();
		
		driver.get("http://demo.automationtesting.in/Alerts.html");
		//driver.findElement(By.xpath("//button[@class='btn btn-danger']")).click();
		//Thread.sleep(3000);
		
		//driver.switchTo().alert().accept();
		
		//driver.findElement(By.linkText("Alert with OK & Cancel")).click();
		//driver.findElement(By.xpath("//[*[@class='btn btb-primary']")).click();
		//driver.switchTo().alert().dismiss();
		
		//driver.findElement(By.xpath("//a[contains(text(),'Alert with OK & Cancel')]"));
		Thread.sleep(3000);
		//driver.findElement(By.xpath("//button[@class='btn btn-primary']")).click();
		//driver.switchTo().alert().accept();
		
		driver.findElement(By.linkText("Alert with Textbox")).click();
		Thread.sleep(3000);
		
		driver.findElement(By.xpath("//*[@class='btn btn-info']")).click();
		Thread.sleep(3000);

		driver.switchTo().alert().sendKeys("Shahbaz");
		driver.switchTo().alert().accept();
		
		
		
		
		
		

	}

}
