import java.util.Scanner;
public class Example2_2 //Compute  Volume of Cylinder 
{
 public static void main(String[] args)
 {
 final double PI = 3.14159;// Declare a constant
 // Create a scanner object
 Scanner input = new Scanner(System.in);
// Prompt the user to enter   a radius and length
  System.out.print("Enter a number for radius and length of cylinder: ");
  double radius = input.nextDouble();
   double length = input.nextDouble();
   //Compute area
  double area = radius * radius * PI;
  //Compute volume
  double volume = area * length;
  //Display result
  System.out.println(" The area is    " +area);
  System.out.println(" The volume is  " +volume);
  
}
}
