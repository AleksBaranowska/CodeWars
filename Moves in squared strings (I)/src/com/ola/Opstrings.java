package com.ola;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.function.Function;

/**
 * This kata is the first of a sequence of four about "Squared Strings".
 * You are given a string of n lines, each substring being n characters long:
 * For example:
 * s = "abcd\nefgh\nijkl\nmnop"
 * We will study some transformations of this square of strings.
 * Vertical mirror: vert_mirror (or vertMirror or vert-mirror) 
 * vert_mirror(s) => "dcba\nhgfe\nlkji\nponm" 
 * Horizontal mirror: hor_mirror (or horMirror or hor-mirror) 
 * hor_mirror(s) => "mnop\nijkl\nefgh\nabcd" 
 * or printed:
 * vertical mirror |horizontal mirror 
 * abcd --> dcba |abcd --> mnop 
 * efgh hgfe |efgh ijkl 
 * ijkl lkji |ijkl efgh 
 * mnop ponm |mnop abcd 
 * Task:
 * Write these two functions 
 * and
 * high-order function oper(fct, s) where
 * fct is the function of one variable f to apply to the string s (fct will be
 * one of vertMirror, horMirror) 
 * Examples:
 * s = "abcd\nefgh\nijkl\nmnop" 
 * oper(vert_mirror, s) => "dcba\nhgfe\nlkji\nponm"
 * oper(hor_mirror, s) => "mnop\nijkl\nefgh\nabcd" 
 * Note: 
 * The form of the parameter fct in oper changes according to the language. 
 * You can see each form according to the language in "Sample Tests".
 * Bash Note: 
 * The input strings are separated by , instead of \n. The ouput
 * strings should be separated by \r instead of \n. See "Sample Tests".
 * Forthcoming katas will study other tranformations.
 */

public class Opstrings {

	public static String vertMirror(String strng) {
		String str = "";
		// split("\n") divides string into array of string where \n is a line separator
		String[] strArr = strng.split("\n");
		for (int i = 0; i < strArr.length; i++) {
			if (i == strArr.length - 1) {
				// this expression adds string based on string builder which calls a reverse
				// method
				// which changes an order of character within a string iterated over an array)
				str += new StringBuilder(strArr[i]).reverse().toString();
			} else
				str += new StringBuilder(strArr[i]).reverse().toString() + "\n";
		}
		// System.out.println("str = " + str);
		return str;
	}

	public static String horMirror(String strng) {
		String str = "";
		String[] strArr = strng.split("\n");
		List<String> list = Arrays.asList(strArr);
		Collections.reverse(list);

		for (int i = 0; i < list.size(); i++) {
			if (i == list.size() - 1) {
				str += new StringBuilder(list.get(i)).toString();
			} else
				str += new StringBuilder(list.get(i)).toString() + "\n";
		}
		return str;
	}

	public static String oper(Function<String, String> Opstrings, String s) {
		
		return Opstrings.apply(s);
	}

}
