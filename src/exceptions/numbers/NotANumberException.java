package exceptions.numbers;

public class NotANumberException extends Exception
{
	public double x;
	public double y;
	
	public NotANumberException(String errorMessage, java.math.BigDecimal x, java.math.BigDecimal y)
	{
		super(errorMessage);
		this.x = x.doubleValue();
		this.y = y.doubleValue();
	}
	
	public NotANumberException(String errorMessage, java.math.BigInteger x, java.math.BigInteger y)
	{
		super(errorMessage);
		this.x = x.doubleValue();
		this.y = y.doubleValue();
	} 
	
	public NotANumberException(String errorMessage, double x, double y)
	{
		super(errorMessage);
		this.x = x;
		this.y = y;
	}
}