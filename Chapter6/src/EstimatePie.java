/**  (Estimate p) p can be computed using the following series:
 *  m(i) = 4(1 - 1/3 + 1/5 1/7 + 1/9 1/11 + .... +(-1)i+1/2i - 1)
 *  Write a method that returns m(i) for a given i and write a test program that displays the following table:
**/
import java.util.Scanner;

public class EstimatePie {
	/** Main method */
	public static void main(String[] args) {
		// Display table heading
		System.out.println("\ni                  m(i)");
		System.out.println("----------------------------");
		// Display data
		for (double i = 1; i <= 901; i += 100) {
			System.out.printf("%-16.0f", i);
			System.out.printf("%-8.4f\n", estimatePie(i));
		}
	}

	public static double estimatePie(double n) {
		double pi = 0;// Set pi to 0
		for (double i = 1; i <= n; i++) {
			pi += Math.pow(-1, i + 1) / (2 * i - 1);
		}
		pi *= 4;
		return pi;
	}
}
