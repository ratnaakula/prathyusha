import java.util.Scanner;

public class Program3_31// Financial currency exchange
{
public static void main(String[] args)
{
	Scanner input = new Scanner(System.in);
	// Prompt the user to enter the exchange rate of currency
	System.out.print(" Enter the exchange rate from dollars to RMB:");
	double rate = input.nextDouble();
	//prompt the user to enter  0 to convert from USD to  RMB
	//and 1 to convert from RMB to USD
	System.out.print(" Enter 0 to convert dollars to RMB and 1 viceversa:");
	int option = input.nextInt();
	//prompt the user to enter amount for converting into USD or RMB
	double amount;
	switch(option)
	{
	case 0 : System.out.print(" Enter the  dollar amount:");
	           amount = input.nextDouble();
	           System.out.println(" $ "+amount +" is " +(amount *rate)+" yuan ");
	           break;
	case 1 :System.out.print(" Enter the RMB amount:");
	         amount =input.nextDouble();
	         System.out.println(+amount +" yuan is $ " +((int)((amount *100)/ rate))/100.0);
	         break;
	         default: System.out.println(" Incorrect input");
	         
	}
}
}
