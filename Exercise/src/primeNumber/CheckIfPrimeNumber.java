package primeNumber;

public class CheckIfPrimeNumber {
	
	public static boolean isPrimeNumber(int number)
	{
		if (number % 2 == 0 || number % 3 == 0)
		{
			return false;
		}
		
		int squareRoot = (int) (Math.sqrt(number) + 1);
		for (int i=2; i < squareRoot; i++)
		{
			if (number % i == 0)
			{
				return false;
			}
		}
		
		return true;
	}

}
