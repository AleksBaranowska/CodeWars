package com.ola;

/**
 * rps('scissors','paper') // Player 1 won! 
 * rps('scissors','rock') // Player 2
 * won! rps('paper','paper') // Draw!
 */

public class Kata {

	public static String rps(String p1, String p2) {
		
		String scissors = "scissors";
		String rock = "rock";
		String paper = "paper";
		String result = "";
		if (p1.equals(p2))
			result = "Draw!";
		else if (p1.equals(rock)) {
			if (p2.equals(scissors))
				result = "Player 1 won!";
			else if (p2.equals(paper))
				result = "Player 2 won!";
		} else if (p1.equals(paper)) {
			if (p2.equals(scissors))
				result = "Player 2 won!";
			else if (p2.equals(rock))
				result = "Player 1 won!";
		} else if (p1.equals(scissors)) {
			if (p2.equals(paper))
				result = "Player 1 won!";
			else if (p2.equals(rock))
				result = "Player 2 won!";
		}
		return result;
	}
}
