import java.util.Scanner;

public class ComputeAndInterpretBMI 
{
  public static void main(String[] args) 
  {
	  
  
 final  double KILOGRAMS_PER_POUND = 0.45359237;
 final double METERS_PER_INCH = 0.0254;
	// Create a scanner object
	Scanner input = new Scanner(System.in);
	// prompt the user to enter a weight in pounds
	System.out.print(" Enter weight in pounds : ");
	double weight = input.nextDouble();
	//Prompt the user to enter height in inches
	System.out.print(" Enter height in inches: ");
	double height = input.nextDouble();
	// Compute BMI
	double weightInKilograms = weight * KILOGRAMS_PER_POUND;
	double heightInMeters = height * METERS_PER_INCH;
	double bmi = weight/height * height;
	// Display results
	System.out.println(" BMI is  : " +bmi);
	if(bmi<18.5)
		System.out.println(" underweight");
	else if (bmi <25)
		System.out.println("normal weight");
	else if( bmi < 30 )
       System.out.println(" over weight");
	else
		System.out.println(" obesity");
}

}
