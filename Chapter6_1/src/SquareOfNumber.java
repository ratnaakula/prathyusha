import java.util.Scanner;

public class SquareOfNumber
{

	public static void main(String[] args)
	{
		int number = getInput();
		loopThroughNumbers(number);
	}

	private static int getInput()
	{
		Scanner input = new Scanner(System.in);
		// Prompt the user to enter an integer to check squares of below 100
		System.out.print("Enter an integer :");
		int number = input.nextInt();
		return number;
	}

	private static void loopThroughNumbers(int number)
	{

		for (int i = 1; i <= number; i++)
		{
			int temp = i*i;
			System.out.print("The square of " + i + " number is " + (temp) + " and ");
			checkEvenOrOdd(temp);
		}
	}

	private static void checkEvenOrOdd(int i)
	{
		if (i % 2 == 0)
			System.out.println(i + " is even");
		else
			System.out.println(i + " is odd");
	}
}