package com.ola;

/**
 * Given two strings with any value of any length return the resulting string of
 * alternating characters from one and the other. Example with strings of the
 * same size: given the strings "Hello" and "World" then the result string is
 * "HWeolrllod". In this case the first character in the result must be the
 * first character of the first function parameter. With Strings of different
 * sizes repeat the mixing till the end of the larger string repeating
 * characters of the smaller one. Example: given the strings "Drinking" and
 * "beer" the the result is "Dbreienrkbienegr". With strings of different sizes
 * the result must start with the first character of the larger one. The result
 * must always end with a character of the other string value than the one used
 * to start the result value. White spaces do not have to be taken into account
 * even when calculating string sizes ("abcd" is larger than "a b c") Example:
 * with strings "Biking" and "the city" the result should be "tBhiekciintgyB"
 */

public class StringInterlacing {

	public static String interlace(final String first, final String second) {
		String str = first.replaceAll("\\s+", "");
		String str1 = second.replaceAll("\\s+", "");
		String result = "";
		if (str.length() > str1.length()) {
			char[] array = new char[str.length() + str.length()];
			for (int i = 0, j = 0, k = 0; i < array.length; i++) {
				if (i % 2 == 1) {
					array[i] = str1.charAt(k);
					k++;
					if (k == str1.length()) {
						k = 0;
					}
				} else {
					array[i] = str.charAt(j);
					j++;

				}
			}
			result = new String(array);
		} else if (str1.length() > str.length()) {
			char[] array = new char[str1.length() + str1.length()];
			for (int i = 0, j = 0, k = 0; i < array.length; i++) {
				if (i % 2 == 1) {
					array[i] = str.charAt(k);
					k++;
					if (k == str.length()) {
						k = 0;
					}
				} else {
					array[i] = str1.charAt(j);
					j++;

				}
			}
			result = new String(array);
		} else {
			char[] array = new char[str.length() + str.length()];
			for (int i = 0, j = 0, k = 0; i < array.length; i++) {
				if (i % 2 == 1) {
					array[i] = str1.charAt(k);
					k++;
				}
				else {
					array[i] = str.charAt(j);
					j++;
				}
				result = new String(array);
			}
		}
		// System.out.println(result);
		return result;
	}

}
