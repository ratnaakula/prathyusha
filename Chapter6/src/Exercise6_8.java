/**  (Conversions between Celsius and Fahrenheit) Write a class that contains the following two methods:
/** Convert from Celsius to Fahrenheit  /* public static double celsiusToFahrenheit(double celsius)
/** Convert from Fahrenheit to Celsius 
 /* public static double fahrenheitToCelsius(double fahrenheit)
The formula for the conversion is:
 fahrenheit = (9.0 / 5) * celsius + 32 celsius = (5.0 / 9) * (fahrenheit – 32)*/
import java.util.Scanner;

public class Exercise6_8 {
	/** Main method */
	public static void main(String[] args) {
		// Display table
		// Display header
		System.out.println("Celsius     Faherenheit    |      Faherenheit     Celsius");
		System.out.println("---------------------------------------------------------");
		// Display data
		for (double celsius = 40.0, fahrenheit = 120.0; celsius >= 31.0; celsius--, fahrenheit -= 10) {
			System.out.printf("%.1f \t\t", celsius);
			System.out.printf("%-11.1f|", celsiusToFahrenheit(celsius));
			System.out.printf("          %-15.1f", fahrenheit);
			System.out.printf("%-7.2f\n\n", fahrenheitToCelsius(fahrenheit));

		}
	}

	/** Convert from Celsius to Fahrenheit */
	public static double celsiusToFahrenheit(double celsius) {
		return (9.0 / 5) * celsius + 32;

	}

	/** Convert from Fahrenheit to Celsius */
	public static double fahrenheitToCelsius(double fahrenheit) {
		return (5.0 / 9) * (fahrenheit - 32);
	}

}
