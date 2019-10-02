package com.ola;

/**
 * Create a function that will return a string that combines all of the letters
 * of the three inputed strings in groups. Taking the first letter of all of the
 * inputs and grouping them next to each other. Do this for every letter, see
 * example below!
 * Ex) Input: "aa", "bb" , "cc" => Output: "abcabc"
 * Note: You can expect all of the inputs to be the same length.
 */

public class Kata {
	
	public static String tripleTrouble(String one, String two, String three) {
		StringBuilder str = new StringBuilder();
		char[] str1 = one.toCharArray();
		char[] str2 = two.toCharArray();
		char[] str3 = three.toCharArray();
		for (int i = 0; i < str1.length; i++) {
			str = str.append(str1[i]).append(str2[i]).append(str3[i]);
		}
		String returnStr = str.toString();
		return returnStr;
	}

}
