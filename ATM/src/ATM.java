/**
 * There is enough money available on ATM in nominal value 10, 20, 50, 100, 200
 * and 500 dollars.
 * You are given money in nominal value of n with 1<=n<=1500.
 * Try to find minimal number of notes that must be used to repay in dollars, or
 * output -1 if it is impossible.
 */
public class ATM {
	public static int solve(int n) {
		
		int[] notes = { 10, 20, 50, 100, 200, 500 };
		int reminder = 0;
		int result = 0;
		
		for (int i = 5; i >= 0; i--) {
			reminder = n % notes[i];
			if (n != 0) {
				reminder = n / notes[i];
				n = n % notes[i];
				result += reminder;
			}
		}

		if (n > 0) {
			return -1;
		}
		return result;

	}

	public static void main(String[] args) {
		System.out.println(solve(770)); // -> 4
		System.out.println(solve(125));// -> -1
		System.out.println(solve(550));// -> 2
		System.out.println(solve(10)); // -> -1
	}

}

/**
 * int[] denominations = new int[]{500, 200, 100, 50, 20, 10};
   int result = 0;
   for (int denomination: denominations) {
      result += n / denomination;
      n %= denomination;
    }
    return n == 0 ? result : -1;
 */
