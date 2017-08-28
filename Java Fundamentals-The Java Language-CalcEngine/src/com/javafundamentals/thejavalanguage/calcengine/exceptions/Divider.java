package com.javafundamentals.thejavalanguage.calcengine.exceptions;

public class Divider extends CalculateBase{
	public Divider(){}
	public Divider(double leftVal, double rightVal) {
		//calling base class constructor
		super(leftVal, rightVal);
	}
	@Override
	public void calculate() {
		double value = getLeftVal() / getRightVal();
		setResult(value);
	}

}
