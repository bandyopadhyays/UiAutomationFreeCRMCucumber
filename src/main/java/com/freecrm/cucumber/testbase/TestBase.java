package com.freecrm.cucumber.testbase;

import org.apache.log4j.Logger;
import org.openqa.selenium.WebDriver;

import com.freecrm.cucumber.config.browser.BrowserType;
import com.freecrm.cucumber.config.browser.ChromeBrowser;
import com.freecrm.cucumber.config.browser.FirefoxBrowser;
import com.freecrm.cucumber.util.LoggerUtil;

public class TestBase {

	private WebDriver driver;
	private static final Logger log = LoggerUtil.getLogger(TestBase.class);

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
}
