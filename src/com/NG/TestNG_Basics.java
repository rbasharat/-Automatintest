package com.NG;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class TestNG_Basics {
	
	//Precondition annotations -------- Starts with @Before
	
	@BeforeSuite
	public void setUp() {
		System.out.println("Setup system property for chrome");
	}

	@BeforeTest
	public void launchBrowser() {
		System.out.println("launchBrowser ");
	}

	
	@BeforeClass
	public void login() {
		System.out.println("login to app");
		
		
	}
	
	@BeforeMethod
	public void enterUrl() {
		System.out.println("enter Url");
		
	}
	
	
	//test cases ----- starts with @Test
	@Test
	public void googleTitleTest() {
		System.out.println("Google title test");
		
	}
	
	@Test
	public void searchTest() {
		System.out.println("searchTest");
		
	}
	//Post Test Condition Annotations ------ Starts with @After
	
	@AfterMethod
	public void logOut() {
		System.out.println("logout from app ");
	}
	
	@AfterTest
	public void deleteAllcookies() {
		System.out.println("deleteAllCookies");
	}
	
	@AfterClass
	public void closeBrowser() {
		System.out.println("Close Browser");
		
	}
	
	@AfterSuite
	public void generateTestReport() {
		System.out.println("generateTestReport ");
	}
}
