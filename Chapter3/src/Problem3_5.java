import java.util.Scanner;

public class Problem3_5 // Find future dates
{
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		// Prompt the user to enter an integer for today
		System.out.print(" Enter an integer for today's day:");
		int day = input.nextInt();
		System.out.print(" Enter the number of days elapsed since today :");
		int elapsed = input.nextInt();
		int futureDay = (day + elapsed) % 7;

		switch (day) {
		case 0:
			System.out.print("Today is Sunday");
			break;
		case 1:
			System.out.print("Today is Monday");
			break;
		case 2:
			System.out.print("Today is Tuesday");
			break;
		case 3:
			System.out.print("Today is Wednesday");
			break;
		case 4:
			System.out.print("Today is Thursday");
			break;
		case 5:
			System.out.print("Today is Friday");
			break;
		case 6:
			System.out.print("Today is Saturday");
			
		}
		
		if (futureDay == 0) 
		{
		
			System.out.println(" and the future day is Sunday");
		}
		else if( futureDay ==1)
		{
			
			System.out.println(" and the future day is Monday");
		}
		else if(futureDay ==2) 
		{
		
			System.out.println(" and the future day is Tuesday");
		}
		else if(futureDay ==3) 
		{
			System.out.println(" and the future day is Wednesday");
		}
		else if(futureDay ==4) 
		{
			System.out.println(" and the future day is Thursday");
		}
		else if(futureDay ==5)
		{
			System.out.println(" and the future day is Friday");
		}
		else if(futureDay ==6) 
		{
		
			System.out.println(" and the future day is Saturday");
		}
			
		}
	}

