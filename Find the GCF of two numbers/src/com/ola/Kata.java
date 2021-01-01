package com.ola;


/**
 * Your task here is the find the GCF (Greatest Common Factor) of any two numbers passed into a method, which will return one integer answer as an output.
 * Examples:
 * findGCF(4, 6); // Should return 2
 * findGCF(93, 186); // Should return 93
 * findGCF(20, 5); // Should return 5
 * Here, inputs will always be natural numbers so there's no need to worry about negative values or zero.
 */

public class Kata {
	
	public static int findGCF(int num1, int num2) {
		if (num2 == 0) {
			return num1;
		}
		return findGCF(num2, num1 % num2);
	}

}
