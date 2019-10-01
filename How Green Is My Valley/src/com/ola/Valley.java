package com.ola;
import java.util.Arrays;

/**
 * Input : an array of integers.
 * Output : this array, but sorted in such a way that there are two wings:
 * the left wing with numbers decreasing,
 * the right wing with numbers increasing.
 * the two wings have the same length. If the length of the array is odd the
 * wings are around the bottom, if the length is even the bottom is considered
 * to be part of the right wing.
 * each integer l of the left wing must be greater or equal to its counterpart r
 * in the right wing, the difference l - r being as small as possible. In other
 * words the right wing must be nearly as steeply as the left wing.
 * The function is make_valley or makeValley or make-valley.
 * a = [79, 35, 54, 19, 35, 25] make_valley(a) --> [79, 35, 25, *19*, 35, 54]
 * The bottom is 19, left wing is [79, 35, 25], right wing is [*19*, 35, 54].
 * 79..................54 
 *    35..........35 
 *        25. 
 *          ..19
 * 
 * a = [67, 93, 100, -16, 65, 97, 92] make_valley(a) --> [100, 93, 67, *-16*,
 * 65, 92, 97] 
 * The bottom is -16, left wing [100, 93, 67] and right wing [65, 92, 97] 
 * have same length. 
 * 100.........................97
 *   93...................92 
 *      67...... 
 *             .....65 
 *         -16
 * 
 * a = [66, 55, 100, 68, 46, -82, 12, 72, 12, 38] 
 * make_valley(a) --> [100, 68, 55, 38, 12, *-82*, 12, 46, 66, 72] 
 * The bottom is -82, left wing is [100, 68, 55, 38, 12]], 
 * right wing is [*-82*, 12, 46, 66, 72].
 * a = [14,14,14,14,7,14] make_valley(a) => [14, 14, 14, *7*, 14, 14]
 * 
 * a = [14,14,14,14,14] 
 * make_valley(a) => [14, 14, *14*, 14, 14] 
 * A counter-example: 
 * a = [17, 17, 15, 14, 8, 7, 7, 5, 4, 4, 1] 
 * A solution could be [17, 17, 15, 14, 8, 1, 4, 4, 5, 7, 7] 
 * but the right wing [4, 4, 5, 7, 7]
 * is much flatter than the left one [17, 17, 15, 14, 8].
 * Summing the differences between left and right wing:
 * (17-7)+(17-7)+(15-5)+(14-4)+(8-4) = 44
 * Consider the following solution: 
 * [17, 15, 8, 7, 4, 1, 4, 5, 7, 14, 17]
 * Summing the differences between left and right wing:
 * (17-17)+(15-14)+(8-7)+(7-5)+(4-4) = 4 
 * The right wing is nearly as steeply than the right one.
 */

public class Valley {
	public static int[] makeValley(int[] arr) {
		if (arr.length != 0) {
			int[] array = new int[arr.length];
			int decr, inc;
			Arrays.sort(arr);
			if (arr.length == 3) {
				array[0] = arr[2];
				array[1] = arr[0];
				array[2] = arr[1];
			} else if (arr.length % 2 == 0) {
				decr = arr.length - 1;
				inc = 0;
				for (int i = 0; i < arr.length; i++) {
					if (i < arr.length / 2) {
						array[i] = arr[decr];
						decr -= 2;
					} else {
						array[i] = arr[inc];
						inc += 2;
					}
				}
			} else {
				decr = arr.length - 1;
				inc = 1;
				for (int i = 0; i < arr.length; i++) {
					if (i <= arr.length / 2) {
						array[i] = arr[decr];
						decr -= 2;
					} else {
						array[i] = arr[inc];
						inc += 2;
					}
				}
			}
			return array;
		} else
			return arr;
	}
}
