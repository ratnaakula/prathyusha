import java.util.Scanner;

public class SampleTest {
	public static void main(String[] args) {

	/**
		//sample program for tuition 
		double tuition = 10000;
	int year = 0;
	while(tuition < 20000) {
		tuition =  tuition * 1.07;
		year++;
	}
		System.out.println("Tuition will be doubled in " +year + "years");
		System.out.printf("Tuition will be $%.2f in %1d years", tuition, year);**/
		
		
		final int NUMBER_OF_PRIMES = 1000;
		final int NUMBER_OF_PRIMES_PER_LINE = 10;
		int count = 0;//Count the number of primes
		int number = 2;//A number to be tested for primeness
		System.out.println("The first 1000 prime numbers are: \n");
		//Repeatedly find prime numbers
		while(count < NUMBER_OF_PRIMES) {
			boolean isPrime = true;
			//Test whether the number is prime
			for(int divisor = 2; divisor <= number / 2; divisor++) {
				if(number % divisor == 0) {
				
					isPrime = false;
			break;
			
		}
		}
		if(isPrime) {
			count++;
			if(count % NUMBER_OF_PRIMES_PER_LINE == 0) {
				System.out.println(number);
			}
			else
				System.out.print(number + " ");
		}
		number++;
	}
	}
}

