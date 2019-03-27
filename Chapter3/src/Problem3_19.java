import java.util.Scanner;
public class Problem3_19 
//Compute the perimeter of a triangle
{
public static void main(String[] args)
{
	Scanner input = new Scanner(System.in);
	//Prompt the user to read three edges for triangle
	System.out.print(" Enter three edges of a triangle:");
	double s1 = input.nextDouble();
	double s2 = input.nextDouble();
	double s3 = input.nextDouble();
	double perimeter = s1 + s2 + s3;
	if(s1 + s2 > s3 && s2 + s3 >s1 && s3 + s1 >s2)
	{
		System.out.println(" The perimeter of the triangle is " +perimeter);
	}
	else
	{
	System.out.println(" The input is invalid");
	}
}
}
