package com.javafundamentals.thejavalanguage.calcengine;

public class MainBasic {

	public static void main(String[] args) {
		double val1 = 100.0d;
		double val2 = 50.0d;
		double result;
		char opCode = 'a';

		if (opCode == 'a') {
			result = val1 + val2;
		} else if (opCode == 's') {
			result = val1 - val2;
		} else if (opCode == 'd') {
/*			if (val2 != 0)
				result = val1 / val2;
			else
				result = 0.0d;*/
			result = val2 != 0 ? val1 / val2 : 0.0d;
		} else if (opCode == 'm') {
			result = val1 * val2;
		} else {
			System.out.println("Error in valid opCode");
			result = 0.0d;
		}
		System.out.println(result);

	}
}
