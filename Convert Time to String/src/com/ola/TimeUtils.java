package com.ola;

/**
 * Given time in seconds, return formatted string, as shown in following
 * example:
 * Example: 
 * Input: 90061 sec
 * Output: 1 1 1 1
 * e.g
 * 90061 sec: 1 1 1 1 (1 day, 1 hour, 1 min and 1 seconds) 
 * 93784 sec: 1 2 3 4 (1 day, 2 hours, 3 mins, 4 seconds)
 * Useful conversions:
 * 60 sec = 1 min 60 min = 1 hour 24 hour = 1 day 
 */

public class TimeUtils {

	public static String convertTime(int timeDiff) {
		String result = "";
		int days = timeDiff / 86400;
		int hours = (timeDiff - (days * 86400)) / 3600;
		int minutes = (timeDiff - (days * 86400) - (hours * 3600)) / 60;
		int seconds = (timeDiff - (days * 86400) - (hours * 3600) - (minutes * 60));
		result = "" + days + " " + hours + " " + minutes + " " + seconds;
		return result;
	}
}
