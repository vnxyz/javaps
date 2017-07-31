package com.javafundamentals.thejavalanguage.calcengine;

public class MainClassesAndMethods {

	public static void main(String[] args) {
		
		/*
		 * 01.here we are assuming that first value of leftVals, rightVals, opCodes and results is a set 
		 * this is not how it is supposed to be done
		 * we need to use classes so we are creating Math equation class
		 * 
		 * */
		/*double[] leftVals = { 100.0d, 25.0d, 225.0d, 11.0d };
		double[] rightVals = { 50.0d, 92.0d, 17.0d, 3.0d };
		char[] opCodes = { 'd', 'a', 's', 'm' };
		double[] results = new double[opCodes.length];*/
		MathEquation[] equations = new MathEquation[4];
		equations[0] = create(100.0d, 50.0d, 'd');
		equations[1] = create(25.0d, 92.0d, 'a');
		equations[2] = create(225.0d, 17.0d, 's');
		equations[3] = create(11.0d, 3.0d, 'm');
/*		for (int i = 0; i < opCodes.length; i++) {
			//03.moving it to MathEquation class
			switch (opCodes[i]) {
				case 'a':
					results[i] = leftVals[i] + rightVals[i];
					break;
				case 's':
					results[i] = leftVals[i] - rightVals[i];
					break;	
				case 'd':
					
					 * if (val2 != 0) result = val1 / val2; else result = 0.0d;
					 
					results[i] = rightVals[i] != 0 ? leftVals[i] / rightVals[i]
							: 0.0d;
					break;	
				case 'm':
					results[i] = leftVals[i] * rightVals[i];
					break;	
				default:
					System.out.println("Error in valid opCode");
					results[i] = 0.0d;
					//not required, but good coding practise
					break;
			}
		}*/
		for (MathEquation equation: equations) {
			equation.execute();
			System.out.println("result = "+equation.result);
		}
		
	}
	public static MathEquation create(double leftVal, double rightVal, char opCode){
		MathEquation equation = new MathEquation();
		equation.leftVal = leftVal;
		equation.rightVal = rightVal;
		equation.opCode = opCode;
		return equation;
	}
}