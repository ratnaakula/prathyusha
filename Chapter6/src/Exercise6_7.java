/** (Financial application: compute the future investment value) Write a method that computes future investment value at a 
 * given interest rate for a specified number of years. The future investment is determined using the formula in 
 * Programming Exercise 2.21. Use the following method header:
 * public static double futureInvestmentValue( double investmentAmount, double monthlyInterestRate, int years)
 * For example, futureInvestmentValue(10000, 0.05/12, 5) returns 12833.59. Write a test program that prompts the user 
 *to enter the investment amount (e.g., 1000) and the interest rate (e.g., 9%) and prints a table that displays future value
 *for the years from 1 to 30, as shown below: */
 

import java.util.Scanner;

public class Exercise6_7 {
	/** Main method */
	public static void main(String[] args) {
		final int NUMBER_OF_YEARS = 30;
		Scanner input = new Scanner(System.in);
		// Prompt the user to enter the investment amount
		System.out.print("Enter the investment amount (e.g., 1000) : ");
		double investmentAmount = input.nextDouble();
		System.out.print("Annuual interestRate : ");
		double annualInterestRate = input.nextDouble();
		input.close();
		// Get monthly interest rate
		double monthlyInterestRate = annualInterestRate / 1200;
		// Print a table that displays future value for the years from 1 to 30
		System.out.println("Years      FutureValue");// Table header
		for (int years = 1; years < NUMBER_OF_YEARS; years++) {
			System.out.printf("%d \t ", years);
			System.out.printf("%10.2f \n", futureInvestmentValue(investmentAmount, monthlyInterestRate, years));
		}
	}

	/** futureInvestmentValue method computes futureInvestmentValue */
	public static double futureInvestmentValue(double investmentAmount, double monthlyInterestRate, int years) {
		return investmentAmount * Math.pow(1 + monthlyInterestRate, years * 12);
	}

}
