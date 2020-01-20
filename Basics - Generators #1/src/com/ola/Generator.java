package com.ola;

/**
 * Basics - Generators #1 Generators are very useful things in programming, in
 * this series we will learn how to use generators and see how we can apply
 * generators to common programming challenges. Task You must complete the
 * generator function that must increment a counter by 1 each time also if a
 * argument is supplied (will always be a number) you must then change the
 * counter to that number. Important The counter must start at 1 when the
 * generator is initalized 
 */

public class Generator {

	private int counter = 1;

	public int next() {
		return counter++;
	}

	public int next(int n) {
		counter = n;
		return counter;
	}

	public static void main(String[] args) {

	}

}
