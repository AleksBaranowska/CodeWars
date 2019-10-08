package com.ola;

/**
 * Your task is, Easy kata!!
 * You must develop a method which returns a decimal decomposition given a
 * number. public static String decimalDecomposition(int number){...}
 * Some examples:
 * number = 126, method returns "100+20+6" 
 * number = 712654, method returns "700000+10000+2000+600+50+4"
 * NOTE: 0 < number
 */

public class DecimalDecomposition {

	public static String decimalDecomposition(int number) {
		String result = "";
		int integer = number;
		if (0 < number) {
			for (int i = 0, dec = 1; i < String.valueOf(number).length(); i++) {
				if (i == String.valueOf(number).length() - 1) {
					result = String.valueOf((integer % 10) * dec) + result;
				} else if (integer % 10 == 0) {
					integer /= 10;
					dec *= 10;
				} else {
					result = "+" + String.valueOf((integer % 10) * dec) + result;
					integer /= 10;
					dec *= 10;
				}
			}
		}

		// System.out.println(result);
		return result;
	}

}
