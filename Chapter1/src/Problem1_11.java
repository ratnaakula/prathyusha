import java.util.Scanner;
public class Problem1_11 // Popualtion projection
{
 public static void main(String[] args)
 {
	 // Assume current population
	 double currentPopulation = 312032486;
	 // 1 year has 365 days
	 int year = 365;
	 int count;
	 double birthInSeconds  = 7.0; 
	 double deathInSeconds = 13.0;
     double immigrantInSeconds = 45.0;
     double secondsInYear = 60 * 60 * 24 * 365 ;
     double numBirths = secondsInYear / birthInSeconds;
     double numDeaths = secondsInYear / deathInSeconds;
     double numImmigrants = secondsInYear / immigrantInSeconds;
     System.out.print("The population for each of the next 5 years is:" + "\n");
     for( count = 1; count <= 5; count++)
     {
    	
    	 currentPopulation  += numBirths + numImmigrants - numDeaths;
    	  
    			 System.out.println( "year" + count + " = "  + (int)currentPopulation);
     }
     
	 
 }
}
