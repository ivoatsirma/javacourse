package com.sirma.itt.javacourse.gcd;

import static org.junit.Assert.*;

import org.junit.Assert;
import org.junit.Test;

/**
 * 
 * @author ivasilev
 */
public class LcmFindTest {

	@Test
	public void test() {
	
			LowestCommonMultiplier testLcm = new LowestCommonMultiplier();
			int testLcmOne = testLcm.findLCM(21, 180);
			int testLcmTwo = testLcm.findLCM(5, 10);
			int testLcmThree = testLcm.findLCM(30, 77);
			Assert.assertEquals(3, testLcmOne);
			Assert.assertEquals(5, testLcmTwo);
			Assert.assertNotSame(4, testLcmThree);
			
			//fail("Not yet implemented");
		}
		
		//fail("Not yet implemented");
	}


