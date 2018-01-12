package com.freecrm.cucumber.testbase;

import org.apache.log4j.Logger;
import org.openqa.selenium.WebDriver;

import com.freecrm.cucumber.config.browser.BrowserType;
import com.freecrm.cucumber.config.browser.ChromeBrowser;
import com.freecrm.cucumber.config.browser.FirefoxBrowser;
import com.freecrm.cucumber.config.configeader.ConfigReader;
import com.freecrm.cucumber.util.LoggerUtil;

import cucumber.api.java.Before;

public class TestBase {

	public static WebDriver driver;
	private final Logger log = LoggerUtil.getLogger(TestBase.class);
	private ConfigReader objConfig = new ConfigReader();

	public WebDriver getDriverInstance(BrowserType bType) throws Exception {
		try {
			switch (bType) {

			case chrome:
				log.info("Intiallizing chrome driver..");
				ChromeBrowser ch = new ChromeBrowser();
				return ch.getChromeDriver();

			case firefox:
				log.info("Intiallizing firefox driver..");
				FirefoxBrowser ff = new FirefoxBrowser();
				return ff.getFirefoxDriverr();

			default:
				log.info("Unable to initialize driver");
				throw new Exception("Driver not found :- ");
			}
		} catch (Exception e) {
			e.printStackTrace();
			throw e;
		}
	}
	
	
	public void setUpDriver(BrowserType bType) throws Exception {
		driver = getDriverInstance(bType);
		driver.manage().window().maximize();
		driver.get(objConfig.getAppURL());
	}
	
	public void tearDown() {
		driver.quit();
	}
	
	@Before
	public void setUp() throws Exception {
		setUpDriver(objConfig.getBrowser());
	}
}
