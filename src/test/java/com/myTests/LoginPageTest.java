package com.myTests;

import org.testng.Assert;
import org.testng.annotations.DataProvider;
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
	public void doLoginTestUsingPropFile() {
		page.getInstance(LoginPage.class).doLogin(prop.getProperty("username"), prop.getProperty("password"));		
//		String homePageHeader=homepage.getHomePageHeader();
//		Assert.assertEquals(homePageHeader,"Getting started with HubSpot");
		Assert.assertTrue(true);
	}
	
	@DataProvider(name = "dataprovider_for_doLogin")
	public Object[][] dataProvider(){
		
		return new Object[][] {{"dataProviderDemo@Demo.com","Password1"}, {"dataProviderDemo2@123Demo.com","Password2"}};
		
	}
	
	@Test(dataProvider="dataprovider_for_doLogin",priority=2)
	public void doLoginTestUsingDataProvider(String username, String password) throws InterruptedException {
		page.getInstance(LoginPage.class).doLogin(username, password);	
		Thread.sleep(5000);
		Assert.assertTrue(true);
	}
	
	
	
}
