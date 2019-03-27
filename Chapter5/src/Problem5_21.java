import java.util.Scanner;

public class Problem5_21 {// Financial application
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		//Prompt the user to enter the loan amount
		System.out.print("Loan Amount: " );
		double loanAmount = input.nextDouble();
		System.out.print("Number of Years: ");
		int years = input.nextInt();
		//Enter annual interest rate in percentage
		//System.out.print(" annual interest rate");
		//double annualInterestRate = input.nextDouble();
		//Obtain monthly interest rate

		System.out.println("Interest Rate  \t Monthly Payment \t Total Payment");
		for(double annualInterestRate = 5.000; annualInterestRate <= 8.000 ; annualInterestRate += (1d/8))
		{
			double monthlyInterestRate = annualInterestRate / 1200;
			double monthlyPayment = loanAmount * monthlyInterestRate /
					(1 -1 / Math.pow(1 + monthlyInterestRate , years * 12));
			double totalPayment = monthlyPayment * years * 12;
			System.out.printf("%.3f%% \t\t $%.2f \t\t $%.2f \n", annualInterestRate, monthlyPayment, totalPayment);
		}
	}
}