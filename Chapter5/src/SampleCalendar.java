
import java.util.Scanner;

public class SampleCalendar
{
	public static void main(String[] args)
	{
		int year = getYear(getInputScanner());
		int day = getDay(getInputScanner());
		loopMonth(day, year);

	}

	public static Scanner getInputScanner()
	{
		Scanner input = new Scanner(System.in);
		return input;
	}

	public static int getYear(Scanner input)
	{
		System.out.print("Enter the year: ");
		return input.nextInt();
	}

	public static int getDay(Scanner input)
	{
		System.out.print("Enter the day: ");
		return input.nextInt();
	}

	public static void loopMonth(int day, int year)
	{
		for (int i = 1; i <= 12; i++)
		{
			int numberOfDays = printHeader(i, year);
			day = printMonth(day, numberOfDays);
		}
	}

	public static int printHeader(int month, int year)
	{
		int numberOfDays = 0;
		
		System.out.println();
		if(month == 1) {
			System.out.println("\t\tJanuary " + year);
			numberOfDays = 31;
		}
		else if(month == 2) {
			System.out.println("\t\tFebruary " +year);
			numberOfDays = 28;
		}
		else if(month == 3) {
			System.out.println("\t\tMarch " +year);
			numberOfDays = 31;
		}
		else if(month == 4) {
			System.out.println("\t\tApril " +year);
			numberOfDays = 30;
		}
		else if(month == 5) {
			System.out.println("\t\tMay " +year);
			numberOfDays = 31;
		}
		else if(month == 6) {
			System.out.println("\t\tJune " +year);
			numberOfDays = 30;
		}
		else if(month == 7) {
			System.out.println("\t\tJuly " + year);
			numberOfDays = 31;
		}
		else if(month == 8) {
			System.out.println("\t\tAugust " +year);
			numberOfDays = 31;
		}
		else if(month == 9) {
			System.out.println("\t\tSeptember " +year);
			numberOfDays = 30;
		}
		else if(month == 10) {
			System.out.println("\t\tOctober " +year);
			numberOfDays = 31;
		}
		else if(month == 11) {
			System.out.println("\t\tNovember " + year);
			numberOfDays = 30;
		}
		else if (month == 12){
			System.out.println("\t\tDecember " +year);
			numberOfDays = 31;
		}
		
		System.out.println("--------------------------------------------------");
		System.out.print("Sun\tMon\tTue\tWed\tThu\tFri\tSat");
		return numberOfDays;
	}

	public static int printMonth(int days, int numberOfDays)
	{
		int count = 0;
		System.out.println();
		for(int i = days; i >= 1; i--)
		{
			System.out.print("\t");
			count++;
		}
		for(int i = 1; i <= numberOfDays; i++) 
		{	
			if(count % 7 == 0)
			{
				System.out.println();
			}
			System.out.print(i + "\t");
			count++;
		}
		return count%7;
	}
}