package amazon_T;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class N_Three {
	public WebDriver driver;
	
	@FindBy(id="ap_password")
	WebElement password;
	@FindBy(id="signInSubmit")
	WebElement signinclick;
	
	
	public N_Three (WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	
	public void pass (String pword) {
		password.sendKeys(pword);
	}
	
	public void enteringpword() {
		signinclick.click();
	}

}
