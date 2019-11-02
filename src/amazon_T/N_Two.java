package amazon_T;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class N_Two {
	public WebDriver driver;
	
	@FindBy(id="ap_email")
	WebElement emailid;
	@FindBy(id="continue")
	WebElement clickcontinue;
	
	public N_Two (WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	
	public void enterEmail(String email) {
		emailid.sendKeys(email);
	}
	
	public void continuebutton() {
		clickcontinue.click();
	}
}
