import java.util.Scanner;
public class Problem3_21 // Science:day of week
{
	public static void main(String[] args)
	{
		Scanner input = new Scanner(System.in);
		//Prompts the user to enter a year
		System.out.print(" Enter a year : (e.g., 2012): ");
		int year = input.nextInt();
		System.out.print(" Enter month : 1- 12 : " );
		int month = input.nextInt();
		System.out.print(" Enter the day of the month : 1-31 : " );
		int dayOfMonth = input.nextInt();
		//Convert January and February to months 13 and 14 of the previous year
		if (month ==1 || month == 2 )
		{ 
			month = (month==1) ? 13 : 14;
			year--;
		}
		// compute formula for dayOfWeek
		
		int dayOfWeek = (dayOfMonth + (26 * (month + 1))/10 +( year % 100) +( year % 100)/4 
				+ (year/100)/4 + 5 * (year/100)) % 7;
		// Display result
				System.out.print(" Day of the week is ");
				
		switch (dayOfWeek)
		{
		case 0 : System.out.print("Saturday");
		break;
		case 1 : System.out.print("Sunday");
		break;
		case 2 : System.out.print("Monday");
		break;
		case 3 : System.out.print("Tuesday");
		break;
		case 4 : System.out.print("Wednesday");
		break;
		case 5 : System.out.print("Thursday");
		break;
		case 6 : System.out.print("Friday");
		break;
		}
		
		}
	}


