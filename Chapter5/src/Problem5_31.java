/**Write a program that prompts the user to enter an amount (e.g., 100), the annual interest rate (e.g., 5), 
 * and the number of months (e.g., 6) and displays the amount in the savings account after the given month. 
 *
 *
 */
import java.util.Scanner;
public class Problem5_31 {
	public static void main(String[] args) {
		//Create a scanner
		Scanner input = new Scanner(System.in);
		//Prompt the user to enter an amount, annual percentage yield, numberof months
		System.out.print("Enter the amount: ");
		double amount = input.nextDouble();
		System.out.print("Enter the percentage yield: ");
		double annualPercentageYield = input.nextDouble();
		System.out.print("Enter maturity period (number of months): ");
		int months = input.nextInt();
		
		
		//Display a header
		System.out.println("Month   CD Value ");
		//Compute and display CD worth for the number of months
		for(int m = 1 ; m <= months ; m++) {
			amount  += amount * annualPercentageYield / 1200 ;
			
		System.out.printf("%-2d \t %.2f\n", m, amount);
	}
	}	

}
