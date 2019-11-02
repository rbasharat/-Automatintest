package ebay;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Home {
	public WebDriver driver;
	@FindBy(xpath="//a[contains(text(),'Sign in')]")
	WebElement Signinbutton;
	
	
	public Home (WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver, this);
	
	
	}
	
	public void clicksignin() {
		Signinbutton.click();
	}                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                 
}
