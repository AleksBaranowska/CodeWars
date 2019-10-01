package com.ola;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

/**
 * Take 2 strings s1 and s2 including only letters from ato z. Return a new
 * sorted string, the longest possible, containing distinct letters,
 * each taken only once - coming from s1 or s2. 
 * Examples: 
 * a = "xyaabbbccccdefww"
 * b = "xxxxyyyyabklmopq" 
 * longest(a, b) -> "abcdefklmopqwxy"
 * a = "abcdefghijklmnopqrstuvwxyz" 
 * longest(a, a) -> "abcdefghijklmnopqrstuvwxyz"
 */
public class TwoToOne {
	public static String longest(String s1, String s2) {
		String str = s1 + s2;
		char[] chars = str.toCharArray();
		
		List<Character> list = new ArrayList<Character>();
		for (char c : chars) {
			list.add(c);
		}
		Set<Character> set = new HashSet<Character>();
		for (int i = 0; i < list.size(); i++) {
			set.add(list.get(i));
		}

		Character[] charObj = set.toArray(new Character[set.size()]);
		char[] charArray = new char[charObj.length];
		int i = 0;
		for (Character s : charObj) {
			charArray[i] = s.charValue();
			i++;
		}

		Arrays.sort(charArray);
		String str1 = new String(charArray);
		//System.out.println(str1);
		return str1;
	}
}
