package com.ola;

/**
 * given an input string str, return a string such that all letters change case
 * all digits are replaced with it's compliment to 9 (0 => 9, 1 => 8...) each
 * letter is replaced by it's compliment in the alphabet (a => z, B => Y, c =>
 * x...) the result is reversed
 * Example: 
 * "abcWXY123" => "678bcdXYZ" 
 * only strings with letters and numbers will be passed in.
 */

public class JomoPipi {

	public static String antiString(String str) {

		char[] array = str.toCharArray();
		char[] reversedArray = new char[array.length];
		for (int i = 0; i < array.length; i++) {
			Character c = array[i];
			if (Character.isLetter(c)) {
				if (Character.isLowerCase(c)) {
					c = (char) ('z' - (c - 'a'));
					c = Character.toUpperCase(c);

				} else {
					c = (char) ('Z' - (c - 'A'));
					c = Character.toLowerCase(c);
				}
			} else {
				c = (char) ('9' - Character.getNumericValue(c));
			}
			reversedArray[reversedArray.length - i - 1] = c;
		}

		String result = String.valueOf(reversedArray);
		return result;
		
	}

	public static void main(String[] args) {
		String str = "9Z";
		String str1 = "678XyZ";
		String str2 = "abcWXY123";

		System.out.println(antiString(str));
		System.out.println(antiString(str1));
		System.out.println(antiString(str2));
	}

}
/**
 * clever solution 
 * public static String antiString(String str){ 
 * StringBuilder sb = new StringBuilder(); 
 * for (char c: str.toCharArray()) 
 * sb.append( (char) (c<'A' ? ('9'+'0'-c) : ('z'+'A'-c)) ); 
 * return sb.reverse().toString(); }
 * public static String antiString(String s) { 
 * return new String(s .chars() 
 * .map(c -> c + 32 * (c >= 65 && c < 91 ? 1 : c >= 97 && c < 123 ? -1 : 0)) // All letters change case 
 * .map(c -> c >= 48 && c < 58 ? 105 - c : c) // All digits replaced with complement to 9 
 * .map(c -> c >= 65 && c < 91 ? 155 - c : c >= 97 && c < 123 ? 219 - c : c) // Each letter replaced
 * by complement in alphabet position (case-insensitive) 
 * .boxed() .sorted((a, b) -> -1) // The string is reversed 
 * .mapToInt(Integer::intValue) .toArray(), 0, s.length()); } }
 */