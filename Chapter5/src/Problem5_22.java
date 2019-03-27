 /**(Financial application: loan amortization schedule) The monthly payment for a given loan pays the 
 principal and the interest. The monthly interest is computed by multiplying the monthly interest rate and the balance 
 (the remaining principal). The principal paid for the month is therefore the monthly payment 
 minus the monthly interest. Write a program that lets the user enter the loan amount, number of numberOfYears, and interestRate and displays
 the amortization schedule for the loan.**/
 import java.util.Scanner;
public class Problem5_22 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		//Prompt the user to enter the loan amount
		System.out.print("Loan Amount:");
		double loanAmount = input.nextDouble();
		//Prompt the user to enter number of years
		System.out.print("Number of Years:");
		int numberOfYears = input.nextInt();
		//Prompt the user to enter Annual Interest rate
		System.out.print("Annual Interest Rate:");
		double annualInterestRate = input.nextDouble();
		//Compute monthly interest rate 
		double monthlyInterestRate = annualInterestRate / 1200;
		//Compute monthly payment
		double monthlyPayment = loanAmount * monthlyInterestRate /
				(1 -1 / Math.pow(1 + monthlyInterestRate , numberOfYears * 12));
		//Display monthlyPayment
		System.out.printf("Monthly Payment: %.2f\n", monthlyPayment);
		//Calculate totalPayment
		double totalPayment = monthlyPayment * numberOfYears * 12;
		//Display total payment
		System.out.printf("Total Payment:%.2f\n", totalPayment);
		
		double balance = loanAmount;
		double principal;
		double interest;
		System.out.println("Payment# \t Interest \t Principal \t Balance");
		for(int i = 1; i <= numberOfYears * 12; i++) {
			
			interest = monthlyInterestRate * balance;
			principal = monthlyPayment - interest;
			balance = balance - principal;
			System.out.printf("%d \t\t %.2f \t\t %.2f \t %.2f \n", i,interest, principal, balance);
			
			
		}
		
		
	}
}
