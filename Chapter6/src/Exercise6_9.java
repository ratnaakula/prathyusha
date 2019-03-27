/** (Conversions between feet and meters) Write a class that contains the following two methods:
/** Convert from feet to meters  public static double footToMeter(double foot)*/
/** Convert from meters to feet public static double meterToFoot(double meter)*/
/**The formula for the conversion is:
meter = 0.305 * foot foot = 3.279 * meter
Write a test program that invokes these methods to display the following tables:**/
import java.util.Scanner;

public class Exercise6_9 {
	/** Main method */
	public static void main(String[] args) {
		// Display table
		// Display header
		System.out.println("Feet      Meters     |      Meters        Feet\n"
				+ "------------------------------------------------------");
		// Display data
		for (double feet = 1.0, meters = 20.0; feet <= 10.0; feet++, meters += 5) {
			System.out.printf("%.1f\t", feet);
			System.out.printf("%-12.3f |", footToMeter(feet));
			System.out.printf("       %-15.1f", meters);
			System.out.printf("%-7.3f\n\n", meterToFoot(meters));
		}
	}

	/** Convert from feet to meters */
	public static double footToMeter(double foot) {
		return 0.305 * foot;
	}

	/** Convert from meters to feet */
	public static double meterToFoot(double meter) {
		return 3.279 * meter;
	}
}
