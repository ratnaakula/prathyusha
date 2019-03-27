/** (The MyTriangle class) Create a class named MyTriangle that contains the following two methods:

 /* Return true if the sum of any two sides is  *  greater than the third side. */
/** Return the area of the triangle. */ 
/*public static boolean isValid( double side1, double side2, double side3)**/
/*public static double area( double side1, double side2, double side3)
Write a test program that reads three sides for a triangle and computes the area if the input is valid. Otherwise, it displays that the input is invalid. 
The formula for computing the area of a triangle is given in Programming Exercise **/

import java.util.Scanner;

public class MyTriangle {
	/** Main method */
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		// Prompt the user to enter three sides of a triangle
		System.out.print("Enter the three sides of a triangle: ");
		double x1 = input.nextDouble();
		double y1 = input.nextDouble();
		double x2 = input.nextDouble();
		double y2 = input.nextDouble();
		double x3 = input.nextDouble();
		double y3 = input.nextDouble();
		double side1 = Math.pow(Math.pow(x2-x1,2)+ Math.pow(y2-y1,2) , 0.5);
		double side2 = Math.pow(Math.pow(x3-x2,2)+ Math.pow(y3-y2,2) ,0.5);
		double side3 = Math.pow(Math.pow(x1-x3,2)+ Math.pow(y1-y3,2),0.5);

		// Compute area if input is valid. otherwise display input invalid
		System.out.println(isValid(side1, side2, side3) ? "The area of triangle is " + area(side1, side2, side3)
				: "Input is invalid");
	}

	public static boolean isValid(double side1, double side2, double side3) {
		boolean valid = ((side1 + side2) > (side3)) && ((side2 + side3) > side1) && ((side1 + side3) > side2);
		return valid; 

	}

	/** Method area returns the area of a triangle. */
	public static double area(double side1, double side2, double side3) {

		double s = (side1 + side2 + side3) / 2;
		return Math.sqrt(s * (s - side1) * (s - side2) * (s - side3));
	}
}
