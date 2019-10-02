package com.ola;

/**
 * Jenny has written a function that returns a greeting for a user. However,
 * she's in love with Johnny, and would like to greet him slightly different.
 * She added a special case to her function, but she made a mistake.
 */

public class Greeter {
	public static String greet(String name) {
		
		String str = String.format("Hello, %s!", name);
		String result = "";
		if (name.equals("Johnny"))
			result = "Hello, my love!";
		else
			result = str;
		return result;
	}
}
