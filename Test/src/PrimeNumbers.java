import java.util.Scanner;
public class PrimeNumbers {
	public static void main(String[ ] args) {
		final int NUMBER_OF_PRIMES = 50;
		final int NUMBER_OF_PRIMES_PER_LINE = 10;
		int count= 0; 
		int number = 2;
		System.out.println(" The first 50 prime numbers are \n");
		//repeatedly find prime numbers
		while(count < NUMBER_OF_PRIMES) {
			//assume the number is prime
			boolean isPrime= true;//is the current number prime?
			//test whether number is prime
			for(int divisor =2 ; divisor <= number / 2 ; divisor++) {
			
			if(number % divisor == 0) {
				isPrime= false;
				break;
			}
			}
			// display the prime number and increase the count
			if(isPrime) {
				count++;
				if(count % NUMBER_OF_PRIMES_PER_LINE == 0) {
					//Display the number and advance to the newline
					System.out.println(number);
				}
					else
						System.out.print(number + " ");
				}
				//check if the next number is prime
				number++;
			}
		}
		
}


