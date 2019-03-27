import java.util.Scanner;
public class Exercise2_17 // wind chill temperature
{
public static void main(String[] args)
{
	// create a scanner object
	Scanner input = new Scanner(System.in);
	//Prompt the user to enter temperature in  fahrenheit degree
	System.out.print("Enter the temperature in Fahrenheit between -58' F and 41' F : ");
	double t = input.nextDouble();
	System.out.println( "Enter  the wind speed (>=2) in miles per hour: ");
	double v = input.nextDouble();
	//compute wind chill temperature
	double windChillTemperature = 35.74 + (0.6215 ) * t - ((35.75) * Math.pow(v, 0.16))
			+ 0.4275 * t * Math.pow(v,0.16);
	//Display output
	System.out.println( "  The wind chill index is " +windChillTemperature);
}
}