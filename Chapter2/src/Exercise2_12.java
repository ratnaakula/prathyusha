import java.util.Scanner;
public class Exercise2_12// finding runway length
{
 public static void main(String[] args)
 {
	 //create a scanner object
	 Scanner input = new Scanner(System.in);
	 // prompt the user to enter value for speed v and acceleration a for an airplane
	 System.out.print(" Enter speed and acceleration : ");
	 int  v= input.nextInt();
	 float a= input.nextFloat();//
	 //Compute length
	 double length =  ( v * v / (2 * a) );
	 //Display output
	 System.out.println(" The minimum runway length for this airplane is " + length);
	  }
}
