package com.ola;
import java.util.Arrays;

/**
 * Sort an array by value and index Your task is to sort an array of integer
 * numbers by the product of the value and the index of the positions.
 * For sorting the index starts at 1, NOT at 0! The sorting has to be ascending.
 * The array will never be null and will always contain numbers.
 * Example:
 * Input: 23, 2, 3, 4, 5 
 * Product of value and index: 
 * 23 => 23 * 1 = 23 -> Output-Pos 4 
 * 2 => 2 * 2 = 4 -> Output-Pos 1 
 * 3 => 3 * 3 = 9 -> Output-Pos 2 
 * 4 => 4 * 4 = 16 -> Output-Pos 3 
 * 5 => 5 * 5 = 25 -> Output-Pos 5
 * Output: 2, 3, 4, 23, 5
 */

public class Kata {
	
	public static int[] sortByValueAndIndex(int[] array) {
		
		int[] resultArr = new int[array.length];
		for (int i = 0, j = 1; i < resultArr.length; i++, j++) {
			resultArr[i] = array[i] * j;
		}

		for (int i = 0; i < resultArr.length; i++)
			for (int j = i + 1; j < resultArr.length; j++) {
				int tmp = 0;
				if (resultArr[i] > resultArr[j]) {
					tmp = resultArr[i];
					resultArr[i] = resultArr[j];
					resultArr[j] = tmp;

					tmp = array[i];
					array[i] = array[j];
					array[j] = tmp;
				}
			}
		
		return array;
	}
}
