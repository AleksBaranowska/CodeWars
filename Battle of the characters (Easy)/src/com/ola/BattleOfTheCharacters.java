package com.ola;

import java.util.Arrays;
import java.util.List;
import java.util.stream.IntStream;
import java.util.stream.Stream;

/**
 * Description: Groups of characters decided to make a battle. Help them to
 * figure out which group is more powerful. Create a function that will accept 2
 * variables and return the one who's stronger.
 * Rules: Each character have its own power: A = 1, B = 2, ... Y = 25, Z = 26
 * Only capital chatacters can and will participate a battle. Only two groups to
 * a fight. Group whose total power (A + B + C + ...) is bigger wins. If the
 * powers are equal, it's a tie. Examples:
 * battle("ONE", "TWO"); // => "TWO"`
 * battle("ONE", "NEO"); // => "Tie!"
 */

public class BattleOfTheCharacters {
	//practicing streams
	public static String battle(final String x, final String y) {

		int intX = x.chars().map(a -> (a + 1) - 'A').sum();
		int intY = y.chars().map(b -> (b + 1) - 'A').sum();
		if (intX > intY)
			return x;
		else if (intX < intY)
			return y;
		else
			return "Tie!";
	}
}
//public static String battle(final String x, final String y) {
//    int sumX=0;
//    int sumY=0;
//    for(char a : x.toCharArray())
//     sumX+=a-64;
//    for(char b : y.toCharArray())
//      sumY+=b-64;
//    if(sumX==sumY)
//      return "Tie!";
//    if(sumX>sumY)
//      return x;
//    else
//      return y;
//}