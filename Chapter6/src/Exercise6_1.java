/**  (Math: pentagonal numbers) A pentagonal number is defined as n(3n–1)/2 for n = 1, 2,  . . ., and so on. Therefore, 
 * the first few numbers are 1, 5, 12, 22, . . . . Write a method with the following header that returns a pentagonal number:
public static int getPentagonalNumber(int n) Write a test program that uses this method to display the first 
100 pentagonal numbers with 10 numbers on each line. **/
import java.util.*;

public class Exercise6_1 {
	/** Main method */

	public static void main(String[] args) {
		final int NUMBER_OF_PENTAGONALS = 100;// Displays the first 100 pentagonals
		final int NUMBER_OF_PENTAGONALS_PER_LINE = 10;// Displays the numbers per line
		// Displays the first 100 pentagonal numbers
		for (int i = 1; i < NUMBER_OF_PENTAGONALS; i++) {
			// Print ten numbers per line
			if (i % NUMBER_OF_PENTAGONALS_PER_LINE == 0) {
				System.out.printf("%7d\n", getPentagonalNumber(i));
			} else {
				System.out.printf("%7d", getPentagonalNumber(i));
			}
		}
	}

	/** Return a pentagonal number */
	public static int getPentagonalNumber(int n) {
		return (n * (3 * n - 1)) / 2;
	}
}
