package com.ola;

/**
 * What could be easier than comparing integer numbers? However, the given piece
 * of code doesn't recognize some of the special numbers for a reason to be
 * found. Your task is to find the bug and eliminate it.
 */

public class HowDoICompare {

	public static String whatIs(Integer x) {
		String str = "";
		if (42 == x)
			str = "everything";
		else if (42 * 42 == x)
			str = "everything squared";
		else
			str = "nothing";
		return str;
	}

	static final Object[][] specialNumbers = { { 42, "everything" }, { 42 * 42, "everything squared" }, };

}
