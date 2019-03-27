/**  (Financial application: compute commissions) Write a method that computes the commission, using the scheme in 
 * Programming Exercise 5.39. The header of the method is as follows:
 
public static double computeCommission(double salesAmount) Write a test program that displays the following table:
*/
import java.util.Scanner;

public class Exercise6_11 {
	/** Main method */
	public static void main(String[] args) {
		// Display table
		System.out.println("Sales Amount       Commission\n " + "---------------------------------------");
		// Display data
		for (double salesAmount = 10000; salesAmount <= 100000; salesAmount += 5000) {
			System.out.printf("%-13.0f", salesAmount);
			System.out.printf("%13.1f\n", computeCommission(salesAmount));
		}
	}

	/** Compute Commission(salesAmount) method computes to find commission */
	public static double computeCommission(double salesAmount) {

		double commission, balance;
		balance = commission = 0;// set balance and commission to 0
		// salesAmount += 0.01;// Increase sales amount by $0.01
		// If sales amount is $10,000.01 and above commission rate is 12%
		if (salesAmount >= 10000)
			commission += (balance = salesAmount - 10000) * 0.12;
		// If sales amount is $5,000.01 and above commission rate is 10%
		if (salesAmount >= 5000)
			commission += (balance -= balance - 5000) * 0.10;
		// If sales amount is $0 and above commission rate is 8%
		if (salesAmount >= 0)
			commission += balance * 0.08;
		return commission;
	}
}