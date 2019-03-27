import java.util.Scanner;

public class Example2_13 // Financial application : compound value
{
 public static void main(String[] args)
 {
	 Scanner input = new Scanner(System.in);
	 final double Monthly_Interest_Rate =  0.00417;
	 //prompt to enter the value of amount
	 System.out.print(" Enter the monthly saving amount : ");
	 double amount =input.nextDouble();
	 
	 // compute first month account value
	 double firstMonth = amount * (1 + Monthly_Interest_Rate);
	 // compute second month account value
	 double secondMonth =(amount + firstMonth) * (1 + Monthly_Interest_Rate);
	 //compute third month account value
	 double thirdMonth = ( amount + secondMonth) * ( 1+ Monthly_Interest_Rate);
	 //compute fourth month account value
	 double fourthMonth = ( amount + thirdMonth) * ( 1 + Monthly_Interest_Rate);
	 //compute fifth month account value
	 double fifthMonth = ( amount + fourthMonth) * ( 1 + Monthly_Interest_Rate);
	 //compute sixth month account value
	 double total = ( amount + fifthMonth) * ( 1+ Monthly_Interest_Rate );
	 // Display output
	 System.out.println(" After the sixth month,the account value is  $"  +total );
 }
}
	 
 

