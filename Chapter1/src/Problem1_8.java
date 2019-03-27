import java.util.Scanner;
public class Problem1_8 // Compute Area and perimeter of a circle
{
 public static void main(String[] args)
 {
 final double PIE = 3.14;
 //Assign a radius
	 double radius = 5.5;
	 // Compute area
	 double area = radius * radius * PIE;
	 
	 //Compute perimeter
	 double perimeter = 2 * radius * PIE;
	// Display output
	 System.out.println(" The area of circle is " +area
			+ "\n"  +" The perimeter of circle is " +perimeter);
	 }
}
