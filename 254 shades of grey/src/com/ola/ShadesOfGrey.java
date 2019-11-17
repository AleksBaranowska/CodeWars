package com.ola;

/**
 * Why would we want to stop to only 50 shades of grey? Let's see to how many we
 * can go.
 * Write a function that takes a number n as a parameter and return an array
 * containing n shades of grey in hexadecimal code (#aaaaaa for example). The
 * array should be sorted in ascending order starting with #010101, #020202,
 * etc. (using lower case letters).
 * public class ShadesOfGrey { static String[] shadesOfGrey(int num) {
 * // returns n shades of grey in an array } } 
 * As a reminder, the grey color is composed by the same number of red, green and blue: #010101,
 * #aeaeae, #555555, etc. Also, #000000 and #ffffff are not accepted values.
 * When n is negative, just return an empty array. If n is higher than 254, just
 * return an array of 254 elements.
 */

public class ShadesOfGrey {
	
	public static String[] hexMap = "0123456789abcdef".split("");


	static String[] shadesOfGrey(int num) {
		// System.out.println("num = " + num);
		// returns n shades of grey in an array
		// hex color is a 6 digits hexadecimal number
		// the 2 left digits represent red
		// 2 middle digits represent green
		// 2 right digits represent blue
		// the red,green and blue use 8 bits each, which have integer values from 0 to
		// 255
		// grey is represented by same value of every color:red,blue and green
		
		String[] ar = {};
		if (num < 1)
			ar = new String[0];
		else if (num > 254)
			ar = new String[254];
		else
			ar = new String[num];
		for (int i = 0, j = 1; i < ar.length; i++, j++) {
			ar[i] = rgbToHex(j, j, j);
			//System.out.println(ar[i]);
		}
		
		return ar;
	};

	
	public static String decToHex(Integer x) {
		if (x == 0)
			return "00";
		String result = "";
		while (x != 0) {
			Integer modulus = Math.floorMod(x, 16);
			result = hexMap[modulus] + result;
			x /= 16;
		}
		// System.out.println(result.length() == 1 ? '0' + result : result);
		return result.length() == 1 ? '0' + result : result;
	}

	public static String rgbToHex(Integer r, Integer g, Integer b) {
		return '#' + decToHex(r) + decToHex(g) + decToHex(b);
	}

	
}

/**
 * Some alternatives: 

 * static String[] shadesOfGrey(int num) { 
 * num = Math.max(0, Math.min(254, num)); 
 * String[] result = new String[num]; 
 * for (int i = 1; i <= num; ++i) { 
 * result[i - 1] = String.format("#%02x%02x%02x", i, i, i); } 
 * return result; }
 * 
 * static String[] EMPTY = new String[0];
 * static char[] HEX = new char[]{'0','1','2','3','4','5','6','7','8','9','a','b','c','d','e','f'};
 * 
 * static String[] shadesOfGrey(int num) { 
 * if(num <= 0) return EMPTY; 
 * if(num > 254) num = 254; 
 * String[] result = new String[num]; 
 * char[] color = new char[]{'#','0','0','0','0','0','0'}; 
 * for(int i = 1; i <= num; ++i){ 
 * color[1] = color[3] = color[5] = HEX[i >> 4]; 
 * color[2] = color[4] = color[6] = HEX[i & 15]; 
 * result[i - 1] = new String(color); } return result; }
 * 
 * import java.util.stream.IntStream;
 * public class ShadesOfGrey { 
 * static String[] shadesOfGrey(final int num) {
 * return (String[]) IntStream 
 * .rangeClosed(1, Math.min(num, 254)) 
 * .mapToObj(i -> String.format("#%1$02x%1$02x%1$02x", i)) .toArray(String[]::new); } }
 * 
 */
