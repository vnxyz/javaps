package com.javafundamentals.thejavalanguage.calcengine.specializedclasses;

import com.javafundamentals.thejavalanguage.calcengine.specializedclasses.MathEquation;

public class Main {

	public static void main(String[] args) {
		double leftDouble = 9.0d;
		double rightDouble = 4.0d;

		MathEquation equationOverload = new MathEquation('d');
		equationOverload.execute(leftDouble, rightDouble);
		System.out.println("Using overloads");
		System.out.println();
		System.out.println("result = " + equationOverload.getResult());

		int leftInt = 9;
		int rightInt = 4;
		equationOverload.execute(leftInt, rightInt);
		System.out.println();

		System.out.println("result = " + equationOverload.getResult());

		equationOverload.execute((double) leftInt, rightInt);
		System.out.println();
		System.out.println("result = " + equationOverload.getResult());

	}
}