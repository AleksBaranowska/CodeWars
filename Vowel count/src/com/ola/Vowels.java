package com.ola;

/**
 * Return the number (count) of vowels in the given string.
 * We will consider a, e, i, o, and u as vowels for this Kata.
 * The input string will only consist of lower case letters and/or spaces.
 */

public class Vowels {
	
	public static int getCount(String str) {
		int vowelsCount = 0;
		char[] vowels = { 'a', 'e', 'i', 'o', 'u' };
		char[] chars = str.toCharArray();
		for (int i = 0; i < chars.length; i++)
			for (int j = 0; j < vowels.length; j++) {
				if (chars[i] == vowels[j]) {
					vowelsCount++;
				}
			}
		return vowelsCount;
	}

}
