package com.javafundamentals.thejavalanguage.calcengine.finalenum;

public class CalculateHelper {
	private static final char ADD_SYMBOL = '+';
	private static final char SUBTRACT_SYMBOL = '-';
	private static final char MULTIPLY_SYMBOL = '*';
	private static final char DIVIDE_SYMBOL = '/';

	MathCommand command;
	double leftValue;
	double rightValue;
	double result;

	public void process(String statement) {
		// statement e.g.: add 1.0 2.0
		// splitting statement based on space
		String[] parts = statement.split(" ");

		String commandString = parts[0];// add
		leftValue = Double.parseDouble(parts[1]);// 1.0
		rightValue = Double.parseDouble(parts[2]);// 2.0

		setCommandFromString(commandString);

		// can reference to classes derived from CalculateBase
		CalculateBase calculator = null;

		switch (command) {
		case Add:
			calculator = new Adder(leftValue, rightValue);
			break;
		case Subtract:
			calculator = new Subtractor(leftValue, rightValue);
			break;
		case Multiply:
			calculator = new Multiplier(leftValue, rightValue);
			break;
		case Divide:
			calculator = new Divider(leftValue, rightValue);
			break;

		}

		calculator.calculate();
		result = calculator.getResult();

	}

	private void setCommandFromString(String commandString) {
		// add --> MathCommand.Add
		// MathCommand.Add.toString() --> converts Add to String
		if (commandString.equalsIgnoreCase(MathCommand.Add.toString()))
			command = MathCommand.Add;
		else if (commandString
				.equalsIgnoreCase(MathCommand.Subtract.toString()))
			command = MathCommand.Subtract;
		else if (commandString
				.equalsIgnoreCase(MathCommand.Multiply.toString()))
			command = MathCommand.Multiply;
		else if (commandString.equalsIgnoreCase(MathCommand.Divide.toString()))
			command = MathCommand.Divide;
	}

	@Override
	public String toString() {
		// 1.0 + 2.0 = 3.0

		char symbol = ' ';
		switch (command) {
		case Add:
			// it will be great if this is a constant
			// symbol = '+';
			symbol = ADD_SYMBOL;
			break;
		case Subtract:
			symbol = SUBTRACT_SYMBOL;
			break;
		case Multiply:
			symbol = MULTIPLY_SYMBOL;
			break;
		case Divide:
			symbol = DIVIDE_SYMBOL;
			break;
		}
		/*
		 * we know two values, result and what symbol to use. Most efficient to
		 * build output string is to use StringBuilder. We discussed before for
		 * better performance we can declare length so let us assume it is 20
		 */
		StringBuilder sb = new StringBuilder(20);
		sb.append(leftValue);
		sb.append(' ');
		sb.append(symbol);
		sb.append(' ');
		sb.append(rightValue);
		sb.append(" = ");
		sb.append(result);

		return sb.toString();
	}
}
