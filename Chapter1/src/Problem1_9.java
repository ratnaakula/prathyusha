import java.util.Scanner;
public class Problem1_9 // Area and Perimeter of a rectangle
{
public static void main(String[] args)
{
	double width = 4.5;
	double height = 7.9;
	//Compute area of rectangle
	double area = width * height;
	System.out.println(" The area of rectangle is :" +area);
	//compute perimeter of rectangle
	double perimeter = 2 * ( width + height);
	System.out.println(" The perimeter of rectangle is:" +perimeter);
}
}
