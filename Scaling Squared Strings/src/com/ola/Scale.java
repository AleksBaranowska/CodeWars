package com.ola;

/**
 * You are given a string of n lines, each substring being n characters long.
 * For example:
 * s = "abcd\nefgh\nijkl\nmnop"
 * We will study the "horizontal" and the "vertical" scaling of this square of
 * strings.
 * A k-horizontal scaling of a string consists of replicating k times each
 * character of the string (except '\n').
 * Example: 2-horizontal scaling of s: => "aabbccdd\neeffgghh\niijjkkll\nmmnnoopp" 
 * A v-vertical scaling of a string
 * consists of replicating v times each part of the squared string.
 * Example: 2-vertical scaling of s: =>
 * "abcd\nabcd\nefgh\nefgh\nijkl\nijkl\nmnop\nmnop" 
 * Function scale(strng, k, v)
 * will perform a k-horizontal scaling and a v-vertical scaling.
 * Example: a = "abcd\nefgh\nijkl\nmnop" scale(a, 2, 3) -->
 * "aabbccdd\naabbccdd\naabbccdd\neeffgghh\neeffgghh\neeffgghh\niijjkkll\niijjkkll\niijjkkll\nmmnnoopp\nmmnnoopp\nmmnnoopp"
 * Printed:
 * abcd -----> aabbccdd 
 * efgh        aabbccdd 
 * ijkl        aabbccdd 
 * mnop        eeffgghh 
 *             eeffgghh
 *             eeffgghh 
 *             iijjkkll 
 *             iijjkkll 
 *             iijjkkll 
 *             mmnnoopp 
 *             mmnnoopp 
 *             mmnnoopp 
 * Task:
 * Write function scale(strng, k, v) k and v will be positive integers. If strng
 * == "" return "".
 */

public class Scale {
	
	public static String scale(String strng, int k, int n) {
		String[] strArray = strng.split("\n");
		String str = "";
		int length = strArray[0].length();
		for (int i = 0; i < length; i++) {
			for (int nTimes = 0; nTimes < n; nTimes++) {
				for (int charAt = 0; charAt < length; charAt++) {
					for (int charTimes = 0; charTimes < k; charTimes++) {
						str += strArray[i].charAt(charAt);
					}
				}
				if (!(i == length - 1 && nTimes == n - 1))
					str += "\n";
			}
		}
		// System.out.println(str);
		return str;
	}
}
