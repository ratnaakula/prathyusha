import java.util.Scanner;
public class Example2_10
{
public static void main(String[] args)// calculating energy
{
	//create a scanner object
	Scanner input = new Scanner(System.in);
	//prompt to enter the amount of water in kilograms
	System.out.print(" Enter the amount of water in kilograms: ");
	// m is the weight of water in kilograms
	double M = input.nextDouble();
	//prompt the user to enter the intial temperature
	System.out.print(" Enter the intial temperature : ");
	double intialTemperature = input.nextDouble();
	//prompt the user to enter the final temperature
	System.out.print(" Enter the final temperature : ");
	double finalTemperature = input.nextDouble();
	//compute the energy
	double Q =  M *(finalTemperature - intialTemperature)* 4184;
	System.out.println(" The energy needed is " +Q);
	
	
	
	
}
}
