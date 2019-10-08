package com.ola;

/**
 * The goal of this kata is to write a function that takes two inputs: a string
 * and a character. The function will count the number of times that character
 * appears in the string. The count is case insensitive.
 * For example:
 * countChar("fizzbuzz","z") => 4 
 * countChar("Fancy fifth fly aloof","f") => 5
 * The character can be any alphanumeric character.
 */

public class CC {
	
	public static int charCount(String str, char c) {
		int count = 0;
		char[] array = str.toLowerCase().toCharArray();
		for (int i = 0; i < array.length; i++) {
			System.out.println(array[i]);
			if (array[i] == Character.toLowerCase(c))
				count++;
		}
		// System.out.println("count = " + count);
		return count;
	}
}
