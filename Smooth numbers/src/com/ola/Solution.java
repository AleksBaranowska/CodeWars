package com.ola;

/**
 * The concept of "smooth number" is applied to all those numbers whose prime
 * factors are lesser than or equal to 7: 60 is a smooth number (2 * 2 * 3 * 5),
 * 111 is not (3 * 37).
 * More specifically, smooth numbers are classified by their highest prime
 * factor and your are tasked with writing a isSmooth/is_smooth function that
 * returns a string with this classification as it follows:
 * 2-smooth numbers should be all defined as a "power of 2", as they are merely
 * that; 
 * 3-smooth numbers are to return a result of "3-smooth"; 
 * 5-smooth numbers will be labelled as "Hamming number"s (incidentally, 
 * you might appreciate this nice kata on them); 
 * 7-smooth numbers are classified as "humble
 * numbers"s; for all the other numbers, just return non-smooth. 
 * Examples:
 * isSmooth(16) == "power of 2" 
 * isSmooth(36) == "3-smooth" 
 * isSmooth(60) == "Hamming number" 
 * isSmooth(98) == "humble number" 
 * isSmooth(111) == "non-smooth" 
 * The provided input n is always going to be a positive number > 1.
 */

public class Solution {

	public static String isSmooth(long n) {
		
		String result = "";
		long copy = n;
		int[] arr = { 7, 5, 3, 2 };
		int i = 0;
		int factor = 0;
		while (i < arr.length) {
			while (copy % arr[i] == 0) {
				copy /= arr[i];
				if (factor < arr[i])
					factor = arr[i];
			}
			i++;
		}

		if (copy != 1)
			result = "non-smooth";
		else if (factor == 2)
			result = "power of 2";
		else if (factor == 3)
			result = "3-smooth";
		else if (factor == 5)
			result = "Hamming number";
		else
			result = "humble number";

		return result;

	}

}
