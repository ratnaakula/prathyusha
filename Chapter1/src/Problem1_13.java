import java.util.Scanner;
public class Problem1_13 // Solve 2* 2 linear equation
{
public static void main(String[] args)
{
	double a = 3.4;
	double b = 50.2;
	double c = 2.1 ;
	double d = .55;
	double e = 44.5;
	double f = 5.9; 
	//Compute cramer's rule to solve  given equations
	// 3.4x + 50.2 y = 44.5
	//2.1 x + .55y = 5.9
	double x = (e * d - b *f) /(a*d - b*c) ;
	double y = (a*f - e *c)/(a*d -b*c);
	// Display output
	System.out.println(" The value for x is " +(long) x+ "\n" +" The value of y is" +(long) y);
}
}
