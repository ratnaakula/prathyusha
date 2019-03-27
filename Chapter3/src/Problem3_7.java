import java.util.Scanner;

public class Problem3_7 // Finanacial application : Monetary units
{
public static void main(String[] args)
{
		Scanner input = new Scanner(System.in);
		// Receive the amount
		System.out.print(" Enter an amount in double,for example 11.56 : ");
		double amount = input.nextDouble();
		int remainingAmount = (int)(amount * 100);
		// Find the number of one dollars
		int numberOfDollars = remainingAmount / 100;
		remainingAmount = remainingAmount % 100;
		// Find the number of one quarter
		int numberOfQuarters = remainingAmount / 25;
		remainingAmount = remainingAmount % 25;
		// Find the number of dimes
		int numberOfDimes = remainingAmount / 10;
		remainingAmount = remainingAmount % 10;
		// Find the number of nickels
		int numberOfNickels = remainingAmount / 5;
		remainingAmount = remainingAmount % 5;
		// Find the number of pennies
		int numberOfPennies = remainingAmount;
		// Display results
		System.out.println(" Your amount " + amount + " consists of ");
		System.out.println("   " + numberOfDollars + (numberOfDollars == 1 ? " dollar " : " dollars "));
		System.out.println("   " + numberOfQuarters + (numberOfQuarters == 1 ? " quarter" : " quarters "));
		System.out.println("   " + numberOfDimes + (numberOfDimes == 1 ? " Dime " : " dimes "));
		System.out.println("   " + numberOfNickels + (numberOfNickels == 1 ? " nickel " : " nickels "));
		System.out.println("   " + numberOfPennies + (numberOfPennies == 1 ? " penny " : " pennies "));

	}
}
