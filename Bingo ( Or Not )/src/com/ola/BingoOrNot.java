package com.ola;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

/**
 * For this game of BINGO, you will receive a single array of 10 numbers from 1
 * to 26 as an input. Duplicate numbers within the array are possible.
 * Each number corresponds to their alphabetical order letter (e.g. 1 = A. 2 =
 * B, etc). Write a function where you will win the game if your numbers can
 * spell "BINGO". They do not need to be in the right order in the input array).
 * Otherwise you will lose. Your outputs should be "WIN" or "LOSE" respectively.
 */

public class BingoOrNot {

	public static String bingo(int[] numberArray) {

//		char[] arr = "BINGO".toCharArray();
//		Integer[] chars = new Integer[arr.length];
//		for (int i = 0; i < arr.length; i++) {
//			// assuming that letters are capital
//			chars[i] = (int) arr[i] - 64;
//		}
		
		Integer[] chars = {2, 9, 14, 7, 15};
		Set<Integer> str = new HashSet<>(Arrays.asList(chars));
		Integer[] ints = Arrays.stream(numberArray).boxed().toArray(Integer[]::new);
		Set<Integer> integers = new HashSet<>(Arrays.asList(ints));
		if (integers.containsAll(str))
			return "Win";
		else
			return "LOSE";
	}

	
public static void main(String[] args) {
	System.out.println((int)'B'-64);
	System.out.println((int)'I'-64);
	System.out.println((int)'N'-64);
	System.out.println((int)'G'-64);
	System.out.println((int)'O'-64);
	"BINGO".chars().boxed().mapToInt(c -> (int) c - 64).forEach(System.out::print);
	
	//Set<Integer> BINGO = "BINGO".chars().map( c -> c-64 ).boxed().collect(Collectors.toSet());
	//IntStream strToints = "BINGO".chars().boxed().mapToInt(c -> (int) c - 64);
			
	}
}

//import java.util.*;
//import java.util.stream.*;
//
//public class BingoOrNot {
//    
//    private static final Set<Integer> BINGO = "BINGO".chars().map( c -> c-64 ).boxed().collect(Collectors.toSet());
//    
//    public static String bingo(int[] arr){
//        return Arrays.stream(arr)
//                     .filter(BINGO::contains)
//                     .distinct()
//                     .count() == BINGO.size() ? "WIN" : "LOSE";
//    }
//}
//
//
//Java int is 32 bit.
//Conveniently the alphabet A-Z has only 26 letters.
//So each letter can be represented. 'B'=bit2, 'I'=bit9, 'N'=bit14, ...- result is magic number 49796.
//The loop just gathers them all up (in variable x) to check they are all set or not.
//public static String bingo(int[] n) {
//    int x = 0, m = 49796;
//    for (int a : n) if (((x |= 1<<a) & m) == m) return "WIN";
//    return "LOSE";
//  }
//
