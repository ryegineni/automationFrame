package com.auto.pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;

import com.auto.utils.Helper;

public class PageObjectsInit extends Helper {
	protected WebDriver driver = null;

	protected static HomePage hPage = null;
	protected static SearchPage searchPage = null;

	public WebDriver getDriver() {
		if (driver == null) {
			String path = System.getProperty("user.dir");
			System.setProperty("webdriver.chrome.driver", path + "/chromeDriver/chromedriver.exe");
			driver = new ChromeDriver();
			driver.manage().window().maximize();
		}

		hPage = new HomePage(driver);
		searchPage = new SearchPage(driver);

		return driver;
	}

	@BeforeTest
	public void beforeTest() {
		getDriver();
	}

	@AfterTest
	public void afterTest() {
		driver.quit();
	}

}
