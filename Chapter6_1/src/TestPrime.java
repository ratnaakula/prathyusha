import java.util.Scanner;

public class TestPrime
{
	public static void main(String[] args)
	{
		getPrimeNumber(10000);
	}

	public static void getPrimeNumber(int number)
	{
		int count = 0;
		System.out.print(2 + ", ");
		System.out.print(3 + ", ");
		for(int i = 4 ; i <= number; i++) {
			if(isPrime(i))
			{
				//System.out.print(i + ", ");
				count++;
				if(count % 10 == 0)
				{
					System.out.println(i);
				}
				else
					System.out.print(i+",");
			}
		}
		
	}

	public static boolean isPrime(int number)
	{
		for (int divisor = 2; divisor <= number / 2; divisor++)
		{
			if (number % divisor == 0)
				return false;
		}
		return true;
	}
}
