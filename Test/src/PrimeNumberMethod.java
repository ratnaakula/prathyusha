import java.util.Scanner;
public class PrimeNumberMethod{
	/** Main method */
	public static void main(String[] args) {
		System.out.println("The first 50 prime numbers are \n");
		printPrimeNumbers(50);
	}
	//printPrimeNumbers method
	public static void printPrimeNumbers(int numberOfPrimes) {
		final int NUMBER_OF_PRIMES_PER_LINE = 10;//Display 10 per line
		int count = 0;//count the number of prime numbers
		int number = 2;//A number to be tested for primeness
		// repeatedly find prime numbers
		while(count < numberOfPrimes) {
			//Print the prime number and increase the count
			if(isPrime(number)) {
				count ++;
				if (count % NUMBER_OF_PRIMES_PER_LINE == 0) {
					//Print the numbers and advance to new line
					System.out.printf("%-5s\n", number);
				
				}
				else
					System.out.printf("%-5s", number);
				
			}
			//Check whether the next number is prime
			number++;
		}
		}
		public static boolean isPrime(int number) {
		
		for(int divisor = 2; divisor <= number / 2; divisor++) {
			if(number % divisor == 0) {//If true, number is not prime
				return false;
				
			}
		}
		 return true;
	}
}