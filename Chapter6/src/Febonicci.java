import java.util.Scanner;

public class Febonicci
{

	public static void main(String[] args)
	{

		int number = getInput();
		getFebonicci(number);
	}

	private static int getInput()
	{

		Scanner input = new Scanner(System.in);

		// Prompt the user to enter an integer to get febonicci numbers below 100
		System.out.print("Enter an integer to get febonicci numbers below 100: ");
		 int number = input.nextInt();
		 System.out.println(0);
		 System.out.println(1);
		return number;
	}

	public static void getFebonicci(long number)
	{

		long firstNumber = 0;
		long secondNumber = 1;
		for (long i = 0; i <= number; i++)
		{
			long temp = getNextFebonicci(firstNumber, secondNumber);
			firstNumber = secondNumber;
			secondNumber = temp;
		}
	}

	public static long getNextFebonicci(long firstNumber, long secondNumber)
	{
		
		long sum = firstNumber + secondNumber;
		
		System.out.println(sum);
		return sum;
	}
}
