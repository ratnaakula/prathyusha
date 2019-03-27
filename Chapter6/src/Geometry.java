import java.util.Scanner;

 public class Geometry {
	/** Main method */
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		//Prompt the user to enter number of sides
		//and the side of polygon
		System.out.print("Enter the number of sides: ");
		int n = input.nextInt();
		System.out.print("Enter the side: ");
		double side = input.nextDouble();
		
		//Display the area of the polygon
		System.out.printf("The area of the polygon is %.5f", area(n, side));
		
		
	}
/** method area computes the area of polygon */
	public static double area(int n, double side ) {
		return ( n * Math.pow(side, 2)) / (4 * Math.tan(Math.PI/n));
	}
 
}
