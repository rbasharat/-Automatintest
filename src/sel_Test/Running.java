package sel_Test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.safari.SafariDriver;

public class Running {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		/*int a=20;
		int b=30;
		int c=a+b;
		
		System.out.println("This is the value: "+c);       */
		
		WebDriver driver = new SafariDriver();
		
		driver.get("https://www.google.com");
		

	}

}
