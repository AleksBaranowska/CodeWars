package com.ola;

/**
 * Bob needs a fast way to calculate the volume of a cuboid with three values:
 * length, width and the height of the cuboid. Write a function to help Bob with
 * this calculation.
 */

public class Kata {
	public static double getVolumeOfCuboid(final double length, final double width, final double height) {
		double volume = length * width * height;
		return volume;
	}
}