import java.util.Scanner;

public class ExampleOfConversion {
	public static void main(String[] args) {
		final double CENTIMETERS_PER_INCH = 2.54;
		final double INCH_PER_CENTIMETER = 0.394;
		final double LITERS_PER_GALLON = 3.785;
		final double GALLON_PER_LITERS = 0.2641;
		final double METERS_PER_FEET = 0.305;
		final double FEET_PER_METERS = 3.2803;

		// Create a Scanner object
		Scanner input = new Scanner(System.in);
		// Prompt the user to enter a degree in temperature
		System.out.print("Enter a number : ");
		double number = input.nextInt();
		// Convert fahrenheit to celsius
		double celsius = ((number - 32) / 1.8);
		System.out.println(" The fahrenheit temperature " + number + " in celsius is : " + celsius);
		// Convert celsius to fahrenheit
		double fahrenheit = ((number * 1.8) + 32);
		System.out.println(" The celsius temperature " + number + " in fahrenheit is : " + fahrenheit);
		// Convert inches to centimeters
		// 1 inch = 2.54cm
		double centimeters = number * CENTIMETERS_PER_INCH;
		System.out.println(" The number " + number + " in centimeter : " + centimeters);
		// Convert centimeters to inches
		// 1 centimeter = 0.394inches
		double inches = number * INCH_PER_CENTIMETER;
		System.out.println(" The number " + number + "in inches : " + inches);
		// Convert gallons to liters
		// 1 gallon is 3.785
		double liters = number * LITERS_PER_GALLON;
		System.out.println(" The gallons " + number + " in liters is : " + liters);
		// Convert liters to gallons
		// 1 liter = 0.2641
		double gallons = number * GALLON_PER_LITERS;
		System.out.println(" The liters " + number + " in gallons is : " + gallons);
		// Convert feet to meters
		// 1 foot = 0.305 m
		double meters = number * METERS_PER_FEET;
		System.out.println(" The feet " + number + " in meters is : " + meters);
		// Convert meters to feet
		// 1 meter = 3.28083
		double feet = number * FEET_PER_METERS;
		System.out.println(" The meters " + number + " in feet is : " + feet);

	}
}
