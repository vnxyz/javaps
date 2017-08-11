package com.javafundamentals.thejavalanguage.calcengine.specializedclasses;

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
