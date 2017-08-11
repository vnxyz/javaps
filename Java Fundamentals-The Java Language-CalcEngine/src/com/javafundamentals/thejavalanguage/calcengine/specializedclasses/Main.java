package com.javafundamentals.thejavalanguage.calcengine.specializedclasses;

import com.javafundamentals.thejavalanguage.calcengine.methodoverloading.MathEquation;

public class Main {

	public static void main(String[] args) {

		/*
		 * MathEquation[] equations = new MathEquation[4];
		 * 
		 * equations[0] = new MathEquation(100.0d, 50.0d, 'd'); equations[1] =
		 * new MathEquation(25.0d, 92.0d, 'a'); equations[2] = new
		 * MathEquation(225.0d, 17.0d, 's'); equations[3] = new
		 * MathEquation(11.0d, 3.0d, 'm');
		 * 
		 * for (MathEquation equation: equations) { equation.execute();
		 * System.out.println("result = "+equation.getResult()); }
		 */
		// 02.
		double leftDouble = 9.0d;
		double rightDouble = 4.0d;

		MathEquation equationOverload = new MathEquation('d');
		equationOverload.execute(leftDouble, rightDouble);
		System.out.println("Using overloads");
		System.out.println();
		System.out.println("result = " + equationOverload.getResult());

		int leftInt = 9;
		int rightInt = 4;
		// 03.
		// widening conversions
		equationOverload.execute(leftInt, rightInt);
		System.out.println();
		/*
		 * if execute(int, int) is not there we will get double value as result
		 * but not int
		 */
		System.out.println("result = " + equationOverload.getResult());
		// 05.
		/*
		 * system will choose double because it cannot convert double to int so
		 * instead it performs narrowing
		 */
		equationOverload.execute((double) leftInt, rightInt);
		System.out.println();
		System.out.println("result = " + equationOverload.getResult());

	}
}