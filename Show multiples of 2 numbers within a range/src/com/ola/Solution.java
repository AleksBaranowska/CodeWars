package com.ola;

import java.util.*;

/**
 * Print all numbers up to 3rd parameter which are multiple of both 1st and 2nd
 * parameter.
 * Python, Javascript, Java versions: return results in a list/array
 * NOTICE:
 * Do NOT worry about checking zeros or negative values. To find out if 3rd
 * parameter (the upper limit) is inclusive or not, check the tests, it differs
 * in each translation
 */

public class Solution {
	public static List<Integer> findMultiples(int s1, int s2, int s3) {
		int a = s1, b = s2;
		List<Integer> arr = new ArrayList<Integer>();
		while (a != 0 && b != 0) {
			int c = b;
			b = a % b;
			a = c;
		}
		int value = a + b;
		for (int i = 1; (i * value * (s1 / value) * (s2 / value)) < s3; i++) {
			if ((i * value * (s1 / value) * (s2 / value)) < s3)
				arr.add(i * value * (s1 / value) * (s2 / value));
			System.out.println(i * value * (s1 / value) * (s2 / value));

		}
		return arr;
	}
}
