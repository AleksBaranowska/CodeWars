package com.ola;

/**
 * Your task is very easy!!! The target is practising conversion "by hand" from
 * base 10 to 16.
 * Develop a method public String convertToHex(int number) which allows
 * converting number to Hexadecimal. Note that 0<number<=4294967295. The final
 * result must concat at the start 0x. Letters must be in upperCase since the
 * tests are expecting upperCases.
 * In this kata you have to programme "by hand" the conversion. What make sense
 * is making your own method!!
 * These solutions are not the target of this kata.
 * Integer.toString(a, 16) String.format("0x%X", a) ```Integer.toHexString(a)``
 * and same structures
 */

public class Hexadecimal {

	public static String convertToHex(int a) {
		String result = "";
		char hex[] = { '0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'A', 'B', 'C', 'D', 'E', 'F' };
		int intToHex = 0;
		while (a > 0) {
			intToHex = a % 16;
			result = hex[intToHex] + result;
			a = a / 16;
		}
		return "0x" + result;
	}
}
