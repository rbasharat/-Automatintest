package amazon_T;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class N_One {
	
	public WebDriver driver;
	
	@FindBy(xpath="//div[@id='nav-signin-tooltip']//span[@class='nav-action-inner'][contains(text(),'Sign in')]")
	WebElement Signin;



public N_One (WebDriver driver) {
this.driver=driver;
PageFactory.initElements(driver, this);
}

public void clicksignin() {
	Signin.click();
	
}

}
