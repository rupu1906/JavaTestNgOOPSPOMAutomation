/**
 * 
 */
package com.myPages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

/**
 * @author rupali
 *
 */
public class LoginPage extends BasePage {
	

	private By emailId=By.id("username");
	private By password= By.id("password");
	private By loginBtn= By.id("loginBtn");
	private By header = By.xpath("//i18n-string[@data-key='login.signupLink.text']");
	

	public LoginPage(WebDriver driver) {
		super(driver);
	}

	
	public WebElement getEmail() {
		return getElement(emailId);
	}


	public WebElement getPassword() {
		return getElement(password); 
	}


	public WebElement getLoginBtn() {
		return getElement(loginBtn); 
	}


	public WebElement getHeader() {
		return getElement(header);
	}
	
	public String getLoginPageTitle() {
		return getPageTitle();
	}
	
	public String getLoginPageHeader() {
		return getPageHeader(header);
	}
	
	public HomePage doLogin(String username, String password) {
		getEmail().sendKeys(username);
		getPassword().sendKeys(password);
		getLoginBtn().click();
		return getInstance(HomePage.class);
	}
	
	public void doLogin() {
		getEmail().sendKeys("");
		getPassword().sendKeys("");
		getLoginBtn().click();
	}
	
	public HomePage doLogin(String userCred) {
		if (userCred.contains("username")) {
			getEmail().sendKeys(userCred.split(":")[1].trim());
		}
		else if(userCred.contains("password")) {
			getEmail().sendKeys(userCred.split(":")[1].trim());
		}
		return getInstance(HomePage.class);
	}
	
	
}
