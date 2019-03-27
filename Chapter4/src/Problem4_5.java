import java.util.Scanner;
public class Problem4_5 // area of a regular polygon
{
	public static void main(String[] args)
	{
		Scanner input = new Scanner(System.in);
		//Prompt the user to enter number of sides of polygon
		System.out.print(" Enter the number of sides:" );
		double n = input.nextDouble();
		//Prompt the user to enter side of polygon
		System.out.print(" Enter the side :");
		double s = input.nextDouble();
		//Calculate the area by formula
		// s is the length of a side
		double area = ( n * s *s ) / (4 * Math.tan(Math.PI/n ));
		// Display results
		System.out.println(" The area of the polygon is " +area);
		}

}
