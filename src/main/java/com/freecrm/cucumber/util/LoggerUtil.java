package com.freecrm.cucumber.util;

import java.io.FileNotFoundException;

import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;

public class LoggerUtil {

	private static boolean root = false;

	@SuppressWarnings("rawtypes")
	public static Logger getLogger(Class clz) {
		if (root) {
			return Logger.getLogger(clz);
		} else {
			try {
				PropertyConfigurator
						.configure(ResourceUtil.getResourceInputStream("com.freecrm.cucumber/src/main/resources/configfile/log4j.properties"));
			} catch (FileNotFoundException e) {
				e.printStackTrace();
			}

			root = true;
			return Logger.getLogger(clz);
		}
	}

}
