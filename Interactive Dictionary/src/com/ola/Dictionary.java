package com.ola;

/**
 * In this kata, your job is to create a class Dictionary which you can add
 * words to and their entries. Example:
 * >>> Dictionary d = new Dictionary();
 * >>> d.newEntry("Apple", "A fruit that grows on trees");
 * >>> System.out.println(d.look("Apple")); 
 * A fruit that grows on trees * 
 * >>> System.out.println(d.look("Banana")); 
 * Cant find entry for Banana 
 */

public class Dictionary {
	String word;
	String definition;

	public void newEntry(String a, String b) {
		this.word = a;
		this.definition = b;
	}

	public String look(String a) {
		if (a.equals(word))
			return this.definition;
		else
			return "Cant find entry for " + a;
	}
}