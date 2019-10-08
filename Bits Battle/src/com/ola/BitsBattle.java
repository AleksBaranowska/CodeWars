package com.ola;

import java.util.Arrays;

/**
 * The odd and even numbers are fighting against each other! * You are given a list of positive integers. The odd numbers from the list will
 * fight using their 1 bits from their binary representation, while the even
 * numbers will fight using their 0 bits. If present in the list, number 0 will
 * be neutral, hence not fight for either side.
 * You should return:
 * odds win if number of 1s from odd numbers is larger than 0s from even numbers
 * evens win if number of 1s from odd numbers is smaller than 0s from even numbers
 * tie if equal, including if list is empty
 * Please note that any prefix
 * that might appear in the binary representation, e.g. 0b, should not be
 * counted towards the battle.
 * Example: For an input list of [5, 3, 14]:
 * odds: 5 and 3 => 101 and 11 => four 1s evens: 14 => 1110 => one 0 Result:
 * odds win the battle with 4-1
 */

public class BitsBattle {

	static String bitsBattle(int[] numbers) {
		System.out.println(Arrays.toString(numbers));
		String result = "";
		String odd = "";
		// checks which number is even/odd
		String even = "";
		int evenCounter = 0;
		int oddCounter = 0;
		if (numbers.length == 0)
			result = "tie";
		else if (numbers.length == 1 && numbers[0] == 0)
			result = "tie";
		else {
			for (int i = 0; i < numbers.length; i++) {
				if (numbers[i] % 2 == 0) {
					even = Integer.toString(numbers[i], 2);
					char[] evenArray = even.toCharArray();
					for (int j = 0; j < evenArray.length; j++) {
						if (evenArray[j] == '0') {
							evenCounter++;
						}
					}
				} else {
					odd = Integer.toString(numbers[i], 2);
					char[] oddArray = odd.toCharArray();
					for (int k = 0; k < oddArray.length; k++)
						if (oddArray[k] == '1') {
							oddCounter++;
						}
				}
			}
		}
		if (oddCounter > evenCounter)
			result = "odds win";
		else if (oddCounter < evenCounter)
			result = "evens win";
		else
			result = "tie";

		return result;
	}

}
