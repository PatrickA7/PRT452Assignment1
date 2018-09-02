package com.lineformula.prt452;

public class LineDetails {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Gradient testGradient = new Gradient();
		double gradientResult = testGradient.findGradient(2, 2, 5, 10);
		System.out.println("Slope of this line is " + gradientResult);
		
		Distance testDistance = new Distance();
		double distResult = testDistance.findDistance(2, 2, 5, 10);
		System.out.println("Distance between coordinates is " + distResult);
		
		Equation testEquation = new Equation();
		String equResult = testEquation.findEquation(3, 7, 5, 11);
		System.out.println(equResult);
	}

}
