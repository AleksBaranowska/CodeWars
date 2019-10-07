package com.ola;
import java.util.*;

/**
 * Write function describeList which tells if the list is empty or contains only
 * one element or more.
 */

public class Kata {

	public static String describeList(final List list) {
		String str = "";
		return str = list.isEmpty() ? "empty" : list.size() > 1 ? "longer" : "singleton";
	}

}
