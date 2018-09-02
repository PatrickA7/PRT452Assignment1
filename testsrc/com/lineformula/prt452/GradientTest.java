package com.lineformula.prt452;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class GradientTest {

	@Before
	public void setUp() throws Exception {
	}

	@Test
	public void testFindGradient() {
		Gradient testGradient = new Gradient();
		
		//test whole numbers
		double testResult = (10-3)/(7-2);
		assertEquals(testResult, testGradient.findGradient(2, 3, 7, 10), 0.5);
		
		//test negative numbers
		testResult = (-10-3)/(7-(-2));
		assertEquals(testResult, testGradient.findGradient(-2, 3, 7, -10), 0.5);
		
		//test decimals
		testResult = (1.0642131-3.6789056)/(7.1326790-2.235678);
		assertEquals(testResult, testGradient.findGradient(2.235678, 3.6789056, 7.1326790, 1.0642131), 0.5);
		
		//test 0
		testResult = 0;
		assertEquals(testResult, testGradient.findGradient(0, 0, 0, 0), 0);
				
	}
	//testing divide by zero
	@Test(expected = ArithmeticException.class)
	public void exceptionFailTest(){
		Gradient testGradient = new Gradient();
	    testGradient.findGradient(2, 3, 2, 4);
	}
}
