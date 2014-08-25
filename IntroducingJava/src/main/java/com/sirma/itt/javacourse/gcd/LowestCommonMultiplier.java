package com.sirma.itt.javacourse.gcd;
/**
 * LowestCommonMultiplier
 * Version 1.0
 * @author ivasilev
 */
public class LowestCommonMultiplier {

	/**
	 * findLCM(int, int)
	 * @param x
	 * @param y
	 * @return
	 */
	public static int findLCM(int x, int y){
		return ((x-y)/GreatestCommonDivider.findGcd(x, y));
	}
}
