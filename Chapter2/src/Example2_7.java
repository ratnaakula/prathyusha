import java.util.Scanner;
public class Example2_7 // Find the number of years
{
public static void main(String[] args)
{
	Scanner input = new Scanner(System.in);
	// prompt the user  to enter the minutes
	System.out.print(" Enter the number of minutes:");
	int minutes = input.nextInt();
	int days= 1, years= 0;
	// calculate no .of years
	// year has 365 days,24 hours and one hour is 60 min
	years = minutes /(365*24*60);
	int d = minutes - (years *365*24*60);
	//calculate days
	days = d/(24*60); 
	 System.out.println( +minutes + " minutes is approximately " +years +" years and " +days  +" days");
	
}
}
