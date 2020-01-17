package com.ola;

/**
 * Definition A number is called Automorphic number if and only if its square
 * ends in the same digits as the number itself. Task Given a number determine
 * if it Automorphic or not . Single-digit numbers are considered Automorphic
 * number. 
 * Input >> Output Examples 
 * autoMorphic (25) -->> return "Automorphic"
 * Explanation: 25 squared is 625 , Ends with the same number's digits which are 25 . 
 * autoMorphic (13) -->> return "Not!!" Explanation: 13 squared is 169 ,
 * Not ending with the same number's digits which are 69 . autoMorphic (76) -->>
 * return "Automorphic" Explanation: 76 squared is 5776 , Ends with the same
 * number's digits which are 76 . autoMorphic (225) -->> return "Not!!"
 * Explanation: 225 squared is 50625 , Not ending with the same number's digits
 * which are 225 . autoMorphic (625) -->> return "Automorphic" Explanation: 625
 * squared is 390625 , Ends with the same number's digits which are 625 .
 * autoMorphic (1) -->> return "Automorphic" Explanation: 1 squared is 1 , Ends
 * with the same number's digits which are 1 . autoMorphic (6) -->> return
 * "Automorphic" Explanation: 6 squared is 36 , Ends with the same number's
 * digits which are 6
 */

public class Solution {

	public static String autoMorphic(int number)
    {
		String squared = String.valueOf(number * number);
		String num = String.valueOf(number);
		int s = Integer.parseInt(squared.substring(squared.length() - num.length()));
		if (s==number)
			return "Automorphic";
		else
			return "Not!!";
	}
	
//	public static String autoMorphic(int n) {
//	      return (n*n+"").endsWith(""+n)?"Automorphic":"Not!!";
//	    }

}


