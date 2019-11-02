package Com.piit_session.amazon;



import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Home {
	WebDriver driver;
	@FindBy(id="homeval")
	WebElement homevaluetext;
	@FindBy(id="downpayment")
	WebElement downpaymentoption;
	@FindBy(id="loanamt")
	WebElement loanfl;
	@FindBy(id="intrstsrate")
	WebElement it;
	@FindBy(name="ratebutton")
	WebElement buttoncl;
	public Home(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver, this);
		
	}
	
	public void homevalueput(String digits) {
		homevaluetext.clear();
		homevaluetext.sendKeys(digits);
	}
	public void downpaymentid(String ui) {
		downpaymentoption.clear();
		downpaymentoption.sendKeys(ui);
	}
	public void ir(String ow) {
		it.clear();
		it.sendKeys(ow);
	}
	public void bt() {
		buttoncl.click();
	}
}
