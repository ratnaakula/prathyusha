/** (Math: approximate the square root) There are several techniques for implementing the sqrt 
 * method such technique is known as the Babylonian method. It approximates the square root of a 
 * number, n, by repeatedly performing a calculation using the following formula:
nextGuess = (lastGuess + n / lastGuess) / 2 */
import java.util.Scanner;

public class Exercise6_22 {
	/** Main method */
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		// Prompt the user to enter an integer
		System.out.print("Enter an integer: ");
		long number = input.nextLong();

		// Display the square root
		System.out.println("The approximated square root of " + number + " is: " + sqrt(number));
	}

	/** method sqrt approximates the square root of n */
	public static double sqrt(long n) {
		long lastGuess = 1;// initialize guess to positive value
		long nextGuess = (lastGuess + n / lastGuess) / 2;
		// If the difference between nextGuess and lastGuess is < 0.0001,
		// return nextGuess as the approximate square root of n
		while (nextGuess - lastGuess > 0.0001) {
			lastGuess = nextGuess;
			nextGuess = (lastGuess + n / lastGuess) / 2;
		}
		lastGuess = nextGuess;
		return nextGuess = (lastGuess + n / lastGuess) / 2;
	}
}
