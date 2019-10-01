package com.ola;

/**
 * This time no story, no theory. The examples below show you how to write
 * function accum:
 * Examples:
 * accum("abcd") -> "A-Bb-Ccc-Dddd" 
 * accum("RqaEzty") -> "R-Qq-Aaa-Eeee-Zzzzz-Tttttt-Yyyyyyy" 
 * accum("cwAt") -> "C-Ww-Aaa-Tttt"
 * The parameter of accum is a string which includes only letters from a..z and
 * A..Z.
 */

public class Accumul {

	public static String accum(String s) {
		// gives an array of characters based on the string input
		char[] charArray = s.toCharArray();
		String str = "";
		for (int i = 0, j = 1; i < s.length(); i++, j++) {
			for (int k = 0; k < j; k++) {
				if (k == 0) {
					char z = Character.toUpperCase(charArray[i]);
					str += z;
				} else {
					char f = Character.toLowerCase(charArray[i]);
					str += f;
					// System.out.println(charArray[i]);
					// System.out.println(str);
				}
			}
			if (i == (s.length() - 1))
				;
			else
				str += "-";
		}
		//System.out.println(str);
		return str;
	}
}
