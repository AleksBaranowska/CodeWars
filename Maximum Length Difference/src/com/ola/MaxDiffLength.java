package com.ola;

/**
 * You are given two arrays a1 and a2 of strings. Each string is composed with
 * letters from a to z. Let x be any string in the first array and y be any
 * string in the second array.
 * Find max(abs(length(x) − length(y)))
 * If a1 and/or a2 are empty return -1 in each language except in Haskell (F#)
 * where you will return Nothing (None).
 * Example:
 * a1 = ["hoqq", "bbllkw", "oox", "ejjuyyy", "plmiis", "xxxzgpsssa", "xxwwkktt",
 * "znnnnfqknaz", "qqquuhii", "dvvvwz"] 
 * a2 = ["cccooommaaqqoxii", "gggqaffhhh", "tttoowwwmmww"] 
 * mxdiflg(a1, a2) --> 13 
 * Bash note: input : 2 strings with
 * substrings separated by , output: number as a string
 */

public class MaxDiffLength {

	public static int mxdiflg(String[] a1, String[] a2) {
		if (a1.length == 0 || a2.length == 0)
			return -1;
		int a1Max = a1[0].length();
		int a1Min = a1[0].length();
		int a2Max = a2[0].length();
		int a2Min = a2[0].length();

		for (String s : a1) {
			if (s.length() > a1Max)
				a1Max = s.length();
			if (s.length() < a1Min)
				a1Min = s.length();
		}
		for (String s : a2) {
			if (s.length() > a2Max)
				a2Max = s.length();
			if (s.length() < a2Min)
				a2Min = s.length();

		}

		int result = a1Max - a2Min > a2Max - a1Min ? a1Max - a2Min : a2Max - a1Min;
		// System.out.println(result);
		return result;
	}
}
