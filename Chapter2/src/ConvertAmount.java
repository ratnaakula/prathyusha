import java.util.Scanner;
public class ConvertAmount 
{
public static void main(String[] args)
{

  Scanner input = new Scanner(System.in);
  // prompt the user to enter amount 
  System.out.print(" Enter the amount : " );
  double amount = input.nextDouble();
  int remainingAmount = (int) (amount * 100);
  // prompt the user to find one dollar
  int dollar  =  remainingAmount /100;
  
  remainingAmount =  remainingAmount % 100;
  //find the value of quarter
  int quarter =  remainingAmount / 25;
  remainingAmount = remainingAmount % 25;
  //find the value of dimes
  int dimes =  remainingAmount / 10;
  remainingAmount = remainingAmount % 10;
  // find the value of nickels
  int nickels = remainingAmount / 5;
  remainingAmount = remainingAmount %5;
  //find the value of cents
  int cents = remainingAmount;
  //Display output
  System.out.println(" Dollars: " +dollar + "\n Quarter: " + quarter + "\n Dimes: " + dimes + 
		  "\n Nickels: " + nickels + "\n Cents: " + cents);
  
}
}