package sel_Test;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ScreenShotHandle {
	
	static WebDriver driver;

	public static void main(String[] args) {
		
		
		

		System.setProperty("webdriver.chrome.driver", "/Users/Basharat 1/Documents/Eclipse_docs/Selenium/src/chromedriver");
		driver=new ChromeDriver();
		
		driver.get("https://www.google.com");
		
	}
	
	public static void takeScreenshot(String fileName) throws IOException, InterruptedException {
		
		//1.take screenshot and store it as a file format:
		File file = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		//2. now copy the screenshot to desired location suing copy file method:
		FileUtils.copyFile(file, new File("/Users/Basharat 1/Documents/Eclipse_docs/Selenium/src/sel_Test //google.png"));
		
		Thread.sleep(3000);
		
		driver.quit();
		
		
		
		
	}

}
