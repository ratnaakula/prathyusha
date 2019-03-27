import java.util.Scanner;

public class Problem3_22 // Geometry : point in a circle
{
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		// Prompt the user to enter a point (x,y)
		System.out.print(" Enter a point with two coordinates: ");
		double x = input.nextDouble();
		double y = input.nextDouble();
		// check whether the point is within the circle
		/*if (Math.pow(Math.pow(x,2) + Math.pow(y,2), 0.5) <= 10.0) 
		{
			System.out.println(" point (" + x + ", " + +y + " )is in the circle ");

		} 
		else
		{
			System.out.println(" point( " + x + " ," + +y + " ) is not in the circle");
		}*/

	

// using boolean expression
boolean withInCircle = (Math.pow(Math.pow(x,2) + Math.pow(y,2),0.5)<=10);
		//Above expression can also be written in this form
		//boolean withInCircle = (Math.pow(x*x+ y*y,0.5)<=10);
System.out.println(" point ("   +x + ","  +y + ") is " +  
		((withInCircle) ? "  in the circle" : " not in the circle")); 
}
}