package com.ola;

import java.util.Arrays;

/**
 * Punky loves wearing different colored socks, but Henry can't stand it. Given
 * an array of different colored socks, return a pair depending on who was
 * picking them out. Example: 
 * getSocks("Punky", ["red","blue","blue","green"]) -> ["red", "blue"] 
 * Note that Punky can have any two colored socks, in any
 * order, as long as they are different and both exist. Henry always picks a
 * matching pair. If there is no possible combination of socks, return an empty
 * array.
 */

public class EightiesKids3 {

	public static String[] getSocks(String name, String[] socks) {
		
		String[] pair = new String[2];
		if (socks.length < 2)
			return new String[0];
		if (name == "Henry") {
			for (int i = 0; i < socks.length; i++) {
				for (int j = 1; j < socks.length; j++) {
					if (socks[i].equals(socks[j])) {
						if (!(socks[i].indexOf(" ") > 0)) {
							pair[0] = socks[i];
							pair[1] = socks[i];
							return pair;
						}
					}
				}
			}
		} else if (name == "Punky") {
			for (int i = 0; i < socks.length; i++) {
				for (int j = 1; j < socks.length; j++) {
					if (!socks[i].equals(socks[j]))
						if (!(socks[i].indexOf(" ") > 0)) {
							pair[0] = socks[i];
							pair[1] = socks[j];
							return pair;
						}
				}
			}

		} else
			pair = new String[0];
		return pair;
	}

	public static void main(String[] args) {
//		String punky = "Punky";
//		String[] arr1 = { "pink", "argyle", "argyle" };
//		String[] arr2 = { "pink", "argyle" };
//		String[] arr3 = { "pink", "pink", "pink", "pink" };
//		String[] arr4 = { "pink", "pink", "dirty sock", "blue", "golden", "silver", "green", "golden", "argyle" };
//		String[] arr5 = { "pink", "argyle", "argyle" };
//		String henry = "Henry";
//		String[] arr6 = { "red", "blue", "blue", "green" };

//		String[] reult1 = getSocks(punky, arr1);
//		String[] reult2 = getSocks(punky, arr2);
//		String[] reult3 = getSocks(punky, arr3);
//		String[] reult4 = getSocks(punky, arr4);
//		String[] reult5 = getSocks(punky, arr5);
//		String[] reult6 = getSocks(henry, arr6);

	}
}
