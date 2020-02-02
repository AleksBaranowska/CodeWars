package com.ola;

/**
 * Complete the function caffeineBuzz, which takes a non-zero integer as it's
 * one argument.
 * If the integer is divisible by 3, return the string "Java".
 * If the integer is divisible by 3 and divisible by 4, return the string
 * "Coffee"
 * If the integer is one of the above and is even, add "Script" to the end of
 * the string.
 * Otherwise, return the string "mocha_missing!"
 * caffeineBuzz(1) => "mocha_missing!" caffeineBuzz(3) => "Java" caffeineBuzz(6)
 * => "JavaScript" caffeineBuzz(12) => "CoffeeScript"
 */

public class CaffeineBuzz {

	public static String caffeineBuzz(int n) {

		if (n % 3 == 0)
			if (n % 4 == 0)
				if (n % 2 == 1)
					return "Script";
				else
					return "CoffeeScript";
			else if (n % 2 == 1)
				return "Java";
			else
				return "JavaScript";
		else
			return "mocha_missing!";

	}

	public static void main(String[] args) {
		System.out.println(caffeineBuzz(1));
		System.out.println(caffeineBuzz(3));
		System.out.println(caffeineBuzz(6));
		System.out.println(caffeineBuzz(12));
//		System.out.println(caffeineBuzz());
//		System.out.println(caffeineBuzz());

	}

}
