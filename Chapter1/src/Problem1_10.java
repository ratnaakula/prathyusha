import java.util.Scanner;
public class Problem1_10 // Compute average speed in miles
{
	public static void main(String[] args)
	{
		final double  KILOMETER_PER_MILES =  1.609;
		// compute speed 
		//speed = distance/time
		double kilometers = 14.0;
		double min = 45.0;
		double seconds = 30.0;
		//converting from kilometers to miles
		double distanceInMiles = kilometers /KILOMETER_PER_MILES ;
		//converting time minutes into hour
		double timeInHour = (45.0* 60.0 + 30.0 )/( 60.0 );
		//Calculate miles per hour
		double milesPerHour =  distanceInMiles / timeInHour;
		

				System.out.println(" The average speed of a runner is : " +milesPerHour);
	}
}
