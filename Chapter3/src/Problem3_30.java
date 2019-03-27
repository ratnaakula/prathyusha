import java.util.Scanner;
public class Problem3_30 // Current time
{
	public static void main(String[] args)
	{
	Scanner input = new Scanner(System.in);
	// prompt the user to enter the time zone offset to GMT
	System.out.print(" Enter the time zone offset to GMT : ");
	int offset = input.nextInt();
	//Obtain total milliseconds since midnight, may31, 2017
	long TotalMilliSeconds = System.currentTimeMillis();
	// Obtain total seconds since midnight, may31, 2017
	long totalSeconds = TotalMilliSeconds /1000;
	// Obtain current second since midnight, may31, 2017
	long currentSeconds  = totalSeconds % 60 ;
	// Obtain total minutes since midnight, may31, 2017
	long totalMinutes = totalSeconds / 60 ;
	// Obtain current minutes since midnight, may31, 2017
	long currentMinutes = totalMinutes % 60 ;
	// Obtain total hours since midnight, may31, 2017
	long totalHours = totalMinutes / 60;
	// Obtain current Hour since midnight, may31, 2017
	long currentHour = totalHours % 24 ;
	//Display results
	System.out.println(" Current time is " + currentHour  + ":" +currentMinutes + " :" +currentSeconds 
	  +((currentHour > 12 ) ? "PM" : " AM "));
			
	}
}
