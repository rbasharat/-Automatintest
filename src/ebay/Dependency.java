package ebay;

import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;
import org.testng.annotations.BeforeClass;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;

public class Dependency {
	public WebDriver driver;
  @Test
  public void f() {
	  int a=10;
	  int b=80;
	  int c=a+b;
	  System.out.println(c);
	  SoftAssert ui=new SoftAssert();
	  
	  ui.assertEquals(c, 900);
	  
	  Assert.assertEquals(c, 90);
	  System.out.println("This is after assertion");
	  ui.assertAll();
	 
  }
  @Test(dependsOnMethods = "f")
  public void ui() {
	  System.out.println("This is second method");
  }
  @Test
  public void upd() {
	  System.out.println("This is thirld method");
  }
  
  @BeforeClass
  public void beforeClass() {
  }

  @AfterClass
  public void afterClass() {
  }

}
