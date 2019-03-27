/**  (Mersenne prime) A prime number is called a Mersenne prime if it can be written in the 
 * form 2p - 1 for some positive integer p. Write a program that finds all Mersenne primes with 
 * p … 31 and displays the output as follows:
*/


 class Exercise6_28 {
	 /** Main method */
	 public static void main(String[] args) {
		 //Display table header
		 System.out.println("p                  2^p-1");
		 System.out.println("--------------------------");
		 
		 //Display all mersenne primes with p<=31 
		 for(int p = 2; p <= 31; p++) {
			 if(PrimeNumberMethod.isPrime(p)) {
				 System.out.printf("%-12d", p);
				 System.out.println(mersennePrime(p));
			 }
		 }
	 }
public static class PrimeNumberMethod{
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
/** Method mersenne Prime finds answer returns the mersenne prime of num */
public static int mersennePrime(int num) {
	return(int)Math.pow(2,  num) - 1;
}
 }

