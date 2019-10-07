package com.ola;

/**
 * Write function alternateCase which switch every letter in string from upper
 * to lower and from lower to upper. E.g: Hello World -> hELLO wORLD
 */

public class Kata {
	
	static String alternateCase(final String string) {
		
		char[] charAr = string.toCharArray();
		char[] newChar = new char[charAr.length];
		for (int i = 0; i < charAr.length; i++) {
			if (string.isEmpty()) {
				return string;
			}
			if (Character.isLowerCase(charAr[i])) {
				newChar[i] = Character.toUpperCase(charAr[i]);
			} else
				newChar[i] = Character.toLowerCase(charAr[i]);
		}

		String str = new String(newChar);
		return str;
	}

}
