package com.lineformula.prt452;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class EquationTest {

	@Before
	public void setUp() throws Exception {
	}

	@Test
	public void testFindEquation() {
		Equation testEquation = new Equation();
		
		//test whole numbers
		String testResult = "Equation: y = 2x + 1";
		assertEquals(testResult, testEquation.findEquation(3, 7, 5, 11));
		
		//test negative numbers
		testResult = "Equation: y = -3x + 2";
		assertEquals(testResult, testEquation.findEquation(3, -7, 6, 8));
		
		//test 0
		testResult = "Equation: y = 0";
		assertEquals(testResult, testEquation.findEquation(0, 0, 0, 0));
		
	}

}
