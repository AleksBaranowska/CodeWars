package com.ola;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * Input:
 * a string strng an array of strings arr 
 * Output of function contain_all_rots(strng, arr) 
 * (or containAllRots or contain-all-rots):
 * a boolean true if all rotations of strng are included in arr (C returns 1)
 * false otherwise (C returns 0) 
 * Examples: contain_all_rots( "bsjq", ["bsjq",
 * "qbsj", "sjqb", "twZNsslC", "jqbs"]) -> true
 * contain_all_rots( "Ajylvpy", ["Ajylvpy", "ylvpyAj", "jylvpyA", "lvpyAjy",
 * "pyAjylv", "vpyAjyl", "ipywee"]) -> false) 
 * Note: 
 * Though not correct in a mathematical sense
 * we will consider that there are no rotations of strng == "" 
 * and for any array arr: contain_all_rots("", arr) --> true 
 */

public class Rotations {

	public static Boolean containAllRots(String strng, List<String> arr) {
		Boolean bool = false;
		if (strng == "")
			bool = true;
		else {
			ArrayList<Character> strToList = new ArrayList<Character>();
			for (char c : strng.toCharArray())
				strToList.add(c);
			StringBuilder builder = new StringBuilder(strToList.size());
			for (Character ch : strToList)
				builder.append(ch);
			int counter = 0;
			int half = strng.length() / 2;
			for (int i = 0; i < arr.size(); i++) {
				if (strng.substring(0, half).equals(strng.substring(half))) {
					for (int k = 0; k < strToList.size() / 2; k++, Collections.rotate(strToList, 1)) {
						builder = new StringBuilder(strToList.size());
						for (Character ch : strToList)
							builder.append(ch);
						if (builder.toString().equals(arr.get(i))) {
							counter += 2;
						}
					}
				} else if (arr.get(i).equals(builder.toString())) {
					counter++;
					}

				else {
					for (int k = 0; k < strToList.size(); k++, Collections.rotate(strToList, 1)) {
						builder = new StringBuilder(strToList.size());
						for (Character ch : strToList)
							builder.append(ch);

						if (builder.toString().equals(arr.get(i))) {
							counter++;
							continue;
						}
					}
				}
			}
			if (counter >= strng.length())
				bool = true;
		}
		return bool;
	}
}
