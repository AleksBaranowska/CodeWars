package com.ola;

import java.math.BigInteger;
import java.math.BigInteger;

/**
 * ##Objective
 * 
 * Given a number n we will define it's sXORe to be 0 XOR 1 XOR 2 ... XOR n
 * where XOR is the bitwise XOR operator.
 * Write a function that takes n and returns it's sXORe.
 * ####Examples | n | sXORe n |---------|-------- | 0 | 0 | 1 | 1 | 50 | 51
 * | 1000000 | 1000000 Any feedback would be much appreciated
 */

public class BinarySxore {
	public static BigInteger sxore(BigInteger n) {
		switch (n.mod(BigInteger.valueOf(4)).intValue()) {
		case 0:
			return n;
		case 1:
			return BigInteger.ONE;
		case 2:
			return n.add(BigInteger.ONE);
		default:
			return BigInteger.ZERO;
		}

	}

	public static void main(String[] args) {
		
		System.out.println(sxore(new BigInteger("0")));
		System.out.println(sxore(new BigInteger("1")));
		System.out.println(sxore(new BigInteger("50")));
		System.out.println(sxore(new BigInteger("51")));
	}
}
