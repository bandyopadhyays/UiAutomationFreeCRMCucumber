package com.freecrm.cucumber.config.configeader;

import com.freecrm.cucumber.config.browser.BrowserType;
import com.freecrm.cucumber.util.PropertyReaderUtil;

public class ConfigReader implements Config {

	public String getUserName() {
		return PropertyReaderUtil.getPropertyValue("Username");
	}

	public String getPassword() {
		return PropertyReaderUtil.getPropertyValue("Password");
	}

	public String getAppURL() {
		return PropertyReaderUtil.getPropertyValue("Website");
	}

	public int getPageLoadTimeOut() {
		return Integer.parseInt(PropertyReaderUtil.getPropertyValue("PageLoadTimeOut"));
	}

	public int getImplicitWait() {
		return Integer.parseInt(PropertyReaderUtil.getPropertyValue("ImplicitWait"));
	}

	public int getExplicitWait() {
		return Integer.parseInt(PropertyReaderUtil.getPropertyValue("ExplicitWait"));
	}

	public BrowserType getBrowser() {
		return BrowserType.valueOf(PropertyReaderUtil.getPropertyValue("Browser"));
	}

}
