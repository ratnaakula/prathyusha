import java.util.Scanner;
public class Example2_8//show current time
{
	public static void main(String[] args)
	{
		Scanner input = new Scanner(System.in);
		System.out.print("Enter the time zone offset to GMT:");
		int offset = input.nextInt();
		//obtain total milli seconds since midnight,may 21,2018
		Long totalMilliSeconds = System.currentTimeMillis();
		//obtain total seconds since evening, may 21,2018
		Long totalSeconds = totalMilliSeconds/1000;
		//compute the current second in the minute in the hour
		Long currentSeconds = totalSeconds % 60;
		//obtain total minutes since evening,may 21, 2018
		Long totalMinutes = totalSeconds/60;
		//compute the current minutes in the hour
		Long currentMinutes = totalMinutes % 60;
		//obtain the total hours
		Long totalHours = totalMinutes / 60;
		//compute the current hour
		Long currentHours = totalHours % 24;
		currentHours = currentHours + offset ;
		//Display results
		System.out.println(" Current time is " +currentHours + ":" +currentMinutes + " :" +currentSeconds);
		
	}

}
