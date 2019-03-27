import java.util.Scanner;

public class Problem3_23 // Geometry : point in a Rectangle
{
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		// Prompt the user to enter a point (x,y)
		System.out.print(" Enter a point with two coordinates: ");
		double x = input.nextDouble();
		double y = input.nextDouble();
		// check whether the point is within the rectangle
		// check the point centered with width 10 and height 5
		/*
		 * if (Math.pow(Math.pow(x,2),0.5)<=10/2 && (Math.pow(Math.pow(y,
		 * 2),0.5)<=5.0/2)) { System.out.println(" point (" + x + ", " + +y +
		 * " )is in the rectangle ");
		 * 
		 * } else { System.out.println(" point( " + x + " ," + +y +
		 * " ) is not in the rectangle"); } } }
		 */
		// using boolean expression
		boolean withInRectangle = (Math.pow(Math.pow(x, 2), 0.5) <= 10 / 2
				&& Math.pow(Math.pow(y, 2), 0.5) <= 5.0 / 2);
		System.out.println(" point(" + x + "," + y + ") is " 
				+ ((withInRectangle) ? " is in " : " not in") + "the rectangle");
	}
}
