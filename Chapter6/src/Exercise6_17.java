/**  (Display matrix of 0s and 1s) Write a method that displays an n-by-n matrix using the 
 * following header:
public static void printMatrix(int n)
Each element is 0 or 1, which is generated randomly. Write a test program that prompts the user to 
enter n and displays an n-by-n matrix. Here is a sample run*/
import java.util.Scanner;

public class Exercise6_17 {
	/** Main method */
	public static void main(String[] args) {
		// Create a Scanner object

		Scanner input = new Scanner(System.in);
		// Prompt the user to enter n
		System.out.print("Enter n:");
		int n = input.nextInt();
		printMatrix(n);
	}

	public static void printMatrix(int n) {
		for (int rows = 0; rows < n; rows++) {
			for (int columns = 0; columns < n; columns++) {
				System.out.print((int)(Math.random() * 2));
			}
			// Print newline
			System.out.println();
		}
	}
}


