package com.ola;

/**
 * You've just moved into a perfectly straight street with exactly n identical
 * houses on either side of the road. Naturally, you would like to find out the
 * house number of the people on the other side of the street. The street looks
 * something like this:
 * Street 
 * 1| |6 
 * 3| |4 
 * 5| |2 
 * Evens increase on the right; odds decrease on the left.
 * House numbers start at 1 and increase without gaps. When n = 3, 1 is opposite 6, 3 opposite 4, and 5 opposite 2. 
 * Example
 * Given your house number address and length of street n, give the house number
 * on the opposite side of the street. 
 * CodeWars.overTheRoad(long address, long n) 
 * CodeWars.overTheRoad(1, 3) = 6 
 * CodeWars.overTheRoad(3, 3) = 4
 * CodeWars.overTheRoad(2, 3) = 5 
 * CodeWars.overTheRoad(3, 5) = 8
 */

public class CodeWars {
	
	public static long overTheRoad(long address, long n) {
		long maxEven = n * 2;
		return (maxEven - address) + 1;

	}
	
	/**
	 * public static long overTheRoad(long a, long n) { return (n<<1) - --a; }
	 */

	public static void main(String[] args) {

		
		System.out.println(CodeWars.overTheRoad(23633656673L, 310027696726L));//596421736780L
		System.out.println(CodeWars.overTheRoad(1, 3));//6
		System.out.println(CodeWars.overTheRoad(3, 3));//4
		System.out.println(CodeWars.overTheRoad(2, 3));//5
		System.out.println(CodeWars.overTheRoad(3, 5));//8
		System.out.println(CodeWars.overTheRoad(7, 11));//16
		System.out.println(CodeWars.overTheRoad(20, 1000000));//1999981L


	}

}
