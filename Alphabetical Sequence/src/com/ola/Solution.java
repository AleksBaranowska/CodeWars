package com.ola;


import java.util.Arrays;

/**
 * In this kata you will be given a random string of letters and tasked with
 * returning them as a string of comma-separated sequences sorted alphabetcally,
 * with each sequence starting with an uppercase character followed by n-1
 * lowercase characters, where n is the letter's alphabet position 1-26.
 * Example 
 * alphaSeq("ZpglnRxqenU") ->
 * "Eeeee,Ggggggg,Llllllllllll,Nnnnnnnnnnnnnn,Nnnnnnnnnnnnnn,Pppppppppppppppp,Qqqqqqqqqqqqqqqqq,Rrrrrrrrrrrrrrrrrr,Uuuuuuuuuuuuuuuuuuuuu,Xxxxxxxxxxxxxxxxxxxxxxxx,Zzzzzzzzzzzzzzzzzzzzzzzzzz"
 * Technical Details 
 * The string will include only letters. 
 * The first letter of each sequence is uppercase followed by n-1 lowercase. 
 * Each sequence is seperated with a comma. 
 * Return value needs to be a string.
 */

public class Solution {

	public static String alphaSeq(String s) {
		s = s.toLowerCase();
		char[] alphabet = { 'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j', 'k', 'l', 'm', 'n', 'o', 'p', 'q', 'r',
				's', 't', 'u', 'v', 'w', 'x', 'y', 'z' };
		String solution = "";
		char[] array = s.toCharArray();
		Arrays.sort(array);
		System.out.println(Arrays.toString(array));
		for (int i = 0; i < array.length; i++) {
			for (int j = 0; j < alphabet.length; j++) {
				int k = 0;
				if (Character.toLowerCase(array[i]) == alphabet[j]) {
					char init = Character.toUpperCase(alphabet[j]);
					solution += init;
					while (k < j) {
						solution += alphabet[j];
						k++;
					}
					if (i < array.length - 1) {
						solution += " , ";
					}
				}
			}
		}
		return solution;
	}

	public static void main(String[] args) {
		String str = "ZpglnRxqenU";
		Solution.alphaSeq(str);
	}
}

//import static java.util.stream.Collectors.joining;
//
//public class Solution {
//  public static String alphaSeq(String s) {
//      return s.chars()
//              .mapToObj(letter -> String.valueOf((char)letter))
//              .map(String::toLowerCase)
//              .sorted()
//              .map(letter -> letter.toUpperCase() + letter.repeat(letter.charAt(0) - 'a'))
//              .collect(joining(","));
//  }
//}
