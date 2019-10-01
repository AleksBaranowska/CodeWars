package com.ola;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * Your task is to make a function that can take any non-negative integer as a
 * argument and return it with its digits in descending order. Essentially,
 * rearrange the digits to create the highest possible number.
 * Examples: 
 * Input: 21445 
 * Output: 54421 
 * Input: 145263 
 * Output: 654321 
 * Input: 1254859723 
 * Output: 9875543221
 */

public class DescendingOrder {
	public static int sortDesc(final int num) {
		String str = String.valueOf(num);
		int result = 0;
		List<Integer> ilist = new ArrayList<Integer>();
		for (int i = 0; i < str.length(); i++) {
			ilist.add(Integer.valueOf(str.charAt(i) - '0'));
		}
		Collections.sort(ilist, Collections.reverseOrder());
		for (Integer i : ilist) {
			result = 10 * result + i;
		}

		return result;
	}
}
