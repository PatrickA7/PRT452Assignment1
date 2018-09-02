package com.lineformula.prt452;

public class Gradient {
	public double findGradient(double x1, double y1, double x2, double y2) {
		if (y2 - y1 == 0) {
			return 0;
		} else if (x2 - x1 == 0){
			throw new ArithmeticException("Error: divided by zero");	
	} else {
		double result = (y2-y1)/(x2-x1);

		return result;
		}
	}
}

