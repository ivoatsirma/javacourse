package com.sirma.itt.javacourse.gcd;

import static org.junit.Assert.*;
import junit.framework.Assert;

import org.junit.Test;

/**
 * 
 * @author ivasilev
 */
public class GcdExec {

	@Test
	public void test() {
		// Testing the findFcd() method
		GreatestCommonDivider testGcd = new GreatestCommonDivider();
		int testGcdOne = testGcd.findGcd(21, 180);
		int testGcdTwo = testGcd.findGcd(5, 10);
		int testGcdThree = testGcd.findGcd(30, 77);
		Assert.assertEquals(3, testGcdOne);
		Assert.assertEquals(5, testGcdTwo);
		Assert.assertNotSame(4, testGcdThree);
		
		//fail("Not yet implemented");
	}

}
