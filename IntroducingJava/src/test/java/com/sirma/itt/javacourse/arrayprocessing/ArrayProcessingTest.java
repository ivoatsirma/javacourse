package com.sirma.itt.javacourse.arrayprocessing;

import static org.junit.Assert.*;

import org.junit.Assert;
import org.junit.Test;

import com.sirma.itt.javacourse.gcd.GreatestCommonDivider;

/**
 * 
 * @author ivasilev
 */
public class ArrayProcessingTest {

	@Test
	public void test() {
		
		int[] myArray ={9,6,3};
		Arrays testArrays = new Arrays();
		int testArraysOne = testArrays.getMinElement(myArray);
		int testArraysTwo = testArrays.sum(myArray);
		//int testArraysThree = testArrays.print(myArray);
		Assert.assertEquals(3, testArraysOne);
		Assert.assertEquals(5, testArraysTwo);
		Assert.assertEquals(4, testArrays.print(myArray)); //to be fixed
		//fail("Not yet implemented");
	}

}
