package objects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class GoogleSearchPage {
	WebDriver driver;
	public GoogleSearchPage(WebDriver driver) {
		this.driver = driver;
	}
	
	By searchBox =By.name("q");
	By searchBtn = By.xpath("(//input[@name='btnK'])[1]");
	
	public void searchGoogle(String searchInput) {
		try {
		driver.findElement(searchBox).sendKeys(searchInput);
		}
		catch(Exception e) {
			System.out.println("Exception Caught "+ e.getMessage());
		}
	}
	
}
