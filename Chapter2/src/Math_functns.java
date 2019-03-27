/** 
 * 
 * @author prathyusha
 * Checking all Mathematical functions
 */
import java.util.Scanner;

public class Math_functns
{

	public static void main(String[] args) {

		double a = -567.5;

		// Gives the absolute value of a double value
		System.out.println(Math.abs(a));
		
		//Returns the size of an ulp of an argument
		System.out.println(Math.ulp(a));

		double b = 0.5;

		// Returns the arc cosine of a value

		System.out.println(Math.acos(b));

		int x = 248078345;
		int y = 397098456;
		int result = Math.addExact(x, y);
		System.out.println(result);

		double c = 9;

		// Returns the cube root value of 9

		System.out.println(Math.cbrt(c));

		double d = 63.6;

		// Returns the rounded up to its nearest double value

		System.out.println(Math.ceil(d));

		// Returns the rounded down to its nearest double value

		System.out.println(Math.floor(d));
		// Create a Scanner object
		Scanner num = new Scanner(System.in);

		System.out.print("Enter the num e : ");

		int e = num.nextInt();

		// Returns the argument decremented by 1, throwing an exception if
		// the result overflows an int

		int f = Math.decrementExact(e);

		System.out.println("The decrement of number e is " + f);

		int i = Math.incrementExact(e);

		// Returns the argument incremented by 1, throwing an exception if
		// the result overflows an int

		System.out.println("The  increment of number e  is " + i);

		// Checks the increment exact function of long data type

		System.out.print("Enter the number n: ");

		long n = num.nextLong();

		long m = Math.incrementExact(n);

		System.out.println("The increment of long number n  is " + m);

		double g = 1.5;

		// Returns Euler's number e raised to the power of a double value.(e^-1.5)

		System.out.println(Math.exp(g));

		// Returns e^g - 1

		System.out.println(Math.expm1(g));

		double l = 4.2;

		// Returns the natural logarithm (base e) of a double value.

		System.out.println("The logarithm is " + Math.log(l));

		double x1 = 5678.4;

		double x2 = 4563.2;

		// checks the Math function of return after

		System.out.println("The result is " + Math.nextAfter(x1, x2));

		// Returns the maximum of two double values

		double max = Math.max(x1, x2);

		System.out.println("The max of two double values is " + max);

		// Returns the minimum of two double values

		double min = Math.min(x1, x2);

		System.out.println("The max of two double values is " + min);

		float y1 = 123.4f;

		float y2 = 345.6f;

		// Returns the maximum of two float values

		float maximum = Math.max(y1, y2);

		System.out.println("The maximum of two float values is " + maximum);

		// Checks the Mathematical function of next down

		double d1 = 456.76;

		// Checks Math.round function
		System.out.println("The rounded value of d1 is " + Math.round(d1));
		double down = Math.nextDown(d1);

		// Returns the floating point value adjacent to d1
		// in direction of negative infinity

		System.out.println("The flaoting down point of d1 is " + down);

		double up = Math.nextUp(d1);

		// Returns the floating point value adjacent to d1
		// in direction of positive infinity

		System.out.println("The floating up point of d1 is " + up);

		int m1 = 34567;

		int m2 = 12345;

		int multi = Math.multiplyExact(m1, m2);

		int diff = Math.subtractExact(m1, m2);

		// Returns the product of the arguments, throwing an exception
		// if the result overflows an int.

		System.out.println("The product of the m1 and m2 is " + multi);

		// Returns the difference of the arguments, throwing an exception
		// if the result overflows an int

		System.out.println("The difference of the m1 and m2 is " + diff);

		// Checks Math.pow function with two int values

		double p1 = 5.6;

		double p2 = 2.0;

		// Returns p1 raised to the power of p2

		System.out.println("The result of pow value is " + Math.pow(p1, p2));

		// Checks the rint Math function
		// Which rounds up to its nearest integer

		System.out.println("The rint of value is " + Math.rint(p1));

		// Checks the Math functions of radians and degrees
		// Returns the angle in radians for the angle in degree

		System.out.println("The angle in radians for the angle in degrees is " + Math.toRadians(30));

		// Returns the angle in degrees for the angle in radians.

		System.out.println("The angle in degrees for the angle in radians is " + Math.toDegrees(0.532));
	}
}
