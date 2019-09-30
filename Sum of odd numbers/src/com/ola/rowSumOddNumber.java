package com.ola;

/**Given the triangle of consecutive odd numbers:
 *            1
 *         3     5
 *      7     9    11
 *   13    15    17    19
 * 21    23    25    27    29
 * Calculate the row sums of this triangle from the row index (starting at index 1) 
 * e.g.:
 * rowSumOddNumbers(1); // 1
 * rowSumOddNumbers(2); // 3 + 5 = 8
 */

public class rowSumOddNumber {
	public static int rowSumOddNumbers(int n) {
		int result = 1;
		int sum = 1;
		int j = 1;
		int i = 1;
		for (i = 1; i <= n; i++)
			for (j = 1, result = 0; j <= i; j++, sum += 2) {
				result += sum;
				// System.out.println(result);
			}
		// System.out.println(result);
		return result;
	}

	public static void main(String[] args) {
		
	}
}
