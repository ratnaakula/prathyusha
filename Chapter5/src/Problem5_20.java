import java.util.Scanner;

public class Problem5_20 { // Display prime numbers between 2 and 1000
	public static void main(String[] args) {
		final int NUMBER_OF_DIGITS_PER_LINE = 8;
		int count = 0;// Count the number of prime numbers

		System.out.println("The prime numbers between 2 and 1000 is");

		// Repeatedly find the prime numbers between 2 to 1000
		for (int number = 2; number <= 1000; number++) {
			boolean isPrime = true;
			for (int divisor = 2; divisor <= number / 2; divisor++) {
				if (number % divisor == 0) {// If true number is not prime
					isPrime = false; // Set isPrime to false
					break;// Exit the for loop
				}
			}
			// Display the prime numbers and increase the count
			if (isPrime) {
				count++;
				if (count % NUMBER_OF_DIGITS_PER_LINE == 0) {

					// Display the number and advance to the new line
					System.out.println(number);

				} else
					System.out.print(number + " ");
			}
		}
	}
}
