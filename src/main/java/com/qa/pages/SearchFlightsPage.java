package com.qa.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.qa.base.TestBase;

public class SearchFlightsPage extends TestBase {

	
	public SearchFlightsPage() {
		PageFactory.initElements(driver, this);
	}


	@FindBy(xpath = "//input[@placeholder=\"Where from?\"]")
	WebElement fromCity;

	@FindBy(xpath = "//input[@placeholder=\"Where to?\"]")
	WebElement toCity;

	@FindBy(xpath = "//div[contains(@class, 'fs-4 fw-500 c-inherit flex flex-nowrap ml-4')]")
	WebElement calender;


	@FindBy(xpath = "//div[contains(@class, 'home-search-btn')]")
	WebElement submitButton;



	public FlightResultPage SearchFlight(String from, String to, String date) {
		fromCity.sendKeys(from);
		toCity.sendKeys(to);
		calender.click();
		submitButton.click();
		return new FlightResultPage();

	}

}
