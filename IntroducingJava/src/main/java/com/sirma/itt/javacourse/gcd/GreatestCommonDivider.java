package com.sirma.itt.javacourse.gcd;

/**
 * GreatestCommonDivider
 * Version: 1.0
 * @author ivasilev
 */
public class GreatestCommonDivider {
	
	/**
	 * findGcd(int, int)
	 * @param x
	 * @param y
	 * @return
	 */
	 
	public int findGcd(int x, int y) {
		
		while (x > y){
			x= x-y;
		}
		return x;
	}

}
