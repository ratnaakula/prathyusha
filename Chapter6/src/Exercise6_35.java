/* (Geometry: area of a pentagon) The area of a pentagon can be computed using the 
 * following formula:
 */
import java.util.Scanner;

public class Exercise6_35 {
	/** Main method */
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		// Prompt the user to enter the side of a pentagon
		System.out.print("Enter the side: ");
		double side = input.nextDouble();
		// Display its area
		System.out.printf("The area of the pentagon is  %.4f", area(side));

	}

	/*  method  area computes the value of area opf pentagon */
	public static double area(double side) {
		return (5 * Math.pow(side, 2)) / (4 * Math.tan(Math.PI / 5));
	}

}
