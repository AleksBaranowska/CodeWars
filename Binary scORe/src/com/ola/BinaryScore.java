package com.ola;
import java.math.BigInteger;
/**
 * Objective Given a number n we will define its scORe to be 0 | 1 | 2 | 3 | ...
 * | n, where | is the bitwise OR operator.
 * Write a function that takes n and finds it's scORe.
 * n scORe n 
 * 0 -> 0
 * 1 -> 1 
 * 49 -> 63 
 * 1000000 -> 1048575 
 */
public class BinaryScore {

	public static BigInteger score(BigInteger n) {
		System.out.println(n.toString(2));
		return BigInteger.valueOf(2).pow(n.bitLength()).subtract(BigInteger.valueOf(1));
	}

}
