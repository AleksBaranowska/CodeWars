package com.ola;

/**
 * #Get the averages of these numbers
 * Write a method, that gets an array of integer-numbers and return an array of
 * the averages of each integer-number and his follower, if there is one.
 * Example:
 * Input: [ 1, 3, 5, 1, -10] 
 * Output: [ 2, 4, 3, -4.5] 
 * If the array has 0 or 1 values or is null or None, your 
 * method should return an empty array.
 */

public class Kata {
	public static double[] averages(int[] numbers) {

		if (numbers == null || numbers.length == 0)
			return new double[0];
		else {
			double[] array = new double[numbers.length - 1];
			for (int i = 0, j = 1; j < numbers.length; i++, j++) {
				double x = numbers[i];
				double y = numbers[j];
				array[i] = (x + y) / 2;
				}
			return array;
		}
	}
}
