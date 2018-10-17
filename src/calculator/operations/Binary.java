package calculator.operations;

import java.lang.ArithmeticException; // Divide by zero error
import exceptions.numbers.NotANumberException; // Exception to identify NaN specifically

public class Binary
{
	/**
	 * Add the second number to the first number.
	 * 
	 * If numbers are too large to reside within a double, throw an exception.
	 * @param first Number.
	 * @param second Number.
	 * @return The sum of the two numbers.
	 */
	public static <T extends Number> double Add(T first, T second) 
	{
		double sum = first.doubleValue() + second.doubleValue();
		return sum;
	}
	
	/**
	 * Subtract the second number from the first number.
	 * 
	 * If result is too small to reside within a double, throw an exception.
	 * @param first Number.
	 * @param second Number.
	 * @return The difference between the two numbers.
	 */
	public static <T extends Number> double Subtract(T first, T second)
	{
		double diff = first.doubleValue() - second.doubleValue();
		return diff;
	}
	
	/**
	 * Multiply the first number by the second number.
	 * 
	 * If the result is too large or small to reside within a double, throw 
	 * an exception.
	 * @param first Number.
	 * @param second Number.
	 * @return The product of the two numbers.
	 */
	public static <T extends Number> double Multiply(T first, T second)
	{
		double product = first.doubleValue() * second.doubleValue();
		return product;
	}
	
	/**
	 * Divide the first number by the second number.
	 * 
	 * If the result is too large or small to reside within a double, throw
	 * an exception.
	 * @param first Number.
	 * @param second Number.
	 * @return The quotient of the two numbers
	 * @throws NotANumberException If divide by zero is encountered, a NotANumberException
	 * (not ArithmeticException) will be thrown.
	 */
	public static <T extends Number> double Divide(T first, T second) throws NotANumberException
	{
		try
		{
			double quotient = first.doubleValue() / second.doubleValue();
			return quotient;
		}
		catch(ArithmeticException e)
		{
			throw new NotANumberException(e.getMessage(), first.doubleValue(), second.doubleValue());
		}
	}
	
	/**
	 * NOT IMPLEMENTED.
	 * @param first
	 * @param second
	 * @return
	 * @throws ArithmeticException
	 */
	public static <T extends Number> double Root(T first, T second) throws ArithmeticException
	{
		return Double.NaN;
	}
}