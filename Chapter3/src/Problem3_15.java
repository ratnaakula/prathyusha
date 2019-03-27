import java.util.Scanner;

public class Problem3_15 // Game lottery
{
	public static void main(String[] args)
	{
		Scanner input = new Scanner(System.in);
		// Generate a lottery digit number
		int lottery = (int) (Math.random() * 1000);

		// Prompt the user to enter a guess
		System.out.print(" Enter a  lottery pick (three digit number) : ");
		int guess = input.nextInt();
		// Get digits from lottery
		int lotteryDigit1 = lottery / 100;
		int lotteryDigit2 = (lottery % 100 ) / 10;
		int lotteryDigit3 = lottery % 10;
		// Get digits from guess
		int guessDigit1 = guess / 100;
		int guessDigit2 =( guess % 100) / 10;
		int guessDigit3 = guess % 10 ;
		System.out.println(" The lottery number is :" + lotteryDigit1 +lotteryDigit2 + lotteryDigit3);
		// check the guess
		if (guess == lottery)
		{
			System.out.println(" Exact match : You win 10,000$ ");
		} 
		else if ((guessDigit1 == lotteryDigit2 && guessDigit2 == lotteryDigit1 && guessDigit3 == lotteryDigit3)
				|| (guessDigit1 == lotteryDigit3 && guessDigit2 == lotteryDigit1 && guessDigit3 == lotteryDigit2)
				|| (guessDigit1 == lotteryDigit1 && guessDigit3 == lotteryDigit2 && guessDigit2 == lotteryDigit3)
				|| (guessDigit1 == lotteryDigit3 && guessDigit2 == lotteryDigit2 && guessDigit3 == lotteryDigit1)
				|| (guessDigit1 == lotteryDigit2 && guessDigit1 == lotteryDigit3 && guessDigit3 == lotteryDigit1))
		{
			System.out.println(" Match all digits : You won 3000$");
		} 
		else if (guessDigit1 == lotteryDigit1 || guessDigit1 == lotteryDigit2 || guessDigit1 == lotteryDigit3
				|| guessDigit2 == lotteryDigit1 || guessDigit2 == lotteryDigit2 || guessDigit2 == lotteryDigit3
				|| guessDigit3 == lotteryDigit1 || guessDigit3 == lotteryDigit2 || guessDigit3 == lotteryDigit3)
		{
			System.out.println(" Match one digit : You ein 1000$");
		} 
		else
			System.out.println(" Sorry , no match");
	}
}