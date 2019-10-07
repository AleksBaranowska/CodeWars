package com.ola;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * Given an array of numbers, sort them in such a manner that all the odd
 * numbers in the array are sorted in ascending order and the even numbers are
 * sorted in descending order after the last odd number. For example
 * [1,2,3,4,5,6,7,8,9] produces the output [1,3,5,7,9,8,6,4,2]. If the array
 * contains decimals, round them down while checking for odd/even. The output
 * must have the original numbers!
 */

public class Kata {
	public static Double[] sortItOut(Double[] array) {

		List<Double> odd = new ArrayList<Double>();
		List<Double> even = new ArrayList<Double>();
		for (int i = 0; i < array.length; i++) {
			if (((int) array[i].doubleValue() & 1) == 1) {
				odd.add(array[i]);
			} else {
				even.add(array[i]);
			}
		}
		Collections.sort(odd);
		Collections.sort(even, Collections.reverseOrder());
		odd.addAll(even);

		Double[] d = new Double[odd.size()];
		odd.toArray(d);

		// for (Double e : d) {
			// System.out.println(e);
		// }
		return d;
	}

}
