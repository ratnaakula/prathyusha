import java.util.Scanner;

public class Problem3_3 // Algebra :  solve 2 * 2 linear equations
{
 public static void main(String[] args)
 {
	 //Create a scanner object
	 Scanner input = new Scanner(System.in);
	 // Prompt the user to enter  a,b,c,d,e and f 
	 System.out.print(" Enter a,b,c,d ,e and f :");
	 double a = input.nextDouble();
	 double b = input.nextDouble();
	 double c = input.nextDouble();
	 double d = input.nextDouble();
	 double e = input.nextDouble();
	 double f = input.nextDouble();
	 if((a*d - b*c) == 0)
	 {
		 System.out.println(" The equation has no solution " );
	 }
	 else
	 {
		 // use cramer's rule to solve the problem 
		 //ax+by =e, cx+dy=f  >> x = ed - bf/ad-bc , y = af-ec/ad-bc
		 
		 double x = (e *d - b*f)/(a*d-b*c);
		 double y =( a*f - e*c)/(a*d - b*c);
		 System.out.println(" The value of x is "  +x + "  " + " and y is " +y);
	 }
 }
}
