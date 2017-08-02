package com.javafundamentals.thejavalanguage.calcengine.introduction;

public class MathEquation {
	//02.
	public double leftVal;
	public double rightVal;
	public char opCode;
	public double result;
	//04.
	public void execute() {
		switch (opCode) {
		case 'a':
			result = leftVal + rightVal;
			break;
		case 's':
			result = leftVal - rightVal;
			break;
		case 'd':
			result = rightVal != 0 ? leftVal / rightVal : 0.0d;
			break;
		case 'm':
			result = leftVal * rightVal;
			break;
		default:
			System.out.println("Error in valid opCode");
			result = 0.0d;
			break;
		}
	}
}
