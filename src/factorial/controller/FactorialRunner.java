package factorial.controller;

public class FactorialRunner
{

	/**
	 * @param args
	 */
	public static void main(String[] args)
	{
		FactorialRunner myFactorialRunner = new FactorialRunner();
		myFactorialRunner.start();
	}
	
	private double factorial(double currentNumber)
	{
		double fValue = 0;
		if(currentNumber >= 0)
		{
			if(currentNumber <= 1)
			{	
				return 1;
			}
		
			else
			{
				return factorial(currentNumber - 1.0) * currentNumber;
			}
		}
		return fValue;
	}
	
	public void start()
	{
		for ( double count = 0; count <= 171; count++)
		{
			System.out.println(factorial(count));
		}
	}
}
