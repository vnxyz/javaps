package com.javafundamentals.thejavalanguage.calcengine.separatepackages;

/**
 * The Class CalculateBase. This is the base class that will act as a common
 * point of inheritance
 */
public abstract class CalculateBase {
	// members commonly used
	private double leftVal;
	private double rightVal;
	private double result;

	// getters and setters
	public double getLeftVal() {
		return leftVal;
	}

	public void setLeftVal(double leftVal) {
		this.leftVal = leftVal;
	}

	public double getRightVal() {
		return rightVal;
	}

	public void setRightVal(double rightVal) {
		this.rightVal = rightVal;
	}

	public double getResult() {
		return result;
	}

	public void setResult(double result) {
		this.result = result;
	}

	public CalculateBase() {

	}
	
	public CalculateBase(double leftVal, double rightVal){
		this.leftVal = leftVal;
		this.rightVal = rightVal;
	}
	
	public abstract void calculate();
}
