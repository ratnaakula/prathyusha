import java.util.Scanner;
public class Problem3_26 //Use logical operands
{
	public static void main(String[] args)
	{
		Scanner input = new Scanner(System.in);
		//Prompt the user to enter an integer
		System.out.print("Enter an integer:");
		int number= input.nextInt();
		// Determine whether it is divisible by 5 and 6
		// Display results
		System.out.println(" Is " +number + " divisible by 5 and 6 ? " 
		+ (number % 5 == 0 && number % 6 == 0));
		System.out.println(" Is " +number+" divisible by 5 or 6 ? "
		+ (number % 5 == 0 || number % 6 == 0));
		System.out.println(" Is " +number+" divisible by 5 or 6 ,but not both? " 
		+ (number % 5 == 0 ^ number % 6 == 0));
		
	}

}
