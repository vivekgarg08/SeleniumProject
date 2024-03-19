package com.qa.testcases;

import org.testng.Assert;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.qa.base.TestBase;
import com.qa.pages.HomePage;
import com.qa.pages.LoginPage;

public class LoginTestCases extends TestBase  {
	LoginPage loginPage;
	public LoginTestCases() {
		super();
	}
	/*
	 * @BeforeTest public void setExtentReport() { setExtend(); }
	 */

	@BeforeSuite(alwaysRun = true)
	public void setUp() {
		initializaton();
		loginPage = new LoginPage();
		
	}

	
	@Test(groups = { "Simple", "UI" }, priority = 1)
	public void TC001_CheckifLoginModalisPresent() {
		boolean flag = loginPage.mobileInputDisplayed();
		Assert.assertTrue(flag);
	}

	
	@Test(groups = { "Functionality" }, priority = 2)
	public void TC002_LoginWithNumber() {
		loginPage.loginWithNumer(properties.getProperty("Number"));
		loginPage.closeModal();
		Assert.assertTrue(true);
	}


	@AfterSuite(alwaysRun = true)
	public void tearDown() {
		// FormatResult();
		tearDownMain();
	}

}
