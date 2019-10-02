package com.ola;

/**
 * Task Write a method, that replaces every nth char oldValue with char
 * newValue.
 * Method:
 * replaceNth(String text, int n, char oldValue, char newValue) 
 * Example: 
 * n: 2
 * oldValue: 'a' 
 * newValue: 'o' 
 * "Vader said: No, I am your father!" -> "Vader soid: No, I am your fother!" 
 * 1 2 3 4 -> 2nd and 4th occurence are replaced
 * Your method has to be case sensitive!
 * As you can see in the example: The first changed is the 2nd 'a'. So the start
 * is always at the nth suitable char and not at the first!
 * If n is 0 or negative or if it is larger than the count of the oldValue,
 * return the original text without a change.
 * The text and the chars will never be null.
 */

public class Kata {
	
	public static String replaceNth(String text, int n, char oldValue, char newValue) {
		String newStr = "";
		char[] strArray = text.toCharArray();
		char[] newArray = new char[text.toCharArray().length];
		int count = 1;
		if (n <= 0)
			return text;
		else {
			for (int i = 0, nth = n; i < strArray.length; i++) {
				if (strArray[i] == oldValue) {
					if (count == nth) {
						newArray[i] = newValue;
						nth += n;
					} else
						newArray[i] = strArray[i];
					count++;
				}
				else
					newArray[i] = strArray[i];
			}
			newStr = String.copyValueOf(newArray);
		}
		return newStr;
	}
}
