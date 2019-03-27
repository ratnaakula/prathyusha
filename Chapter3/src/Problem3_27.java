
import java.util.Scanner;

public class Problem3_27 // Geometry : point in a Rectangle
{
	public static void main(String[] args) 
	{
		Scanner input = new Scanner(System.in);
		// Prompt the user to enter a point coordinates x,y
		System.out.print(" Enter a point's with x- and y- coordinates: ");
		double x = input.nextDouble();
		System.out.println("Value of x: " + x);

		double y = input.nextDouble();
		System.out.println("Value of y " + y);
		// Determine whether the point is inside the triangle
		
		
		
		double calculatedY = (((-1d/2d) * x) + 100d);

		System.out.println("Calculated Value " + calculatedY);
		
		
		if(x>0 && y>0 && x<=200 && y<=100 && y <= calculatedY)
		{
		
			System.out.println(" The point is in the triangle");
		}
		else 
		{
			System.out.println(" The point is not in the triangle");
		}
	}
}