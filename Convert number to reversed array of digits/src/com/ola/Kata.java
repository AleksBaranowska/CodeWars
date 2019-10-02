package com.ola;
import java.util.ArrayList;

/**
 * Convert number to reversed array of digits Given a random number:
 * C#: long; C++: unsigned long; You have to return the digits of this number
 * within an array in reverse order.
 * Example: 348597 => [7,9,5,8,4,3]
 */
public class Kata {
	public static int[] digitize(long n) {

		ArrayList<Long> arrayLong = new ArrayList<Long>();
		do {
			// ads elements to array list in reverse order
			arrayLong.add(n % 10);
			n /= 10;
		} while (n > 0);
		int[] returnedArray = new int[arrayLong.size()];
		for (int i = 0; i < arrayLong.size(); i++) {
			if (arrayLong.get(i) != null) {
				long arraymember = arrayLong.get(i);
				int a = (int) arraymember;
				returnedArray[i] = a;
			}
		}
		return returnedArray;
	}
}
