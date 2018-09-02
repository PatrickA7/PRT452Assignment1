package com.lineformula.prt452;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class DistanceTest {

	@Before
	public void setUp() throws Exception {
	}

	@Test
	public void testFindDistance() {
		Distance testDistance = new Distance();
		
		//test whole numbers
		double testResult = Math.sqrt(Math.pow(7-2, 2) + Math.pow(10-3, 2));
		assertEquals(testResult, testDistance.findDistance(2, 3, 7, 10), 0.5);
		
		//test negative numbers
		testResult = Math.sqrt(Math.pow(7-(-2), 2) + Math.pow(-10-3, 2));
		assertEquals(testResult, testDistance.findDistance(-2, 3, 7, -10), 0.5);
		
		//test decimals
		testResult = Math.sqrt(Math.pow(7.1326790-2.235678, 2) + Math.pow(1.0642131-3.6789056, 2));;
		assertEquals(testResult, testDistance.findDistance(2.235678, 3.6789056, 7.1326790, 1.0642131), 0.5);
		
		//test 0
		testResult = 0;
		assertEquals(testResult, testDistance.findDistance(0, 0, 0, 0), 0);
	}

}
