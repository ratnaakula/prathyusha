import java.util.Scanner;
public class Example2_16 //compute area of hexagon
{
	public static void main(String[] args)
	{ 
		//Create a scanner object
		Scanner input = new Scanner(System.in);
		//prompt the user to enter the side of a hexagon
		System.out.print(" Enter the side of a hexagon : " );
		// s denotes length of hexagon
		double side = input.nextDouble();
		 //compute the area
		double area = Math.pow(3, 0.5) * 3 /2 *side * side;
		
	  // display results
	System.out.println(" The area of the hexagon is " +area);
		
	}

}
