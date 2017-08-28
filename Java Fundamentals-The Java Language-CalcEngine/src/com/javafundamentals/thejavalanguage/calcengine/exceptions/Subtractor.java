package com.javafundamentals.thejavalanguage.calcengine.exceptions;

public class Subtractor extends CalculateBase{
	public Subtractor(){}
	public Subtractor(double leftVal, double rightVal) {
		//calling base class constructor
		super(leftVal, rightVal);
	}
	@Override
	public void calculate() {
		double value = getLeftVal() - getRightVal();
		setResult(value);
	}

}
