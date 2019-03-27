import java.util.Scanner;

public class Problem3_1 // Solve quadratic equation
{
 public static void main(String[] args)
 {
	 // obtain a scanner object
		Scanner input = new Scanner(System.in);
		// Prompt the user to enter a,b,c
		System.out.print(" Enter the values of a,b,c :");
		double a = input.nextDouble();
		double b = input.nextDouble();
		double c = input.nextDouble();
		double result = b * b - (4.0 * a * c);
		double r1 = (-b + Math.pow(result, 0.5)) / 2 * a;
		double r2 = (-b - Math.pow(result, 0.5)) / 2 * a;

		if (result > 0.0) 
		//{
			//double r1 = (-b + Math.pow(result, 0.5)) / 2 * a;
			//double r2 = (-b - Math.pow(result, 0.5)) / 2 * a;
			System.out.println(" The equation has two roots " + r1 + "and" + r2);
		//}

		else if (result == 0)
		//{
			//double r1 = (-b + Math.pow(result, 0.5)) / 2 * a;
			//double r2 = (-b - Math.pow(result, 0.5)) / 2 * a;
			System.out.println(" The equation has one root " + r2);
		//} 
		else
			
			System.out.println(" The equation has no real roots");

	}

}
