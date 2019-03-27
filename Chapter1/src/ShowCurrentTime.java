import java.util.Scanner;
public class ShowCurrentTime 
{
public static void main(String[] args)
{
	
	// Obtain the total MilliSeconds since midnight Janob1 , 1960
	Long totalMilliseconds = System.currentTimeMillis();
	//Obtain the total Seconds since midnight Jan1 ,1960
	Long totalSeconds = totalMilliseconds/1000;
	// Compute the current second in the minute in the hour
	Long currentSecond = totalSeconds % 60;
	//Obtain the total minutes
	Long totalMinutes  = totalSeconds / 60;
	//Obtain current Minute in the hour
	Long currentMinutes = totalMinutes/60;
	// obtain the total hours
	Long totalHours = totalMinutes / 60;
	//Compute the current hour
	Long currentHour = totalHours % 24;
    //Display results
	System.out.println(" Current time is   " + currentHour +" :" + currentMinutes + " :" + currentSecond + " GMT");
	
}
}