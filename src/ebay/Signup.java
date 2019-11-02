package ebay;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Signup {
	
	public WebDriver driver;
	
	@FindBy(id="firstname")
	WebElement Firstname;
	@FindBy(id="lastname")
	WebElement lastname;
	@FindBy(id="email")
	WebElement email;
	@FindBy(id="PASSWORD")
	WebElement psswd;
	@FindBy(id="ppaFormSbtBtn")
	WebElement signup;
	
	public Signup(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver, this);
		
	}
	
	public void Firstnameoption(String name) {
		Firstname.sendKeys(name);
	}
	
	public void Lastname (String LName) {
		lastname.sendKeys(LName);
		
		
	}
	public void email (String Email) {
		email.sendKeys(Email);
	}
	public void password(String passw) {
		psswd.sendKeys(passw);
	}
	public void clicksubmit () {
		signup.click();
}
}
