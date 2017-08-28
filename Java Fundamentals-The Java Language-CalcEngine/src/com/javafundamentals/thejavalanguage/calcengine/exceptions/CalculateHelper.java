package com.javafundamentals.thejavalanguage.calcengine.exceptions;

public class CalculateHelper {
	private static final char ADD_SYMBOL = '+';
	private static final char SUBTRACT_SYMBOL = '-';
	private static final char MULTIPLY_SYMBOL = '*';
	private static final char DIVIDE_SYMBOL = '/';

	MathCommand command;
	double leftValue;
	double rightValue;
	double result;

	public void process(String statement) throws InvalidStatementException {
		String[] parts = statement.split(" ");
		// 03. checks for no. of fields
		if (parts.length != 3)
			throw new InvalidStatementException("Incorrect number of fields",
					statement);
		String commandString = parts[0];
		// 04. catches Non-numeric data exception along with
		// NumberFormatException
		try {
			leftValue = Double.parseDouble(parts[1]);
			rightValue = Double.parseDouble(parts[2]);
		} catch (NumberFormatException e) {
			throw new InvalidStatementException("Non-numeric data", statement,
					e);
		}
		setCommandFromString(commandString);
		// 05. if command is invalid
		if (command == null)
			throw new InvalidStatementException("Invalid command", statement);
		else {
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

	}

	private void setCommandFromString(String commandString) {
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

		char symbol = ' ';
		switch (command) {
		case Add:
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
