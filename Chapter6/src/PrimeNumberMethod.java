/** (Use the isPrime Method) Listing 6.7, PrimeNumberMethod.java, provides the isPrime(int number) method for testing whether a 
 * number is prime. Use this method to find the number of prime numbers less than 10000.
 */
import java.util.Scanner;

public class PrimeNumberMethod {
	/** Main method */
	public static void main(String[] args) {
		int primeCount = 0; // Counts the number of prime numbers
		int number = 2;//
		// Find the number of prime numbers less than 10000
		for (int i = 2; i < 1000; i++) {
			if (isPrime(i)) {
				primeCount++; // Increment
				System.out.print(i + " ");
				if (primeCount % 10 == 0)
					System.out.println(" ");
			}
		}
		// Display result
		System.out.println("\nThe number of prime numbers less than 1000 : " + primeCount);
	}

	/** Check whether number is prime */
	public static boolean isPrime(int number) {
		for (int divisor = 2; divisor <= number / 2; divisor++) {
			if (number % divisor == 0) {
				return false;
			}
		}
		return true;
	}

}