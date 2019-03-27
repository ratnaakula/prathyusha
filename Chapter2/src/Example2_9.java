import java.util.Scanner;

public class Example2_9// compute physics acceleration
{
public static void main(String[] args)
{
	//obtain a scanning object
	Scanner input = new Scanner(System.in);
	//Prompt the user to enter the value
	System.out.print(" Enter v0 , v1 and t:");
	double v0 = input.nextDouble();
	double v1 = input.nextDouble();
	double t = input.nextDouble();
	double a = (v1 - v0 )/t;
	System.out.println(" The average acceleration is " +a );
	
}
}
