package com.ola;

/**
 * The code provided is supposed return a person's Full Name given their first
 * and last names.
 * But it's not working properly.
 * Notes 
 * The first and/or last names are never null (None in Python), but may be
 * empty.
 * Task Fix the bug so we can all go home early.
 */

public class Dinglemouse {
	private String firstName;
	private String lastName;

	public Dinglemouse(String firstName, String lastName) {
		if (firstName != null && lastName != null) {
			this.firstName = firstName;
			this.lastName = lastName;
		}
	}

	public String getFullName() {

		if (firstName.isEmpty() && lastName.isEmpty())
			return "";
		else if (firstName.isEmpty())
			return this.lastName;
		else if (lastName.isEmpty())
			return this.firstName;
		else
			return this.firstName + " " + this.lastName;
	}

}
