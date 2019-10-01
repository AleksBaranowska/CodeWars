package com.ola;

/**
 * Write a function partlist that gives all the ways to divide a list (an array)
 * of at least two elements into two non-empty parts.
 * Each two non empty parts will be in a pair (or an array for languages without
 * tuples or a structin C - C: see Examples test Cases - ) 
 * Each part will be in a string 
 * Elements of a pair must be in the same order as in the original array. 
 * Examples of returns in different languages: 
 * a = ["az", "toto", "picaro", "zone", "kiwi"] --> 
 * [["az", "toto picaro zone kiwi"], ["az toto", "picaro zone kiwi"], ["az toto
 * picaro", "zone kiwi"], ["az toto picaro zone", "kiwi"]]
 * or
 * a = {"az", "toto", "picaro", "zone", "kiwi"} -->
 * {{"az", "toto picaro zone kiwi"}, {"az toto", "picaro zone kiwi"}, {"az toto
 * picaro", "zone kiwi"}, {"az toto picaro zone", "kiwi"}}
 * or
 * a = ["az", "toto", "picaro", "zone", "kiwi"] -->
 * [("az", "toto picaro zone kiwi"), ("az toto", "picaro zone kiwi"), ("az toto
 * picaro", "zone kiwi"), ("az toto picaro zone", "kiwi")]
 * or
 * a = [|"az", "toto", "picaro", "zone", "kiwi"|] -->
 * [("az", "toto picaro zone kiwi"), ("az toto", "picaro zone kiwi"), ("az toto
 * picaro", "zone kiwi"), ("az toto picaro zone", "kiwi")]
 * or
 * a = ["az", "toto", "picaro", "zone", "kiwi"] -->
 * "(az, toto picaro zone kiwi)(az toto, picaro zone kiwi)(az toto picaro, zone
 * kiwi)(az toto picaro zone, kiwi)"
 * You can see other examples for each language in "Your test cases"
 */

public class Partlist {
	public static String[][] partlist(String[] arr) {
		String[][] array = new String[arr.length - 1][2];
		String str = "";
		String str2 = "";

		for (int i = 0; i < arr.length - 1; i++) {
			str += " " + arr[i];
			str2 = "";
			for (int j = i + 1; j < arr.length; j++) {
				// System.out.println(i);
				// System.out.println(j);
				str2 += arr[j] + " ";
				// System.out.println(str2);
			}
			
			array[i][0] = str.trim();
			array[i][1] = str2.trim();
		}

		return array;
	}

}
