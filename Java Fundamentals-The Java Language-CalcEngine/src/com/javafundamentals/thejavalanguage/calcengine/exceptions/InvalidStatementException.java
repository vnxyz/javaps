package com.javafundamentals.thejavalanguage.calcengine.exceptions;
//02. ..... later go to calculate helper
//all customised Exception classes extend Exception
public class InvalidStatementException extends Exception {
	/*
	 * remember we said that normally there are two constructors, one that
	 * accepts the information that we need, which we have here, and also one
	 * that let's us associate another exception with it.
	 */
	public InvalidStatementException(String reason, String statement) {
		super(reason + " : " + statement);
	}

	public InvalidStatementException(String reason, String statement,
			Throwable clause) {
		super(reason + " : " + statement, clause);
	}
}
