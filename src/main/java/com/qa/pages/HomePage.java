package com.qa.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.qa.base.TestBase;

public class HomePage extends TestBase {

	public HomePage() {
		PageFactory.initElements(driver, this);
	}

	@FindBy(xpath = "//a[@data-test-attrib=\"cleartrip-logo\"]")
	WebElement logo;

	@FindBy(xpath = "//a[@href=\"/flights\"]")
	WebElement flightOption;

	@FindBy(xpath = "//a[@href=\"/hotels\"]")
	WebElement hotelOption;

	@FindBy(xpath = "//div[contains(@class, 'px-1   flex flex-middle nmx-1 pb-1')]")
	WebElement popUpClose;

	
	public boolean isLogoDisplayed() {
		return logo.isDisplayed();
	}
	
	public void closeModal() {
		if(popUpClose.isEnabled())
		{
			popUpClose.click();
		}
		
	}

	public SearchFlightsPage selectFlightOption() {
		;
		if (flightOption.isEnabled()) {
			flightOption.click();
		}
		return new SearchFlightsPage();
	}

	public SearchHotelPage selecthotelOption() {
		
		hotelOption.click();
		return new SearchHotelPage();
	}

}
