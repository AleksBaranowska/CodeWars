package com.ola;

/**
 * Write a program that finds the summation of every number from 1 to num. The
 * number will always be a positive integer greater than 0. * 
 * For example:
 * summation(2) -> 3
 * 1 + 2
 * summation(8) -> 36 
 * 1 + 2 + 3 + 4 + 5 + 6 + 7 + 8
 */

public class GrassHopper {

	public static int summation(int n) {
		int[] arr = new int[n];
		int sum = 0;
		for (int i = 0, j = 1; i < arr.length; i++, j++) {
			sum += j;
		}
		return sum;
	}

	public static void main(String[] args) {

	}

}
