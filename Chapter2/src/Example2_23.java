import java.util.*;

public class Example2_23// cost of driving

{
public static void main(String[] args)
{ 
	// Create a scanner object
	Scanner input = new Scanner(System.in);
	//Prompt the user to enter the assumed variables
	System.out.print(" Enter the driving distance : ");
	double distance = input.nextDouble();
	//Prompt the user to enter the fuel efficiency in miles per galloon
	System.out.print("Enter miles per galloon : ");
    double fuelPerGalloon = input.nextDouble();
    //Prompt the user to enter the price per galloon
    System.out.print(" Enter the price per galloon : ");
    double pricePerGalloon = input.nextDouble();
    //Compute cost of the trip
    double cost = (pricePerGalloon * distance) / fuelPerGalloon ;   
 //Display output
    System.out.println(" The cost of driving is  $ "  +cost);
}
}
