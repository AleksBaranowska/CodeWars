package com.ola;

import java.util.Arrays;

/**
 * An anagram is the result of rearranging the letters of a word to produce a
 * new word (see wikipedia).
 * Note: anagrams are case insensitive
 * Complete the function to return true if the two arguments given are anagrams
 * of each other; return false otherwise.
 * Examples 
 * "foefet" is an anagram of "toffee"
 * "Buckethead" is an anagram of "DeathCubeK"
 */

public class Kata {

	public static boolean isAnagram(String test, String original) {
		
		if (test.length() != original.length())
			return false;
		char[] testArr = test.toLowerCase().toCharArray();
		Arrays.sort(testArr);
		char[] originAarr = original.toLowerCase().toCharArray();
		Arrays.sort(originAarr);

		for (int i = 0; i < testArr.length; i++) {
			if (testArr[i] != originAarr[i])
				return false;
		}

		return true;
	}
	
//public static boolean isAnagram(String test, String original) {
//		
//		if (test.length() != original.length())
//			return false;
//		char[] testArr = test.toLowerCase().toCharArray();
//		Arrays.sort(testArr);
//		char[] originAarr = original.toLowerCase().toCharArray();
//		Arrays.sort(originAarr);
//
//		return Arrays.equals(testArr, originAarr);
//	}

	
//	public static boolean isAnagram(String test, String original) {
//        return Stream.of(test.toLowerCase().split(""))
//                .sorted()
//                .collect(Collectors.joining())
//                .equals(
//                        Stream.of(original.toLowerCase()
//                                .split(""))
//                                .sorted()
//                                .collect(Collectors.joining()));
//    
//    }
}
