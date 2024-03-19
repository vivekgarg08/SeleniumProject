package com.qa.testcases;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.qa.base.TestBase;
import com.qa.pages.FlightResultPage;
import com.qa.pages.HomePage;
import com.qa.pages.SearchFlightsPage;

public class SearchFlightTestCases extends TestBase {

	SearchFlightsPage searchFlightsPage;
	HomePage homePage;
	FlightResultPage flightResultPage;

	public SearchFlightTestCases() {
		super();
	}

	@BeforeMethod(alwaysRun = true)
	public void setUp() {
		 initializaton();
		homePage = new HomePage();
		searchFlightsPage = homePage.selectFlightOption();
	}


	@Test
	public void TC002_SearchFligh() {
		searchFlightsPage.SearchFlight(properties.getProperty("FromCity"), properties.getProperty("ToCity"),
				properties.getProperty("Date"));
	}


	  @AfterMethod public void tearDown() { 
		   //FormatResult();
		   tearDownMain(); 
		   }
	  } 
