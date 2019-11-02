package pages;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;



public class Amazon_home {
	static WebDriver driver;

	
		 
	@FindBy(xpath= "//a[contains(text(),'Best Sellers')]")
	WebElement BestSellers;
	@FindBy(xpath= "//a[contains(text(),'New Releases')]")
	WebElement NewReleases;
	@FindBy(xpath= "//input[@id='twotabsearchtextbox']")
	WebElement SearchBox;
	@FindBy(xpath= "//div[contains(@class,'nav-search-submit nav-sprite')]//input[contains(@class,'nav-input')]")
	WebElement SearchKey;
	
	/*public Amazon_home (WebDriver driver) {
		Amazon_home.driver=driver;
		PageFactory.initElements(driver, this);
	}*/

	
	public void ClickingBSellers() {
		BestSellers.click();
	}
	
	public void ClickingNReleases() {
		NewReleases.click();
	}
	
	public void Searchbox() {
		SearchBox.sendKeys("Find Something Special");
	}
	
	public void Searching() {
		SearchKey.click();
	}



	
	
	
	
	
/*public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "/Users/Basharat 1/Documents/Eclipse_docs/Selenium/src/chromedriver");
		WebDriver driver=new ChromeDriver();
		  driver.manage().timeouts().implicitlyWait(6, TimeUnit.SECONDS);
		 driver.get("https://www.amazon.com");
		 Thread.sleep(5000);
		 Thread.sleep(5000);
		 driver.get("https://www.amazon.com");
		 Thread.sleep(5000);
		 driver.findElement(By.xpath("//a[contains(text(),'New Releases')]")).click();
		 Thread.sleep(5000);
		 driver.navigate().back();
		 Thread.sleep(4000);
		 driver.findElement(By.xpath("//input[@id='twotabsearchtextbox']")).sendKeys("Find Something Special for me"); 
		 driver.findElement(By.xpath("//div[contains(@class,'nav-search-submit nav-sprite')]//input[contains(@class,'nav-input')]")).click();
*/
	

	
	}


