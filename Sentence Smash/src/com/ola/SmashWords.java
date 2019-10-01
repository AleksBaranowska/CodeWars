package com.ola;

/**
 * Write a method smash that takes an array of words and smashes them together
 * into a sentence and returns the sentence. You can ignore any need to sanitize
 * words or add punctuation, but you should add spaces between each word. Be
 * careful, there shouldn't be a space at the beginning or the end of the
 * sentence!
 * Example 
 * var words = ['hello', 'world', 'this', 'is', 'great']; 
 * smash(words); // returns "hello world this is great" 
 * Assumptions 
 * You can assume that you are only given words. 
 * You cannot assume the size of the array. 
 * You can assume that you will always get an array. 
 * What We're Testing
 * We're testing basic loops and string manipulation.
 * This is for beginners who are just learning loops and string manipulation.
 */

public class SmashWords {
	public static String smash(String... words) {
		StringBuilder builder = new StringBuilder();
		String newString = "";
		if (words == null)
			newString = null;
		else {
			for (String string : words) {
				if (builder.length() > 0) {
					builder.append(" ");
				}
				builder.append(string);
			}

			String string = builder.toString();
			newString = string.trim();
		}
		return newString;
	}

}
