package com.javafundamentals.thejavalanguage.calcengine.exceptions;

import com.javafundamentals.thejavalanguage.calcengine.specializedclasses.MathEquation;

public class Main {

	public static void main(String[] args) {
		// useMathEquation;
		// useCalculatorBase;
		String[] statements = { 
				"divide 100.0 50.0", 
				"add 25.0 92.0",
				"subtract 225.0 17.0", 
				"multiply 11.0 3.0" 
		};
		CalculateHelper helper = new CalculateHelper();
		for (String statement : statements) {
			helper.process(statement);
			// will get meaningful output because we overrided toString method
			// of CalculateHelper
			System.out.println(helper);
		}
	}

	static void useMathEquation() {
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

		System.out.println();

	}
	static void useCalculateBase(){
		System.out.println("Using Inheritance");
		System.out.println();
		
		CalculateBase[] calculators = {
				new Divider(100.0d, 50.0d),
				new Adder(25.0d,92.0d),
				new Subtractor(225.0d,17.0d),
				new Multiplier(11.0d, 3.0d)
		};
		
		for ( CalculateBase calculator: calculators){
			calculator.calculate();
			System.out.println("result = " + calculator.getResult());
		}
	}
}