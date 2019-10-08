package com.ola;

/**
 * Write a regex to validate a 24 hours time string. See examples to figure out
 * what you should check for:
 * Accepted: 01:00 - 1:00
 * Not accepted:
 * 24:00
 */

public class RegexValidation {

	public static boolean validateTime(String time) {
		return time.matches("([01]?[0-9]|2[0-3]):[0-5][0-9]");
	}

}
