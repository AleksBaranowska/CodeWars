package com.ola;

/**
 * Complete the method that takes a boolean value and return a "Yes" string for
 * true, or a "No" string for false.
 */

public class YesOrNo {
	public static String boolToWord(boolean b) {
		String str = "";
		if (b == true)
			str = "Yes";
		else
			str = "No";
		return str;
	}
}
