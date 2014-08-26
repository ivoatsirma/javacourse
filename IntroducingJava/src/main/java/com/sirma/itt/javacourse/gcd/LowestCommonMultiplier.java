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
	public int findLCM(int x, int y){
		GreatestCommonDivider gcd = new GreatestCommonDivider();
		return ((x-y)/gcd.findGcd(x, y));
	}
}
