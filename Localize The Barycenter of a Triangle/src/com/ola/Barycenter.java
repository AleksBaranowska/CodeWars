package com.ola;
import java.math.BigDecimal;

/**
 * The medians of a triangle are the segments that unit the vertices with the
 * midpoint of their opposite sides. The three medians of a triangle intersect
 * at the same point, called the barycenter or the centroid. Given a triangle,
 * defined by the cartesian coordinates of its vertices we need to localize its
 * barycenter or centroid.
 * The function bar_triang() or barTriang or bar-triang, receives the
 * coordinates of the three vertices A, B and C as three different arguments and
 * outputs the coordinates of the barycenter O in an array [xO, yO]
 * This is how our asked function should work: the result of the coordinates
 * should be expressed up to four decimals, (rounded result).
 * You know that the coordinates of the barycenter are given by the following
 * formulas.
 * For additional information about this important point of a triangle see at:
 * (https://en.wikipedia.org/wiki/Centroid)
 * barTriang([4, 6], [12, 4], [10, 10]) ------> {8.6667, 6.6667}
 * barTriang([4, 2], [12, 2], [6, 10] ------> {7.3333, 4.6667} 
 * The given points form a real or a degenerate triangle but in each case the above formulas can
 * be used.
 */

public class Barycenter {

	public static double[] barTriang(double[] x, double[] y, double[] z) {
		double cor1 = (x[0] + y[0] + z[0]) / 3;
		double cor2 = (x[1] + y[1] + z[1]) / 3;
		BigDecimal firstArg = new BigDecimal(String.valueOf(cor1)).setScale(4, BigDecimal.ROUND_HALF_UP);
		BigDecimal secondArg = new BigDecimal(String.valueOf(cor2)).setScale(4, BigDecimal.ROUND_HALF_UP);
		double[] result = new double[] { firstArg.doubleValue(), secondArg.doubleValue() };
		return result;
	}
}
