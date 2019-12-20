package com.ola;

import java.util.HashMap;
import java.util.Map;

/**
 * Introduction There is a war and nobody knows - the alphabet war! There are
 * two groups of hostile letters. The tension between left side letters and
 * right side letters was too high and the war began.
 * Task Write a function that accepts fight string consists of only small
 * letters and return who wins the fight. When the left side wins return Left
 * side wins!, when the right side wins return Right side wins!, in other case
 * return Let's fight again!.
 * The left side letters and their power:
 * w - 4 
 * p - 3 
 * b - 2 
 * s - 1 
 * The right side letters and their power: * 
 * m - 4 
 * q - 3 
 * d - 2 
 * z - 1 
 * The other letters don't have power and are only victims.
 * Example
 * AlphabetWar("z"); //=> Right side wins! 
 * AlphabetWar("zdqmwpbs"); //=> Let's fight again! 
 * AlphabetWar("zzzzs"); //=> Right side wins!
 * AlphabetWar("wwwwwwz"); //=> Left side wins!
 */

public class Kata {

	public static String alphabetWar(String fight) {

		char[] left = { 's', 'b', 'p', 'w' };
		char[] right = { 'z', 'd', 'q', 'm' };
		char[] ch = fight.toCharArray();
		int rightValue = 0;
		int leftValue = 0;
		for (int i = 0; i < ch.length; i++) {
			for (int j = 0; j < 4; j++) {
				int r = j;
				if (right[j] == ch[i]) {
					rightValue += (r + 1);
				}
				if (left[j] == ch[i]) {
					leftValue += (r + 1);
				}
			}

		}
		if (leftValue > rightValue) {
			return "Left side wins!";
		} else if (leftValue < rightValue) {
			return "Right side wins!";
		}

		return "Let's fight again!";
	}
public static void main(String[] args) {
	System.out.println(Kata.alphabetWar("z"));//Right side wins!"
	System.out.println(Kata.alphabetWar("zdqmwpbs"));//Let's fight again!"
	System.out.println(Kata.alphabetWar("zzzzs"));//"Right side wins!"
	System.out.println(Kata.alphabetWar("wwwwwwz"));//"Left side wins!"
}
}
