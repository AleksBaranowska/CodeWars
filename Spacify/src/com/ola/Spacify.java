package com.ola;

/**
 * Modify the spacify function so that it returns the given string with spaces
 * insertedbetween each character.
 * spacify("hello world") // returns "h e l l o w o r l d"
 */

public class Spacify {
	public static String spacify(String str) {
		char[] array = str.toCharArray();
		String result = "";
		for (int i = 0; i < array.length; i++) {
			if (i == array.length - 1) {
				result += array[i];
			} else
				result += array[i] + " ";
		}

		// System.out.println(result);
		return result;
	}
}
