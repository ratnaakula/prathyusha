import java.util.Scanner;

public class Problem4_4 // area of hexagon
{
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		// Prompt the user to enter the side of a hexagon
		System.out.print("Enter the side:");
		double s = input.nextDouble();
		// compute area
		double area = (6 * s * s) / (4 * (Math.tan(Math.PI / 6)));
		// Display result
		System.out.printf(" The area of the hexagon is  %.2f" , area);
	}

}
