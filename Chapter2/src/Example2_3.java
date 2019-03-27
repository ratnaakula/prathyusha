import java.util.Scanner;
public class Example2_3 //convert feet into meters
{
public static void main (String[] args)
{
	// Create a Scanner object
	Scanner input = new Scanner(System.in);
    //Prompt a value for feet
	System.out.print(" Enter a value for feet :" );
	double feet = input.nextDouble();
	double meters =   feet * 0.305 ;
	System.out.println( +feet + " feet is "   +meters +" meters");
	
}
}
