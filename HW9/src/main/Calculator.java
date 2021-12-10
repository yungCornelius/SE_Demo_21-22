package main;

public class Calculator {

	public int add(int valueOne, int valueTwo) {
		return valueOne + valueTwo;
	}
	
	public int sub(int valueOne, int valueTwo) {
		return valueOne - valueTwo;
	}
	
	public int multiply(int valueOne, int valueTwo) {
		return valueOne * valueTwo;
	}
	
	public float divide(int numerator, int denominator) {
		if (denominator == 0)
			throw new ArrayIndexOutOfBoundsException("ZeroDivisionError");

		return (float) numerator / denominator;
	}
}
