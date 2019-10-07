package com.ola;

/**
 * You have to search all numbers from inclusive 1 to inclusive a given number
 * x, that have the given digit d in it. The value of d will always be 0 - 9.
 * The value of x will always be greater than 0.
 * You have to return as an array
 * the count of these numbers, their sum and their product.
 * For example: ``` x = 11 d = 1 -> Numbers: 1, 10, 11 Return: [3, 22, 110] ```
 * If there are no numbers, which include the digit, return [0,0,0].
 */

public class Kata {

	public static long[] NumbersWithDigitInside(long x, long d) {
		
		long count = 0;
		long sum = 0;
		long product = 1;
		if (d > x || x == 1 && d == 0) {
			count = 0;
			sum = 0;
			product = 0;
		} else
			for (long i = 1; i <= x; i++) {
				if (Long.toString(i).contains(Long.toString(d))) {
					count++;
					sum += i;
					product *= i;
				}
			}

		// System.out.println("end test" + " \n");
		// System.out.println(" ");
		long[] result = { count, sum, product };

		return result;
	}
}