package com.ola;

/**
 * Write function RemoveExclamationMarks which removes all exclamation marks
 * from a given string. 
 */

public class Solution {
	static String removeExclamationMarks(String s) {
		String str = s.replaceAll("!", "");
		return str;
	}
}
