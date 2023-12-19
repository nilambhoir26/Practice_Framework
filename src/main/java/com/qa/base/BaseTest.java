package com.qa.base;

import java.util.Properties;

import org.openqa.selenium.WebDriver;

import com.qa.page.HomePage;
import com.qa.page.LoginPage;

import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;

public class BaseTest {	
	
	public Properties prop;
	public BasePage basepage;
	public WebDriver driver;
	public LoginPage loginpg;
	public HomePage homepg;
	
	@BeforeTest
	public void setup() {
		basepage = new BasePage();
		prop = basepage.init_Properties();
		String Browser = prop.getProperty("Browser");
		driver = basepage.init_driver(Browser);
		loginpg = new LoginPage(driver);
	}
	
	@AfterTest
	public void teardown() {
		driver.quit();
	}
	
	

}
