package PrimeCheck;

public class Prime {
	public static boolean isPrime(int num) 
	{
		boolean prime = true;
		
		for(int i = 2; i <= (num / 2); i++) 
		{
			//Returns false if not prime
			if(num % i == 0) 
			{
				prime = false;
				return prime;
			}
		}
		
		//Return true if prime
		return prime;
	}
}
