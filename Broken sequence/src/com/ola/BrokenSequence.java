package com.ola;

import java.util.Arrays;
//import java.util.Optional;
import java.util.stream.Stream;

/**
 *
 * You receive some random elements as a space-delimited string. Check if the
 * elements are part of an ascending sequence of integers starting with 1, with
 * an increment of 1 (e.g. 1, 2, 3, 4).
 * Return:
 * 0 if the elements can form such a sequence, and no number is missing ("not
 * broken", e.g. "1 2 4 3") 1 if there are any non-numeric elements in the input
 * ("invalid", e.g. "1 2 a") n if the elements are part of such a sequence, but
 * some numbers are missing, and n is the lowest of them ("broken", e.g. "1 2 4"
 * or "1 5") 
 * Examples 
 * "1 2 3 4" ==> return 0, because the sequence is complete
 * "1 2 4 3" ==> return 0, because the sequence is complete (order doesn't
 * matter)
 * "2 1 3 a" ==> return 1, because it contains a non numerical character
 * "1 3 2 5" ==> return 4, because 4 is missing from the sequence
 * "1 5" ==> return 2, because the sequence is missing 2, 3, 4 and 2 is the
 * lowest
 */
public class BrokenSequence {

	public static int findMissingNumber(String sequence) {
		// System.out.println(sequence);
		// checks for empty string
		if (sequence.isEmpty())
			return 0;
		else if (!sequence.matches("^[0-9 ]+"))// checks for non numeric values and characters (or numeric i
												// whitespaces)
			return 1;
		else {
			int[] ints = Stream.of(sequence.split(" ")).mapToInt(Integer::parseInt).toArray();
			Arrays.sort(ints);
			for (int i = 0, result = 1; i < ints.length; i++, result++) {
				if (ints[i] != result) {
					return result;
				}
			}
		}

		return 0;
	}

	public static void main(String[] args) {

		findMissingNumber(
				"1 2 3 4 5 6 7 8 9 10 11 12 13 14 15 16 17 18 19 20 21 22 23 24 25 26 27 28 29 30 31 32 33 34 35 36 37 38 39 40 41 42 43 44 45 46 47 48 49 50 51 52 53 54 55 56 57 58 59 60 61 62 63 64 65 66 67 68 69 70 71 72 73 74 75 76 77 78 79 80 81 82 83 84 85 86 87 88 89 91 92 93 94 95 96 97 98 99 100 101 102");
		findMissingNumber("1 2 3 5");
		findMissingNumber("");// 0
		findMissingNumber("2 1 4 3 a");// 1
		findMissingNumber("2 3 4 5");// 1
		findMissingNumber("_______");// 1
		findMissingNumber("1 5");// 2);

	}

}

//import java.util.List;
//import java.util.Set;
//import java.util.stream.Collectors;
//import java.util.stream.IntStream;
//import java.util.stream.Stream;
//
//public class BrokenSequence {
//
//  public static int findMissingNumber(String sequence) {
//    if (sequence == null || sequence.isEmpty()) {
//      return 0;
//    }
//    if (!sequence.matches("[0-9 ]+")) {
//      return 1;
//    }
//    List<Integer> have = Stream
//      .of(sequence.split(" "))
//      .mapToInt(Integer::valueOf)
//      .sorted()
//      .boxed()
//      .collect(Collectors.toList());
//    Set<Integer> expected = IntStream
//      .rangeClosed(1, have.get(have.size() - 1))
//      .boxed()
//      .collect(Collectors.toSet());
//    expected.removeAll(have);
//    return expected.isEmpty() ? 0 : expected.size() == 1 ? expected.stream().min(Integer::compare).get() : 2;
//  }
//    
//}
