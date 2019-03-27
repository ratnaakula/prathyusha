/**  (Display an integer reversed) Write a method with the following header to display an integer in reverse order:
 public static void reverse(int number) For example, reverse(3456) displays 6543. Write a test program that prompts
  the user to enter an integer and displays its reversal. */
import java.util.*;

public class Exercise6_4 {
	/** Main method */
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		// Prompt the user to enter an integer
		System.out.print("Enter an integer : ");
		int number = input.nextInt();
		System.out.print("The reversal of an integer is " + reverse(number));

	}

	public static int reverse(int number) {
		int reverse = 0;
		int n;
		while (number > 0) {
			n = number % 10;
			reverse = reverse * 10 + n;
			number /= 10;

		}
		return reverse;
	}
}