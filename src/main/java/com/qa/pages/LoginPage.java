/**
 * 
 */
package com.qa.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.qa.base.TestBase;

/**
 * 
 */
public class LoginPage extends TestBase {

	/**
	 * 
	 */
	public LoginPage() {
		PageFactory.initElements(driver, this);
	}

	@FindBy(xpath = "//button[@contain(text()=\"login\"]")
	WebElement loginButton;

	@FindBy(xpath = "//input[@data-testid='Mobile']")
	WebElement mobileInput;

	@FindBy(xpath = "//div[contains(@class, 'px-1   flex flex-middle nmx-1 pb-1')]")
	WebElement popUpClose;

	public void closeModal() {
		if (popUpClose.isEnabled()) {
			popUpClose.click();
		}
	}

	public boolean mobileInputDisplayed() {
		return mobileInput.isDisplayed();
	}

	public void loginWithNumer(String number) {
		mobileInput.sendKeys(number);

	}

}
