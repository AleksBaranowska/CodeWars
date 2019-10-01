package com.ola;

/**
 * Task You are given a string representing a number in binary. Your task is to
 * delete all the unset bits in this string and return the corresponding number
 * (after keeping only the '1's).
 * In practice, you should implement this function:
 * public long eliminateUnsetBits(String number); 
 * Examples
 * eliminateUnsetBits("11010101010101") -> 255 (= 11111111)
 * eliminateUnsetBits("111") -> 7 
 * eliminateUnsetBits("1000000") -> 1
 * eliminateUnsetBits("000") -> 0
 */

public class SetBits {
	public long eliminateUnsetBits(String number) {
		long result = 0;
		long num = 1;
		for (int i = 0; i < number.length(); i++) {
			if (number.charAt(i) == '1') {
				result += num;
				num *= 2;
			}
		}
		return result;
	}
}
