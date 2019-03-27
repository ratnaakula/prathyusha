/**  (Sort three numbers) Write a method with the following header to display three numbers in increasing order:
public static void displaySortedNumbers( double num1, double num2, double num3)
Write a test program that prompts the user to enter three numbers and invokes the method to display them in increasing order. */
import java.util.*;

public class Exercise6_5 {
	/** Main method */
	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);

		// Prompt the user to enter three numbers
		System.out.print("Enter three numbers: ");
		double num1 = input.nextDouble();
		double num2 = input.nextDouble();
		double num3 = input.nextDouble();
		input.close();
		// Display numbers in increasing order
		displaySortedNumbers(num1, num2, num3);
	}

	/* displaySortedNumbers Method displays three numbers in increasing order */
	public static void displaySortedNumbers(double num1, double num2, double num3) {

		double temp;
		if (num2 < num1 || num3 < num1) {
			if (num2 < num1) {
				temp = num1;
				num1 = num2;
				num2 = temp;
			}
			if (num3 < num1) {
				temp = num1;
				num1 = num3;
				num3 = temp;
			}
		}
		if (num3 < num2) {
			temp = num2;
			num2 = num3;
			num3 = temp;
		}

		System.out.println("The number in increasing order are " + num1 + " " + num2 + " " + num3);
	}
}

