import java.util.Scanner;

public class Problem4_7 // Corner point coordinates
{
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		// Prompt the user to enter the radius of the bounding circle
		System.out.print("Enter the radius of the bounding circle:");
		double radius = input.nextDouble();
		// side s = 2*radius*sin PI/5;
	   double a1 = 2.0 * Math.PI / 5.0  ;
	   double a2 = 2.0 * Math.PI / 5.0  ;
	   double a3 = 2.0 * Math.PI / 5.0  ;
	   double a4 = 2.0 * Math.PI / 5.0  ;
	   double a5 = 2.0 * Math.PI / 5.0  ;
	   // Calculating coordinate
	   // by formula  x = r * cos(alpha) y = r * sin(alpha)
	   double x1 = radius * Math.cos(a1);
	   double y1 = radius * Math.sin(a1);
	   double x2 = radius * Math.cos(a2);
	   double y2 = radius * Math.sin(a2);
	   double x3 = radius * Math.cos(a3);
	   double y3 = radius * Math.sin(a3);
	   double x4 = radius * Math.cos(a4);
	   double y4 = radius * Math.sin(a4);
	   double x5 = radius * Math.cos(a5);
	   double y5 = radius * Math.sin(a5);
	   
			System.out.println("The coordinates of five points on the pentagon are");
			System.out.printf( "%2.5f %2.5f \n" , x1 , y1);
			System.out.printf( "%2.5f %2.5f \n" , x2 , y2);
			System.out.printf( "%2.5f %2.5f \n" , x3 , y3);
			System.out.printf( "%2.5f %2.5f \n" , x4 , y4);
			System.out.printf( "%2.5f %2.5f " , x5 , y5);
		/*System.out.println(" The coordinates of five points on the pentagon are :");
		for(int i = 0; i <=5; i++) {
			double x = radius *  Math.sin (2.0 *Math.PI/5.0 * i );
			double y = radius * Math.cos( 2.0 * Math.PI/5.0 * i );
			System.out.println(x +" " +y);*/
		}
	}


