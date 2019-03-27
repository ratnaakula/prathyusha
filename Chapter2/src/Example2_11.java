import java.util.Scanner;

public class Example2_11// population projection
{
 public static void main(String[] args)
 {
	// create a scanning object
	 Scanner input = new Scanner(System.in);
	 //prompt the user to enter the number of years
 System.out.print("Enter the number of years :");
	int yearsToCalculate = input.nextInt();
	 
	 double birthRateInSeconds = 7.0;
	 double deathRateInSeconds = 13.0;
	 double newImmigrantInSeconds = 45.0;
	 
	
	 
	 double secondsInYear = 365* 24* 60*60;
	 double numBirths = secondsInYear/birthRateInSeconds;
	 double numDeaths = secondsInYear/deathRateInSeconds;
	 double numImmigrants = secondsInYear/ newImmigrantInSeconds;
	 double runningPopulation = 312032486;
	 

	//for(int count=1; count<=yearsToCalculate; count++)
	 //{
		 runningPopulation += numBirths + numImmigrants - numDeaths;
		 System.out.println("The population in " +yearsToCalculate + " years is "
	  +  (int)runningPopulation);
 //}
	 	 
 }
}
