import java.util.Scanner;

public class Example6_31
{

	public static void main(String[] args)
	{

		Scanner input = getInput();

		// Prompt the user to enter a credit number as long integer
		System.out.print("Enter a credit number as a long integer: ");
		long number = input.nextInt();
		System.out.println(number + " is " + (isValid(number) ? "valid" : "invalid"));

	}

	private static Scanner getInput()
	{

		Scanner input = new Scanner(System.in);
		return input;
	}

	/** Return true if card number is valid */
	public static boolean isValid(long number)
	{
		return true;
	}
/** Get the result from Step 2 */
	public static long getSize(long n) {
	 return 0;
	}
}
