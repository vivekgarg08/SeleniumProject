package com.qa.testcases;


import org.testng.Assert;
import org.testng.annotations.*;

import com.google.common.base.Verify;
import com.qa.base.TestBase;
import com.qa.pages.HomePage;

public class FlightTestCases extends TestBase {

	HomePage homepage;

	public FlightTestCases() {
		super();
	}

	/*
	 * @BeforeTest public void setExtentReport() { setExtend(); }
	 */

	@BeforeSuite(alwaysRun = true)
	public void setUp() {
		initializaton();
		homepage = new HomePage();
		
	}

	@BeforeTest
	public void removePopup () {
		homepage.closeModal();
	}
	
	@Test(groups = { "Simple", "UI" })
	public void TC001_CheckifLogoisPresent() {
		boolean flag = homepage.isLogoDisplayed();
		Assert.assertTrue(flag);
	}

	@Test(groups = { "Functionality" })
	public void TC002_SelectFlightOption() {
		homepage.selectFlightOption();
	}



	@AfterSuite(alwaysRun = true)
	public void tearDown() {
		// FormatResult();
		tearDownMain();
	}

}
