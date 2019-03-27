import java.util.Scanner;
public class Problem1_12 // Average speed in kilometers
{
public static void main(String[] args)
{
	final double MILE_PER_KILOMETER = 1.60934;
	double miles = 24.0;
	double hour = 1.0;
	double minutes = 40.0;
	double seconds = 35.0;
	//Calculate distance
	double distance = miles * 1.60934;
	//Calculate time in to minutes
	double timeInMinutes= hour * 60.0 + minutes * 60.0 + seconds / 60.0;
	// calculating kilometers per hour 
	//kph = 60 * distance traveled / time taken
	double kilometersPerHour  = 60.0 * distance/ timeInMinutes;
   
    System.out.printf( "%d%n",kilometersPerHour);
	
}
} 
