package pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Home {
	/*@findBy(id)
	 * 
	 */
	
	public WebDriver driver;
	
	
	
	@FindBy(id="email")
	WebElement emailfield;
	@FindBy(id= "pass")
	
	WebElement psswd;
	@FindBy(xpath= "//input[@id='u_0_2']']")
	WebElement loginbutton;
	@FindBy(linkText = "Forgot account?")
	WebElement forgotlink;
	
	
	public Home(WebDriver driver) {
		this.driver=driver;                  //when we calling global variable in local method we should use (this Key word)
		PageFactory.initElements(driver, this);
	}
	
	

	
	public void enteremail(String email) {                   //we have two types of methods in Java, simple and ... which accepts argument
		emailfield.sendKeys(email);	
	}
	
	public void enterpasswd(String password) {
		psswd.sendKeys(password);	
	}
	
	public void loginbutton() {
		loginbutton.click();
	}
	
	public void clickloginbutton() {
		forgotlink.click();
	}

	

}
