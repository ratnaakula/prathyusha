import java.util.Scanner;

public class Problem4_1// Area of a pentagon
{
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		// Prompt the user to enter the length from the center to vertex
		System.out.print(" Enter the length from the center to vertex:");
		// r is the length from center of a pentagon to a vertex
		double r = input.nextDouble();
		// Compute the formula for side of a pentagon
		// s = 2 *r sin PI/5
		double s = (2 * r) * Math.sin(Math.PI / 5);
		// compute area of penatgon
		double area = (5 * s * s) / (4 * Math.tan(Math.PI / 5));
		System.out.printf("The area of a pentagon is %2.2f ", area);
	}
}
