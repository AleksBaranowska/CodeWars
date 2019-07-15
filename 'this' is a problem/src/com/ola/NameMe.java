package com.ola;

/**
 * We want to create a constructor function 'NameMe', which takes first name and
 * last name as parameters. The function combines the first and last names and
 * saves the value in "name" property.
 * 
 * We already implemented that function, but when we actually run the code, the
 * "name" property is accessible, but the "firstName" and "lastName" is not
 * accessible. All the properties should be accessible. Can you find what's
 * wrong with it? A test fixture is also available
 * 
 * public class NameMe { 
 * private String firstName; 
 * private String lastName;
 * private String fullName; 
 * public NameMe(String first, String last) { 
 * this.firstName = first;
 * this.lastName = last; }
 *  }
 * 
 * NameMe nameMe = new NameMe("John", "Doe"); 
 * nameMe.getFirstName(); Expected: John 
 * nameMe.getLastName(); Expected: Doe 
 * nameMe.getFullName(); Expected: John Doe
 */

public class NameMe {
	String firstName;
	String lastName;
	String fullName;

	public NameMe(String first, String last) {
		this.firstName = first;
		this.lastName = last;
		this.fullName = first + " " + last;
	}

	public String getFirstName() {
		// this(firstName,lastName)
		// this.firstName = firstName;
		return this.firstName;
	}

	public String getLastName() {
		return this.lastName;
	}

	public String getFullName() {

		String fullName = firstName + " " + lastName;
		return fullName;
	}
}
