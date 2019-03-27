import java.util.Scanner;
public class ComputeLoan 
{
 public static void main(String[] args)
 {
	 // Create a  Scanner
	 Scanner input = new Scanner(System.in);
	 //Enter annual interest rate in percentage for e.g.,7.25%
	 System.out.print( "Enter annual interest rate,e.g.,7.25%:  ");
	 double annualInterestRate =  input. nextDouble();
	 //Obtain Monthly interest rate
	 double monthlyInterestRate = annualInterestRate/1200;
	 //Enter number of years
	 System.out.print("Enter number of years as an integer ,for e.g., 5:");
	 int numberOfYears = input.nextInt();
	 //Enter loan amount
	 System.out.print("Enter loan amount, for e.g., 120000.95: ");
	 double loanAmount = input.nextDouble();
	 //Calculate payment
	 double monthlyPayment = loanAmount* monthlyInterestRate/(1-1/Math.pow(1+monthlyInterestRate, numberOfYears*12));
	 double totalPayment = monthlyPayment * numberOfYears*12;
	 //Display results
	 System.out.println("The monthlyPayment is $"  + (int)(monthlyPayment*100)/100.0);
	 System.out.println("The totalPayment is $ " + (int)(totalPayment*100)/100.0);
	 System.out.println(" The monthlyInterestRate is " +(double)annualInterestRate/1200);
	 		
	 
 }

}
