import java.util.Scanner;
public class Problem4_26 {
	public static void main(String[] args)
	{
		Scanner input = new Scanner(System.in);
		// Prompt the user to enter the amount
		System.out.print("Enter the amount : " );
		String amount = input.nextLine();
		// Extract number of dollars
		String numberOfOneDollars = amount.substring(0,  amount.indexOf('.'));
		//Extract cents
		int cents = Integer.parseInt(amount.substring( amount.indexOf('.') + 1));
		//Find the number of quarters
		int numberOfQuarters = cents / 25 ;
		cents %=  25 ;
		// Find the number of dimes
		int numberOfDimes = cents / 10 ; 
		cents %= 10;
		int numberOfNickels = cents / 5 ; 
		 cents %= 5 ;
		 //Display results
		 System.out.println(" Your amount " + amount + "consists of \n " 
				 + numberOfOneDollars + " dollars \n "
				
				 + numberOfQuarters + " quarters\n "
				 + numberOfDimes + " dimes\n "
				 + numberOfNickels + " nickels\n "
				 +  cents + " pennies\n ");
		
		
	}

}
