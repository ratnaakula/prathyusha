import java.util.Scanner;

public class Problem3_6 
{
	public static void main(String[] args)
	{

		Scanner input = new Scanner(System.in);
		final double KILOGRAMS_PER_POUND = 0.45359237;// Constant value
		final double METERS_PER_INCH = 0.0254;
		System.out.print(" Enter weight in pounds : ");
		double weight = input.nextDouble();
		System.out.print(" Enter  feet: ");
		double feet = input.nextDouble();
		System.out.print(" Enter inches : ");
		double inches = input.nextDouble();
		double height = (feet *12) + inches;// 1feet = 12 inches
		double kilogramsPerWeight = weight * KILOGRAMS_PER_POUND;
		double heightInMeters =   height * METERS_PER_INCH;
		double bmi = kilogramsPerWeight / (heightInMeters * heightInMeters);
		System.out.println(" BMI is " + bmi);
		if (bmi < 18.5)
		{
			System.out.println(" Underweight");
		} 
		else if (bmi < 25)
		{
			System.out.println(" Normalweight");
		}
		else if (bmi < 30) 
		{
			System.out.println(" Overweight");
		} 
		else
			System.out.println(" Obesity");

	}

}
