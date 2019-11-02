package sel_Test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


public class Testing {
	
	WebDriver driver;
	
	
	public void launchBrowser() {
		
		System.setProperty("WebDriver.chrome. Driver", "‎⁨/Users/Basharat 1/Documents/Eclipse_docs/Selenium/src/chromedriver");
		
		driver = new ChromeDriver();
		driver.get("https://www.google.com");
		
		
	}




	public static void main(String[] args) {
		
		
		Testing obj=new Testing();
		obj.launchBrowser();
		

	}

}
