package com.ola;

import java.util.ArrayList;

/**
 * Complete the function which takes two arguments and returns all numbers which
 * are divisible by the given divisor. First argument is an array of numbers and
 * the second is the divisor.
 * Example 
 * divisibleBy([1, 2, 3, 4, 5, 6], 2) == [2, 4, 6]
 */
public class EvenNumbers {
	
	public static int[] divisibleBy(int[] numbers, long divider) {

		ArrayList<Integer> values = new ArrayList<>();
		for (int i = 0; i < numbers.length; i++) {
			if (numbers[i] % divider == 0)
				values.add(numbers[i]);
		}
		int[] result = new int[values.size()];
		for (int i = 0; i < result.length; i++) {
			result[i] = values.get(i).intValue();
		}
		return result;
	}

}
