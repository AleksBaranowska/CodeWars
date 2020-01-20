package com.ola;

/**
 * Definition Balanced number is the number that * The sum of all digits to the
 * left of the middle digit(s) and the sum of all digits to the right of the
 * middle digit(s) are equal*.
 * Task Given a number, Find if it is Balanced or not .
 * Notes 
 * If the number* has an odd number of digits then there is only one middle digit, 
 * e.g. 92645 has middle digit 6; otherwise, there are two middle digits , e.g. 1301 has
 * middle digits 3 and 0
 * The middle digit(s) should not be considered when determining whether a
 * number is balanced or not, e.g 413023 is a balanced number because the left
 * sum and right sum are both 5.
 * Number passed is always Positive .
 * Return the result as String
 * Input >> Output Examples 
 * balancedNum (7) ==> return "Balanced" Explanation:
 * Since , The sum of all digits to the left of the middle digit (0)
 * and the sum of all digits to the right of the middle digit (0) are equal ,
 * then It's Balanced
 * balancedNum (295591) ==> return "Not Balanced" Explanation: Since , The sum
 * of all digits to the left of the middle digits (11)
 * and the sum of all digits to the right of the middle digits (10) are equal ,
 * then It's Not Balanced 
 * Note : The middle digit(s) are 55 . 
 * balancedNum (959) ==> return "Balanced" Explanation: Since , The sum of all
 * digits to the left of the middle digits (9)
 * and the sum of all digits to the right of the middle digits (9) are equal ,
 * then It's Balanced
 * Note : The middle digit is 5 .
 * balancedNum (27102983) ==> return "Not Balanced" Explanation: Since , The sum
 * of all digits to the left of the middle digits (10)
 * and the sum of all digits to the right of the middle digits (20) are equal ,
 * then It's Not Balanced
 * Note : The middle digit(s) are 02 .
 */

public class Solution {

	public static String balancedNum(long number) {
		String str = Long.toString(number);
		long left = 0;
		long right = 0;
		if (str.length() == 1 || str.length() == 2)
			return "Balanced";
		else if (str.length() % 2 == 0) {
			for (int i = 0, j = str.length() / 2 + 1; i < (str.length() - str.length() / 2) - 1; i++, j++) {
				left += Character.getNumericValue(str.charAt(i));
				right += Character.getNumericValue(str.charAt(j));
			}
		} else {
			for (int i = 0, j = str.length() - 1; i < str.length() / 2; i++, j--) {
				left += Character.getNumericValue(str.charAt(i));
				right += Character.getNumericValue(str.charAt(j));
			}
		}
		if (left == right)
			return "Balanced";
		else
			return "Not Balanced";
	}

	public static void main(String[] args) {
		System.out.println(balancedNum(13));
		System.out.println(balancedNum(7));
		System.out.println(balancedNum(27102983));
		System.out.println(balancedNum(989));
	}
}
//public static String balancedNum(long number) {
//    String numberString = String.valueOf(number);
//
//    int evenOffset = numberString.length() % 2 == 0 ? 1 : 0;
//
//    int left = numberString.substring(0, numberString.length() / 2 - evenOffset)
//                           .chars()
//                           .sum();
//
//    int right = numberString.substring((numberString.length() / 2) + 1)
//                            .chars()
//                            .sum();
//
//    return (left == right ? "" : "Not ") + "Balanced";
//}



//    public static String balancedNum(long number)
//    {
//        char[] digits = (number + "").toCharArray();
//        int left = 0, right = digits.length - 1;
//        int sumLeft = 0, sumRigh = 0;
//        while(left < right && left + 1 != right){
//          sumLeft += digits[left++] - '0';
//          sumRight += digits[right--] - '0';
//        }
//        return sumLeft == sumRigh ? "Balanced" : "Not Balanced";
//    }
