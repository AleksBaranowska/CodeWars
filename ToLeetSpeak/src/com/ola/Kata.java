package com.ola;

import java.util.Arrays;

/**
 * Your task is to write a function toLeetSpeak that converts a regular english
 * sentence to Leetspeak.
 * 
 * More about LeetSpeak You can read at wiki ->
 * https://en.wikipedia.org/wiki/Leet Consider only uppercase letters (no
 * lowercase letters, no numbers) and spaces. For example: toLeetSpeak("LEET")
 * returns "1337" In this kata we use a simple LeetSpeak dialect. Use this
 * alphabet: { A : '@', B : '8', C : '(', D : 'D', E : '3', F : 'F', G : '6', H
 * : '#', I : '!', J : 'J', K : 'K', L : '1', M : 'M', N : 'N', O : '0', P :
 * 'P', Q : 'Q', R : 'R', S : '$', T : '7', U : 'U', V : 'V', W : 'W', X : 'X',
 * Y : 'Y', Z : '2' }
 */

public class Kata {

	static String toLeetSpeak(final String speak) {
		char[] array = speak.toCharArray();
		for (int i = 0; i < array.length; i++) {
			switch (array[i]) {
			case 'A':
				array[i] = '@';
				break;
			case 'B':
				array[i] = '8';
				break;
			case 'C':
				array[i] = '(';
				break;
			case 'D':
				array[i] = 'D';
				break;
			case 'E':
				array[i] = '3';
				break;
			case 'F':
				array[i] = 'F';
				break;
			case 'G':
				array[i] = '6';
				break;
			case 'H':
				array[i] = '#';
				break;
			case 'I':
				array[i] = '!';
				break;
			case 'J':
				array[i] = 'J';
				break;
			case 'K':
				array[i] = 'K';
				break;
			case 'L':
				array[i] = '1';
				break;
			case 'M':
				array[i] = 'M';
				break;
			case 'N':
				array[i] = 'N';
				break;
			case 'O':
				array[i] = '0';
				break;
			case 'P':
				array[i] = 'P';
				break;
			case 'Q':
				array[i] = 'Q';
				break;
			case 'R':
				array[i] = 'R';
				break;
			case 'S':
				array[i] = '$';
				break;
			case 'T':
				array[i] = '7';
				break;
			case 'U':
				array[i] = 'U';
				break;
			case 'V':
				array[i] = 'V';
				break;
			case 'W':
				array[i] = 'W';
				break;
			case 'X':
				array[i] = 'X';
				break;
			case 'Y':
				array[i] = 'Y';
				break;
			case 'Z':
				array[i] = '2';
				break;
			default:
				array[i] = array[i];
				break;
			}
		}
		String str = new String(array);
		return str;
	}
	
	
}
