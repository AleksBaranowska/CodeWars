package com.ola;

/**
 * Given an array of integers.
 * Return an array, where the first element is the count of positives numbers
 * and the second element is sum of negative numbers.
 * If the input array is empty or null, return an empty array.
 * Example 
 * For input [1, 2, 3, 4, 5, 6, 7, 8, 9, 10, -11, -12, -13, -14, -15],
 * you should return [10, -65].
 */

public class Kata {
	
	public static int[] countPositivesSumNegatives(int[] input) {
		int[] somearray = new int[0];
		if (input == null || input.length == 0)
			input = somearray;
		else {
			int[] result = new int[2];
			int counter = 0;
			for (int i = 0; i < input.length; i++) {
				if (input[i] > 0)
					result[0] = ++counter;
				else
					result[1] += input[i];
			}
			input = result;
		}
		return input;
	}
}
