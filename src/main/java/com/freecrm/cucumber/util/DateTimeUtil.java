package com.freecrm.cucumber.util;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;

public class DateTimeUtil {

	public static String getCurrentDateTime() {
		DateFormat dateFormat = new SimpleDateFormat("_MM_dd_yyyy_hh_MM_ss");
		Calendar cal = Calendar.getInstance();
		return dateFormat.format(cal.getTime());
	}

	public static String getCurrentDate() {
		return getCurrentDateTime().substring(0, 11);
	}

	/**
	 * public static void main(String[] args) { DateTimeUtil obj = new
	 * DateTimeUtil(); System.out.println(obj.getCurrentDateTime());
	 * System.out.println(obj.getCurrentDate()); }
	 **/

}
