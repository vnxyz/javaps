package com.javafundamentals.thejavalanguage.calcengine.separatepackages;

import com.javafundamentals.thejavalanguage.calcengine.specializedclasses.MathEquation;

public class Main {

	public static void main(String[] args) {
		String[] statements = {
				//01.
				"add 1.0", 				//Error incorrect number of values
				"add xx 1.0",			//Error non-numeric data
				"addx 25.0 92.0",		//Error invalid command
				//to handle these errors, I created InvalidStatementException class
				"divide 100.0 50.0", 
				"add 25.0 92.0",
				"subtract 225.0 17.0", 
				"multiply 11.0 3.0" 
		};
		CalculateHelper helper = new CalculateHelper();
		// 06.
		for (String statement : statements) {
			try {
				helper.process(statement);
				System.out.println(helper);
			} catch (InvalidStatementException e) {
				//message is set when we call base class constructor
				System.out.println(e.getMessage());
				//checking for other exception
				if(e.getCause() != null)
					System.out.println("	Original Exception : " + e.getCause().getMessage());
					
			}
			
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