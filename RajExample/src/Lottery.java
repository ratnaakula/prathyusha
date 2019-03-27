import java.util.Scanner;

public class Lottery

{
	public static void main(String[] args) 
	{
		// Generate a lottery number
		int lottery = (int) (Math.random() * 100);
		// Obtain a Scanner object
		Scanner input = new Scanner(System.in);
		// Prompt the user to enter a two digit number
		System.out.print(" Enter a two digit number : ");
		int guess = input.nextInt();
		// Get digits from lottery
		int lotteryDigit1 = lottery / 10;
		int lotteryDigit2 = lottery % 10;
		// get digits from guess
		int guessDigit1 = guess / 10;
		int guessDigit2 = guess % 10;
		System.out.println(" The lottery number is : " + lottery);
		// check the guess
		if (guess == lottery)
			System.out.println(" Exact match award is $10,000 ");
		else if (guessDigit1 == lotteryDigit1 && guessDigit2 == lotteryDigit2)
			System.out.println(" All the input matches award is $3,000");
		else if (guessDigit1 == lotteryDigit1

				|| guessDigit2 == lotteryDigit2

				|| guessDigit1 == lotteryDigit2

				|| guessDigit2 == lotteryDigit1)
			
			System.out.println("  Any One digit matches  award is $1000 ");
		else
			System.out.println(" Sorry doesn't match");
	}

}
