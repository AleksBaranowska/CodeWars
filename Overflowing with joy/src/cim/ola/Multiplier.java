package cim.ola;

/**
 * Multiply two ints, but take care of overflow. If the result cannot be
 * accurately stored in an int, throw an ArithmeticException.
 */

public class Multiplier {

	public static int multiply(int a, int b) {

		if (b > 0 ? a > Integer.MAX_VALUE / b || a < Integer.MIN_VALUE / b
				: (b < -1 ? a > Integer.MIN_VALUE / b || a < Integer.MAX_VALUE / b
						: b == -1 && a == Integer.MIN_VALUE)) {
			throw new ArithmeticException("Integer overflow");
		}
		return a * b;
	}

}
