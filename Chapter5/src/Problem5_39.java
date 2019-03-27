/*(Financial application: find the sales amount) You have just started a sales job in a department store. 
 * Your pay consists of a base salary and a commission. The base salary is $5,000. 
 *  Write a program that finds the minimum sales you have to generate in order to make $30,000. 
 */
import java.util.Scanner;
public class Problem5_39 {
	public static void main(String[] args) {
		final double COMMISSION_SOUGHT = 30000;
		double salesAmount, commission, balance;
		salesAmount = 0;
		do {
			balance = commission = 0;// set balance and commission to 0
			salesAmount += 0.01;// Increase sales amount by $0.01
			//If sales amount is $10,000.01 and above commission rate is 12%
			if(salesAmount > 10000)
				commission += (balance = salesAmount - 10000) * 0.12;
			if(salesAmount > 5000)
				commission += (balance-= balance - 5000) * 0.10;
			if(salesAmount > 0)
				commission += balance * 0.08;
		}while(commission < COMMISSION_SOUGHT);
			System.out.printf("Minimum sales to earn $30,000: $%.0f\n ", salesAmount);
		}
	}


