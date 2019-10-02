package com.ola;

/**
 * Description: Remove all exclamation marks from the end of words. Words are
 * separated by spaces in the sentence.
 * Examples 
 * remove("Hi!") === "Hi" 
 * remove("Hi!!!") === "Hi" 
 * remove("!Hi") === "!Hi" 
 * remove("!Hi!") === "!Hi" 
 * remove("Hi! Hi!") === "Hi Hi" 
 * remove("!!!Hi !!hi!!! !hi") === "!!!Hi !!hi !hi"
 */

public class R {
	public static String removeBang(String str) {
		
		return str = str.replaceAll("\\b!+", "");
	}
}
// str = str.replaceFirst("^ *", "");