package com.ola;
import java.util.Arrays;

/**
 * Suzuki needs help lining up his students! * Today Suzuki will be interviewing his students to ensure they are progressing
 * in their training. He decided to schedule the interviews based on the length
 * of the students name in descending order. The students will line up and wait
 * for their turn.
 * You will be given a string of student names. Sort them and return a list of
 * names in descending order.
 * Here is an example input:
 * string = 'Tadashi Takahiro Takao Takashi Takayuki Takehiko Takeo Takeshi
 * Takeshi' 
 * Here is an example return from your function: * 
 * lst = ['Takehiko', 'Takayuki', 'Takahiro', 'Takeshi', 'Takeshi', 'Takashi',
 * 'Tadashi', 'Takeo', 'Takao'] 
 * Names of equal length will be returned in reverse alphabetical order (
 * Z->A) such that:
 * string = "xxa xxb xxc xxd xa xb xc xd" 
 * Returns
 * ['xxd', 'xxc', 'xxb', 'xxa', 'xd', 'xc', 'xb', 'xa']
 */

public class Kata {

	public static String[] lineupStudents(String students) {
		
		String[] arr = students.split(" ");
		Arrays.sort(arr);
		String temp = "";
		for (int i = 0; i < arr.length; i++) {
			for (int j = 1; j < arr.length - i; j++) {
				if (arr[j].length() > arr[j - 1].length()) {
					temp = arr[j - 1];
					arr[j - 1] = arr[j];
					arr[j] = temp;
				} else if (arr[j].length() == arr[j - 1].length() && arr[j - 1].compareTo(arr[j]) < 0) {
					temp = arr[j - 1];
					arr[j - 1] = arr[j];
					arr[j] = temp;
				}
			}
		}
		return arr;
	}
}
