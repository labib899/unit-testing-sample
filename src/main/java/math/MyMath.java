package math;

public class MyMath 
{
	public int factorial(int n) 
	{
		int fact = 1;
		if (n < 0 || n > 12)
			throw new IllegalArgumentException("number should be 0 or above and 12 or below");
		else 
		{
			for (int i = 1; i <= n; i++) fact = fact * i;
		}
		return fact;
	}

	public boolean isPrime(int n) 
	{
		boolean isPrimeNumber = true;
		if (n < 2)
			throw new IllegalArgumentException("No prime numbers below 2");
		else 
		{
			for (int i = 2; i <= n / 2; ++i) 
			{  // Checking to n/2 for complexity
				if (n % i == 0) 
				{
					isPrimeNumber = false;
					break;
				}
			}
		}
		return isPrimeNumber;
	}
}