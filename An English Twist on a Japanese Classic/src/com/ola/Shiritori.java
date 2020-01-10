package com.ola;
import java.util.*;
/**
 * Background: In Japan, a game called Shiritori is played. The rules are
 * simple, a group of people take turns calling out a word whose beginning
 * syllable is the same as the previous player's ending syllable. For example,
 * the first person would say the word ねこ, and the second player must make a
 * word that starts with こ, like こむぎ. This repeats until a player can not think
 * of a word fast enough or makes a word that ends in ん, because there are no
 * words that begin with ん in the Japanese language.
 * 
 * English Shiritori has the same principle, with the first and last letters of
 * words. That being said the lose condition is saying a word that doesn't start
 * with the previous word's last letter or not saying a word quick enough.
 * 
 * For example: apple -> eggs -> salmon -> nut -> turkey ...
 * 
 * Your Task: You will be given a list of strings, a transcript of an English
 * Shiritori match. Your task is to find out if the game ended early, and return
 * a list that contains every valid string until the mistake. If a list is empty
 * return an empty list. If one of the elements is an empty string, that is
 * invalid and should be handled.
 * Examples: All elements valid: The array
 * {"dog","goose","elephant","tiger","rhino","orc","cat"}
 * should return {"dog","goose","elephant","tiger","rhino","orc","cat"}
 * An invalid element at index 2: The array {"dog","goose","tiger","cat",
 * "elephant","rhino","orc"}
 * should return ("dog","goose") since goose ends in 'e' and tiger starts with
 * 't'
 * An invalid empty string at index 2: The array {"ab","bc","","cd"}
 * should return ("ab","bc")
 * All invalid empty string at index 0: The array {"","bc","","cd"}
 * should return An Empty List
 */
public class Shiritori {

	public static List<String> theGame(List<String> words) {

		// System.out.println(words.toString());
		List<String> result = new ArrayList<>();
		if (words.size() == 0)
			return result;
		if (words.get(0).length() != 0)
			result.add(words.get(0));
		for (int i = 1; i < words.size(); i++) {
			String str = words.get(i);
			if (!str.isEmpty())
				if (result.get(i - 1).charAt(result.get(i - 1).length() - 1) == str.charAt(0))
					result.add(str);
				else
					break;
			else
				break;
		}
		// System.out.println(result.toString());
		return result;
	}

	public static void main(String[] args) {
		List<String> l = Arrays.asList("dog", "goose", "elephant", "tiger", "rhino", "orc", "cat");
		List<String> l2 = Arrays.asList("dog", "goose", "tiger", "cat", "elephant", "rhino", "orc");
		theGame(l);// [dog, goose, elephant, tiger, rhino, orc, cat]
		theGame(l2);// [dog, goose]

	}

}

//import java.util.*;
//import java.util.stream.*;
//
//public class Shiritori {
//    
//    public static List<String> theGame(List<String> words) {
//        
//        if (words.isEmpty() || words.get(0).isEmpty())
//            return new ArrayList<String>();
//            
//        int x = IntStream.range(1, words.size())
//                         .filter( i -> words.get(i).isEmpty()
//                                       || words.get(i-1).charAt(words.get(i-1).length()-1) != words.get(i).charAt(0) )
//                         .findFirst()
//                         .orElse(words.size());
//        return words.subList(0,x);
//    }
//}


