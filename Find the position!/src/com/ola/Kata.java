package com.ola;

/**
 * When provided with a letter, return its position in the alphabet.
 * Input :: "a"
 * Ouput :: "Position of alphabet: 1"
 */

public class Kata {

	public static String position(char alphabet) {
		char[] alphabetArray = { 'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j', 'k', 'l', 'm', 'n', 'o', 'p', 'q',
				'r', 's', 't', 'u', 'v', 'w', 'x', 'y', 'z' };
		int position = 1;
		for (int i = 0; i < alphabetArray.length; i++) {
			if (alphabetArray[i] == alphabet) {
				position = ++i;
				break;
			}
		}
		return "Position of alphabet: " + position;
	}
}
