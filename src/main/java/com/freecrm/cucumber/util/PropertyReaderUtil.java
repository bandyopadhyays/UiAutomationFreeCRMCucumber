package com.freecrm.cucumber.util;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class PropertyReaderUtil {
	private static Properties prop;

	static {
		prop = new Properties();
		try {
			prop.load(ResourceUtil.getResourceInputStream("src/main/resources/configfile/config.properties"));
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	public static String getPropertyValue(String key) {
		return prop.getProperty(key);
	}

	/**
	 * public static void main(String[] args) {
	 * System.out.println(getPropertyValue("Username")); }
	 **/

}
