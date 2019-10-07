package com.ola;

/**
 * Sum all the numbers of the array (in F# and Haskell you get a list) except
 * the highest and the lowest element (the value, not the index!). (The
 * highest/lowest element is respectively only one element at each edge, even if
 * there are more than one with the same value!)
 * Example:
 * { 6, 2, 1, 8, 10 } => 16 
 * { 1, 1, 11, 2, 3 } => 6
 * If array is empty, null or None, or if only 1 Element exists, return 0.
 * Note:In C++ instead null an empty vector is used. In C there is no null. ;-)
 * -- There's no null in Haskell, therefore Maybe [Int] is used. Nothing
 * represents null. 
 */

public class Kata {

	public static int sum(int[] numbers) {
		int sum = 0;
		int maxDigit = 0;
		int minDigit = 0;
		if (numbers == null || numbers.length == 0 || numbers.length == 1)
			return sum = 0;
		else
			for (int i = 0, minValue = numbers[i], maxValue = numbers[i]; i < numbers.length; i++) {
				sum += numbers[i];
				maxDigit = maxValue;
				minDigit = minValue;
				if (maxValue < numbers[i]) {
					maxValue = numbers[i];
					maxDigit = maxValue;
				}
				if (minValue > numbers[i]) {
					minValue = numbers[i];
					minDigit = minValue;
				}
			}
		sum = sum - (maxDigit + minDigit);
		return sum;
	}
}
