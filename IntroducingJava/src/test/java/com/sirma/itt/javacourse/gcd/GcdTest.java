package com.sirma.itt.javacourse.gcd;

import org.junit.Assert;
import org.junit.Test;

/**
 * Method testing the GreatestCommonDivider.findGcd(x, y);
 * @author ivasilev
 */
@Test
public class GcdTest {

	GreatestCommonDivider testGcd = new GreatestCommonDivider();
	int testGcdOne = testGcd.findGcd(21, 180);
	int testGcdTwo = testGcd.findGcd(5, 10);
	int testGcdTree = testGcd.findGcd(37, 77);
	int testGcdFour = testGcd.findGcd(30, 77);
	Assert.assertEquals(3, testGcdOne);
	Assert.assertEquals(5, testGcdTwo);
	Assert.assertEquals(1, testGcdTree);
	Assert.assertNotEquals(4, testGcdFour);
}
