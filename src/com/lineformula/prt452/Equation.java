package com.lineformula.prt452;

public class Equation {
	public String findEquation(double x1, double y1, double x2, double y2) {
		if (y2 - y1 == 0) {
			return "Equation: y = " + Double.toString(y1);
		} else if (x2 - x1 == 0){
			throw new ArithmeticException("Error: divided by zero when calculating slope");	
		} else {
		double gradient = (y2-y1)/(x2-x1);
		double mx = gradient*x1;
		if (mx == 0) {
			throw new ArithmeticException("Error: divided by zero during y-intercept calculation");
		}else {
			double yIntercept = y1/mx;
			return "Equation: y = " + Double.toString(gradient) + "x + " + Double.toString(yIntercept); 
			}
		}
	}
}
