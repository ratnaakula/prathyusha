import java.util.Scanner;
public class Problem3_20 // Wind chill temperature
{
public static void main(String[] args)
{
		Scanner input = new Scanner(System.in);
		// Prompt the user to enter a temperature
		System.out.print(" Enter a temperature in Fahrenheit between -58F and 41F :");
		double temp = input.nextDouble();
		System.out.print(" Enter wind speed (>=2) in miles per hour : ");
		double speed = input.nextDouble();
		// Compute formula
		double windChillTemp = 35.74 + 0.6215 * temp - ((35.75) * Math.pow(speed, 0.16))
				+ 0.4275 * temp * Math.pow(speed, 0.16);
		
		if (temp >= -58 && temp <= 41 && speed >= 2) 
		{
			System.out.println(" The windchill index is " + windChillTemp);
		}
		else
		{
			System.out.println(" The temperature and / or wind speed is invalid");
		}
		}
	}

