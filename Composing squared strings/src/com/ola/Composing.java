package com.ola;

/**
 * A squared string is a string of n lines, each substring being n characters
 * long. We are given two n-squared strings. For example:
 * s1 = "abcd\nefgh\nijkl\nmnop" s2 = "qrst\nuvwx\nyz12\n3456" 
 * Let us build a new string strng of size (n + 1) x n in the following way:
 * The first line of strng has the first char of the first line of s1 plus the
 * chars of the last line of s2. 
 * The second line of strng has the first two chars of the second line of s1 
 * plus the chars of the penultimate line of s2 except the last char 
 * and so on until the nth line of strng has the n chars of
 * the nth line of s1 plus the first char of the first line of s2. 
 * Calling this function compose(s1, s2) we have:
 * compose(s1, s2) -> "a3456\nefyz1\nijkuv\nmnopq" 
 * or printed: 
 * abcd qrst --> a3456 
 * efgh uvwx     efyz1 
 * ijkl yz12     ijkuv 
 * mnop 3456 mnopq
 */

public class Composing {
	
	public static String compose(String s1, String s2) {
		String str = "";
		String[] a1 = s1.split("\n");
		String[] a2 = s2.split("\n");
		for (int i = 0, up = 1, down = a1[0].length() - 1, j = a1[0].length(); i < a1[0]
				.length(); i++, up++, down--, j--) {
			if (i == a1[0].length() - 1) {
				str += a1[i].substring(0, up) + a2[down].substring(0, j);
			} else
				str += a1[i].substring(0, up) + a2[down].substring(0, j) + "\n";
		}
		return str;
	}
}
