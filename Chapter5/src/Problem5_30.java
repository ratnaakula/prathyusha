/**Write a program that prompts the user to enter an amount (e.g., 100), the annual interest rate (e.g., 5), 
 * and the number of months (e.g., 6) and displays the amount in the savings account after the given month. **/

import java.util.Scanner;

public class Problem5_30 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		// Prompt the user to enter the amount, annual interest rate, number of months
		System.out.print("Enter the amount: ");
		double amount = input.nextDouble();
		System.out.print("Enter the annual interest rate: ");
		double annualInterestRate = input.nextDouble();
		System.out.print("Enter the number of months:");
		int months = input.nextInt();
		// Compute monthly interest rate
		double monthlyInterestRate = annualInterestRate / 1200;
		// Compute amount in the savings account after the given month
		double compoundValue = 0;// Accumulates compound value
		for (int m = 1; m <= months; m++) {
			compoundValue = (amount + compoundValue) * (1 + annualInterestRate);

		}
		// Display output
		System.out.printf(" Amount in savings account after " + months + " is : $%.2f\n", compoundValue);

	}
}
