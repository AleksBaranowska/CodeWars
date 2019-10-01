package com.ola;

/**
 * Simple, given a string of words, return the length of the shortest word(s).
 * String will never be empty and you do not need to account for different data
 * types.
 */

public class Kata {
	public static int findShort(String s) {
		String[] words = s.split("\\s+");
		int result = words[0].length();
		for (int i = 0; i < words.length; i++) {
			if (result > words[i].length())
				result = words[i].length();
		}
		return result;
	}

}
