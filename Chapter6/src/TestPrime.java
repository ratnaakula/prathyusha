
import java.util.Scanner;

public class TestPrime
{

	public static void main(String[] args)
	{
		getPrimeNumber(10000);
	}

	public static int getPrimeNumber(int number)
	{
		for(int i = 2 ; i <= 10000; i++) {
			System.out.print(i);
		}
		return number;
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
