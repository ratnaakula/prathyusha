import java.util.Scanner;

public class Example2_20 // calculate  interest
{
	public static void main(String[] args)
	{
		  Scanner input = new Scanner(System.in);
		  //Prompt the user to enter balance and interest rate
		  System.out.print(" Enter balance and interest rate (e.g., 3 for 3 %): ");
		  double balance = input.nextDouble();
		  double interestRate = input.nextDouble();
		  //compute the interest by using formula
		  double interest = balance * (interestRate/1200);
		  //Display result
		  System.out.println(" The interest is" +interest);
	}

}
