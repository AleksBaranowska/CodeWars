package com.ola;

import java.util.Arrays;
import java.util.Comparator;


/**
 * Given an array of numbers, return the difference between the largest and
 * smallest values.
 * For example:
 * [23, 3, 19, 21, 16] should return 20 (i.e., 23 - 3).
 * [1, 434, 555, 34, 112] should return 554 (i.e., 555 - 1).
 * The array will contain a minimun of two elements. Input data range guarantees
 * that max-min will cause no integer overflow.
 */

public class Kata {
	public static int betweenExtremes(int[] numbers) {
		Integer[] ints = Arrays.stream(numbers).boxed().toArray(Integer[]::new);
		Integer max = Arrays.stream(ints).max(Comparator.comparing(Integer::valueOf)).get();
		Integer min = Arrays.stream(ints).min(Comparator.comparing(Integer::valueOf)).get();
		return max - min;
	}
}

//  public static int betweenExtremes(int[] numbers){
//    Arrays.sort(numbers);
//    return numbers[numbers.length-1]-numbers[0];
//  }
