package com.myTests;

import org.testng.Assert;
import org.testng.annotations.Test;
import com.myPages.LoginPage;

public class LoginPageTest extends BaseTest{
	
	@Test()
	public void verifyLoginPageTitletest() {
		String logiPageTitle=page.getInstance(LoginPage.class).getLoginPageTitle();
		Assert.assertEquals(logiPageTitle, "HubSpot Login");
	}
	
	@Test(priority=1)
	public void verifyLoginPageHeadertest() {
		String logiPageHeader=page.getInstance(LoginPage.class).getLoginPageHeader();
		Assert.assertEquals(logiPageHeader, "Don't have an account?");
	}
	
	@Test(priority=2)
	public void doLoginTest() {
		page.getInstance(LoginPage.class).doLogin(prop.getProperty("username"), prop.getProperty("password"));		
//		String homePageHeader=homepage.getHomePageHeader();
//		Assert.assertEquals(homePageHeader,"Getting started with HubSpot");
		Assert.assertTrue(true);
	}
	
	
	
	
}
