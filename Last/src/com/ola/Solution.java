package com.ola;
import java.util.List;

/**
 * Find the last element of the given argument(s).
 * 
 * Examples 
 * last(Arrays.asList(1, 2, 3, 4)); // => 4 
 * last("xyz"); // => "z"
 * last(1, 2, 3, 4); // => 4 l
 * ast(new int[]{1, 2, 3, 4}); // => 4
 * In javascript and CoffeeScript a list will be an array, a string or 
 * the list of arguments.
 */

public class Solution {

	public static <T> T last(final List<T> list) {
		return list.get(list.size() - 1);
	}

	public static char last(final String string) {
		char[] arrString = string.toCharArray();

		return arrString[arrString.length - 1];
	}

	public static <T> T last(final T... list) {
		return list[list.length - 1];
	}

}
