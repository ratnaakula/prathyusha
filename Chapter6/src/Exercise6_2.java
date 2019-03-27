/**  (Sum the digits in an integer) Write a method that computes the sum of the digits in an integer. Use the following method header:
public static int sumDigits(long n) For example, sumDigits(234) returns 9(2 + 3 + 4). (Hint: Use the % operator to extract digits, 
and the / operator to remove the extracted digit. For instance, to extract 4 from 234, use 234 % 10 (= 4).
 To remove 4 from 234, use 234 / 10 (= 23). Use a loop to repeatedly extract and remove the digit until all the digits are extracted. 
Write a test program that prompts the user to enter an integer and displays the sum of all its digits. */
import java.util.*;

public class Exercise6_2 {
	/** Main method */
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		// Prompt the user to enter an integer
		System.out.print("Enter an integer : ");
		long number = input.nextLong();
		// Display the sum of all its digits in the integer
		System.out.println("The sum of its digits in the integer" + number + " is " + sumDigits(number));

	}

	public static int sumDigits(long number) {
		int sum = 0;
		while (sum > 0) {
			sum += number % 10;
			number /= 10;

		}
		return sum;

	}

}
