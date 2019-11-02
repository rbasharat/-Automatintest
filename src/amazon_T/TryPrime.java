package amazon_T;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class TryPrime {
  WebDriver driver;
  
  @FindBy(xpath="//span[contains(text(),'Try Prime')]")
  WebElement TryPrime;
  @FindBy(xpath="//input[@class='prime-cta-signup-button-input']")
  WebElement Trybutton;
  
	

public TryPrime(WebDriver driver) {
	this.driver=driver;
	PageFactory.initElements(driver, this);
}
public void ClickingPrime () {
	TryPrime.click();
}
public void Clickingbutton () {
	Trybutton.click();
}
}