package com.ola;

/**
 * Each number should be formatted that it is rounded to two decimal places. You
 * don't need to check whether the input is a valid number because only valid
 * numbers are used in the tests.
 * Example: 5.5589 is rounded 5.56 
 * 3.3424 is rounded 3.34
 */

public class Numbers {

	public static double TwoDecimalPlaces(double number) {
		String result = String.format("%1$.2f", number);
		double a = Double.parseDouble(result);
		return a;
	}

}
