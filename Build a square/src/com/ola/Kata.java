package com.ola;

/**
 * I will give you an integer. Give me back a shape that is as long and wide as
 * the integer. The integer will be a whole number between 0 and 50.
 * Example n = 3, so I expect a 3x3 square back just like below as a string:
 * +++ 
 * +++ 
 * +++
 */

public class Kata {

	public static final String generateShape(int n) {
		String str = "";
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < n; j++) {
				str += "+";
			}
			if (n < n - 1)
				str += "\n";
		}
		return str;
	}

	public static void main(String[] args) {
		System.out.println(generateShape(3));
	}
}

//public static final String generateShape(int n) {
//	return ("+".repeat(n) + "\n").repeat(n).trim();
//}
