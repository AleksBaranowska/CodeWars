package com.ola;

public class XO {
	public static boolean getXO(String str) {

		int countX = 0;
		int countO = 0;
		char[] charArray = str.toLowerCase().toCharArray();
		for (int i = 0; i < charArray.length; i++) {
			if (charArray[i] == 'x') {
				countX++;
			}
			if (charArray[i] == 'o') {
				countO++;
			}
		}
		boolean bool = (countX == countO) ? true : false;
		// System.out.println(bool);
		return bool;
	}
}
