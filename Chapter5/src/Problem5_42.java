/**  (Financial application: find the sales amount) Rewrite Programming Exercise 5.39 as follows:
 ■ Use a for loop instead of a do-while loop.
 ■ Let the user enter COMMISSION_SOUGHT instead of fixing it as a constant. **/
import java.util.Scanner;
public class Problem5_42 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		double salesAmount, commission = 0.0, balance;
		//Prompt the user to enter commission sought
		System.out.print("Enter the commission sought amount: ");
		double commissionSought = input.nextDouble();
		//find the sales amount
		for(salesAmount = 0.01; commission < commissionSought; salesAmount += 0.01) {
			balance = commission = 0.0; //set balance and commission to 0
			//If sales amount is $10,000.01 and above commission rate is 12%
			if(salesAmount >= 10000.01)
				commission += (balance = salesAmount - 10000) * 0.12;
			//if sales amount is $5,000.01 - $10,000 commission rate is 10%
			if(salesAmount >= 5000.01)
				commission += (balance -= balance - 5000) * 0.10; 
			//If sales amount is $0.01 - $5,000 commission rate is 8%
			if(salesAmount >= 0.01)
				commission += balance * 0.08;
		}
		//Display results
		System.out.printf("Minimun sales to earn $%.f $%.f\n", commissionSought, salesAmount);
		
	}

}
