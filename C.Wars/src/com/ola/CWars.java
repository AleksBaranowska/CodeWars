package com.ola;

import static java.util.Arrays.stream;
import static java.util.stream.Collectors.joining;

/**
 * Normally we have firstname, middle and the last name but there may be more
 * than one word in a name like a South Indian one.
 * Similar to those kinda names we need to initialize the names.
 * See the pattern below
 * initials('code wars') => returns C.Wars initials('Barack Hussain obama') =>
 * returns B.H.Obama
 */



public class CWars {

//	public static String initials(String name) {
//		String[] initials = name.toUpperCase().split(" ");
//		String result = "";

//		for (int i = 0; i < initials.length; i++) {
//        result += initials[i-1].charAt(0)+".";
//		}
//		System.out.println( result + parts[parts.length-1].charAt(0) + parts[parts.length-1].substring(1).toLowerCase());
//		return  return result + parts[parts.length-1].charAt(0) + parts[parts.length-1].substring(1).toLowerCase();
//	}

	static String initials(String name) {
		return stream(name.split(" ")).map(s -> s.substring(0, 1).toUpperCase()).collect(joining("."))
				+ name.substring(name.lastIndexOf(' ') + 2);
	}

	public static void main(String[] args) {
		System.out.println(initials("Michael brown"));
		System.out.println(initials("Bernardo James Laura Charlotte William Zoe collins"));
		System.out.println(initials("miguel sophia Eduarda alexander Russell"));
		System.out.println(initials("eduarda lucas mason David hall"));
		System.out.println(initials("Rafael jacob Bernardo giovanna maria alexander zoe moore"));
		System.out.println(initials("Luiza Hector Giovanna valentina Olivia caroline bennett"));
		System.out.println(initials("Abigail bennett"));
		System.out.println(initials("julia clark"));
	}
}
