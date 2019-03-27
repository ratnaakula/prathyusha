import java.util.Scanner;
public class Problem3_29 //Geometry : two circles
{
	public static void main(String[] args)
	{
		Scanner input = new Scanner(System.in);
		// Prompt the user to enter the center coordinates
		// and radii of two circles
		System.out.print(" Enter circle1's center x,y coordinates, and radius : ");
		double circlex1 = input.nextDouble(); 
		double circley1 = input.nextDouble();
		double radii1   = input.nextDouble();
		System.out.print(" Enter circle2's center x,y coordinates, and radius : ");
		double circlex2 = input.nextDouble(); 
		double circley2 = input.nextDouble(); 
		double radii2   = input.nextDouble();
		//Determines whether the second circle is inside the first
		if(Math.pow(Math.pow(circlex2 - circlex1,2)+Math.pow(circley2 - circley1,2) ,0.5)
				<= Math.abs(radii1-radii2)) 
		{
			System.out.println(" cicle2 is inside the circle1 " );
		}
		else if (Math.pow(Math.pow(circlex2 - circlex1,2)+Math.pow(circley2 - circley1,2) ,0.5)
					<= Math.abs(radii1+radii2)) 
			{
			System.out.println(" circle2 overlaps circle1 ");
			}
		else
		{
			System.out.println(" circle2 does not overlap circle1");
		}
		
	}			

}
