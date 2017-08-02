package com.javafundamentals.thejavalanguage.calcengine.introduction;

public class MainArrayLoopSwitch {

	public static void main(String[] args) {
		/*
		 * double val1 = 100.0d; double val2 = 50.0d; double result; char opCode
		 * = 'a';
		 */
		// instead of val1
		double[] leftVals = { 100.0d, 25.0d, 225.0d, 11.0d };
		// instead of val2
		double[] rightVals = { 50.0d, 92.0d, 17.0d, 3.0d };
		// instead of opcode
		char[] opCodes = { 'd', 'a', 's', 'm' };
		// instead of result
		// i want it to be blank and be same size as opCodes so
		double[] results = new double[opCodes.length];
		// the above 4 arrays are parallel arrays

		for (int i = 0; i < opCodes.length; i++) {
			/*
			 * if (opCodes[i] == 'a') { results[i] = leftVals[i] + rightVals[i];
			 * } else if (opCodes[i] == 's') { results[i] = leftVals[i] -
			 * rightVals[i]; } else if (opCodes[i] == 'd') {
			 * 
			 * if (val2 != 0) result = val1 / val2; else result = 0.0d;
			 * 
			 * results[i] = rightVals[i] != 0 ? leftVals[i] / rightVals[i] :
			 * 0.0d; } else if (opCodes[i] == 'm') { results[i] = leftVals[i] *
			 * rightVals[i]; } else {
			 * System.out.println("Error in valid opCode"); results[i] = 0.0d; }
			 */
			// switch
			switch (opCodes[i]) {
				case 'a':
					results[i] = leftVals[i] + rightVals[i];
					break;
				case 's':
					results[i] = leftVals[i] - rightVals[i];
					break;	
				case 'd':
					/*
					 * if (val2 != 0) result = val1 / val2; else result = 0.0d;
					 */
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
		}
		for (double theResult : results) {
			System.out.println(theResult);
		}
	}
}