package com.ola;

/**
 * Given a string S. You have to return another string such that even-indexed
 * and odd-indexed characters of S are grouped and groups are space-separated
 * (see sample below)
 * Note: 
 * 0 is considered to be an even index. 
 * All input strings are valid with no spaces 
 * input: 'CodeWars' 
 * output 'CdWr oeas'
 * S[0] = 'C' 
 * S[1] = 'o' 
 * S[2] = 'd' 
 * S[3] = 'e' 
 * S[4] = 'W' 
 * S[5] = 'a' 
 * S[6] = 'r'
 * S[7] = 's' 
 * Even indices 0, 2, 4, 6, so we have 'CdWr' as the first group 
 * odd ones are 1, 3, 5, 7, so the second group is 'oeas' 
 * And the final string to return is 'Cdwr oeas'
 */

public class OddEvenSort {
	
	public static String sortMyString(String s) {
		String a = "";
		String b = "";
		if (s != null)
			a += s.charAt(0);

		for (int i = 1; i < s.length(); i++) {
			if (i % 2 == 0)
				a += s.charAt(i);
			else
				b += s.charAt(i);
		}
		return a + " " + b;
	}
}
