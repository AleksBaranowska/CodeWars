package com.ola;

/**
 * We need a function that can transform a number into a string.
 * What ways of achieving this do you know?
 * Examples: 
 * Kata.numberToString(123); // returns "123";
 * Kata.numberToString(999); // returns "999";
 */

public class Kata {
	public static String numberToString(int num) {

		String str = String.valueOf(num);
		return str;

	}
}
