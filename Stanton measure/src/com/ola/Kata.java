package com.ola;
import java.util.Arrays;


/**
 * The Stanton measure of an array is computed as follows: count the number of
 * 1s in the array. Let this count be n. The Stanton measure is the number of
 * times that n appears in the array. * 
 * Write a function which takes an integer array and returns its Stanton
 * measure. * 
 * Example The Stanton measure of [1, 4, 3, 2, 1, 2, 3, 2] is 3, because 1
 * occurs 2 times in the array and 2 occurs 3 times.
 */

public class Kata {

	public static int stantonMeasure(int[] arr) {
		long count = Arrays.stream(arr).filter(a -> a == 1).count();
		return (int) Arrays.stream(arr).filter(a -> a == count).count();
	}
	
	/**
	 * public static int stantonMeasure(int[] arr) { 
	 * int count = 0;
	 * int count1 = 0;
	 * for (int s : arr) { if(s==1) count++; }	 * 
	 * for (int s : arr) { if(s==count) count1++; }	 * 
	 * return count1; }
	 * 
	 */

}
