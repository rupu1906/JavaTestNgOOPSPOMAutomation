package com.myPages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class SignUpPage extends BasePage {
	
	private By firstName =By.name("FIRST_NAME");
	private By lastName = By.name("LAST_NAME");
	private By emailId = By.name("EMAIL");
	private By nextBtn = By.name("//button[@type='submit']");

	public SignUpPage(WebDriver driver) {
		super(driver);
	}
	
	public WebElement getFirstName() {
		return getElement(firstName);
	}

	public WebElement getLastName() {
		return getElement(lastName);
	}

	public WebElement getEmail() {
		return getElement(emailId);
	}

	public WebElement getNextBtn() {
		return getElement(nextBtn);
	}


	
}
