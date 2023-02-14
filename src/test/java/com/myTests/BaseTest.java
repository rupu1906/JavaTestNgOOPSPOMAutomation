package com.myTests;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;

import com.myPages.BasePage;
import com.myPages.Page;

public class BaseTest {

	WebDriver driver;
	public Page page;
	Properties prop;
	
	public BaseTest() {
		try {
			prop=new Properties();
			String path = System.getProperty("user.dir");
			System.out.println(path);
			FileInputStream ip = new FileInputStream(path+"\\src\\main\\resources\\config.properties");
			prop.load(ip);
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			
			e.printStackTrace();
		}
	}
	
	
	@BeforeMethod
	@Parameters({"browser"})
	public void setUpTest(String browser) {
		String url= prop.getProperty("url");
		
		if( browser.equalsIgnoreCase("chrome")){
			driver = new ChromeDriver();
		}
		else if( browser.equalsIgnoreCase("edge")){
			driver = new EdgeDriver();
		}
		else {
			System.out.println("No browser is defined in xml file");
		}
		
		driver.get(url);
		page = new BasePage(driver);
	}
	
	
	@AfterMethod
	public void tearDown() {
		driver.quit();
	}
}







