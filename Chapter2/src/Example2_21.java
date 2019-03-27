import java.util.Scanner;

public class Example2_21 // calculate future investment value
{
	public static void main(String[] args)
	{
		//Create a scanner object
		Scanner input = new Scanner(System.in);
		//prompt the user to enter investment amount
		System.out.print(" Enter investment amount : " );
		double investmentAmount = input.nextDouble();
		//Prompt the user to enter annual interest rate
		System.out.print(" Enter annual interest rate in percentage : " );
		double annualInterestRate = input.nextDouble()/100;
		//Prompt the user to enter num.of years
		System.out.print(" Enter number of years : ");
		int numOfYears = input.nextInt();
		//compute future investment value
		double futureInvestmentValue =investmentAmount * Math.pow((1+ (annualInterestRate/12)),(numOfYears*12));
		System.out.println(" Combine/Accumulated value is  $ " +futureInvestmentValue);
		
		
	}

}
