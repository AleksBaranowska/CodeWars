package com.ola;

/**
 * Given a string, capitalize the letters that occupy even indexes and odd
 * indexes separately, and return as shown below. Index 0 will be considered
 * even.
 * For example, capitalize("abcdef") = ['AbCdEf', 'aBcDeF']. 
 * See test cases for more examples.
 * The input will be a lowercase string with no spaces.
 */

public class Solution {

	public static String[] capitalize(String s) {
		String[] result = new String[2];
		String str1 = "";
		String str2 = "";
		for (int i = 0; i < s.length(); i++) {
			if (i % 2 == 0) {
				str1 += s.toUpperCase().charAt(i);
				str2 += s.toLowerCase().charAt(i);
			}

			else {
				str1 += s.toLowerCase().charAt(i);
				str2 += s.toUpperCase().charAt(i);
			}

		}
		result[0] = str1;
		result[1] = str2;
		return result;
	}
}

//
//import java.util.stream.IntStream;
//
//class Solution{
//    public static String[] capitalize(String s){
//        StringBuilder sb1 = new StringBuilder(s),
//                      sb2 = new StringBuilder(s.toUpperCase());
//        IntStream.range(0, s.length())
//                 .filter(  i -> (i&1)==0 )
//                 .forEach( i -> { sb1.setCharAt(i, sb2.charAt(i));
//                                  sb2.setCharAt(i, s.charAt(i)); });
//        return new String[] {sb1.toString(), sb2.toString()};
//    }
//}