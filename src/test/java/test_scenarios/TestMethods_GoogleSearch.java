package test_scenarios;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import objects.GoogleSearchPage;

public class TestMethods_GoogleSearch {

	WebDriver driver;
	
	@SuppressWarnings("deprecation")
	@BeforeTest
	public void BeforeTest() {
		driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		driver.get("https://www.google.com/");
	}
	
	@Test
	public void searchOperations() {
		GoogleSearchPage page = new GoogleSearchPage(driver);
		page.searchGoogle("Facebook");
	}
	@AfterTest
	public void tearDown() {
		driver.quit();
	}
}
