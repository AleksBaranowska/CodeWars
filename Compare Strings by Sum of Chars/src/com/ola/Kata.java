package com.ola;

/**
 * Compare two strings by comparing the sum of their values (ASCII character
 * code). * For comparing treat all letters as UpperCase null/NULL/Nil/None should be
 * treated as empty strings If the string contains other characters than
 * letters, treat the whole string as it would be empty Your method should
 * return true, if the strings are equal and false if they are not equal.
 * Examples: 
 * "AD", "BC" -> equal 
 * "AD", "DD" -> not equal 
 * "gf", "FG" -> equal
 * "zz1", "" -> equal (both are considered empty) 
 * "ZzZz", "ffPFF" -> equal 
 * "kl", "lz" -> not equal 
 * null, "" -> equal
 */

public class Kata {

	public static Boolean compare(String s1, String s2)

	{
		
		int a = 0;
		int b = 0;
		if (s1 == null || s1.length() == 0 || !(s1.matches("[a-zA-Z]+")))
			a = 0;
		else
			a = count(s1.toUpperCase());
		if (s2 == null || s2.length() == 0 || !(s2.matches("[a-zA-Z]+")))
			b = 0;
		else
			b = count(s2.toUpperCase());
		if (a == b)
			return true;
		else
			return false;
	}

	public static int count(String str) {
		int result = 0;
		char[] array = str.toCharArray();
		for (int i = 0; i < array.length; i++) {
			result += array[i];
		}

		return result;
	}
}
