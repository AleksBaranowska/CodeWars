package ola.com;

import java.util.*;

/**
 * Oh No!
 * The song sheets have been dropped in the snow and the lines of each verse
 * have become all jumbled up.
 * Task 
 * You have to write a comparator function which can sort the lines back
 * into their correct order, otherwise Christmas will be cancelled!
 * Reminder: 
 * Below is what the final verse should look like
 * On the 12th day of Christmas my true love gave to me 
 * 12 drummers drumming, 
 * 11 pipers piping, 
 * 10 lords a leaping, 
 * 9 ladies dancing, 
 * 8 maids a milking, 
 * 7 swans a swimming, 
 * 6 geese a laying, 
 * 5 golden rings, 
 * 4 calling birds, 
 * 3 French hens, 
 * 2 turtle doves and 
 * a partridge in a pear tree.
 */

public class Dinglemouse {

	public int compare(final String line1, final String line2) {
		int a = 0;
		int b = 0;

		if (line1.contains("day of Christmas my true love gave to me"))
			a = Integer.parseInt(line2.replaceAll("[^0-9]", "")) + 1;
		else if (line1.equals("a partridge in a pear tree."))
			a = 0;
		else
			a = Integer.parseInt(line1.replaceAll("[^0-9]", ""));
		//System.out.println(" a =" + a);

		if (line2.equals("On the 12th day of Christmas my true love gave to me")) {
			b = 13;
		} else if (line2.equals("a partridge in a pear tree.")) {
			b = 0;
		} else {
			b = Integer.parseInt(line2.replaceAll("[^0-9]", ""));
		}
		return a < b ? 1 : a == b ? 0 : -1;
	}
}
