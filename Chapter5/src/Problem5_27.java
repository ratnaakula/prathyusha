import java.util.Scanner;

public class Problem5_27 {
	public static void main(String[] args) {
		final int YEARS_PER_LINE = 10;

		int count = 0;

		for (int year = 101; year <= 2100; year++) {
			
			boolean isLeapYear = (year % 4 == 0 && year % 100 != 0 || year % 400 == 0);
			if (isLeapYear == true) {
				count++;

				if (count % YEARS_PER_LINE == 0) {
					System.out.println(year);
				} 
				else

					System.out.print(year + " ");
			}
			
		}
		/*if((year % 4 == 0 && year % 100 !=  0 ) || year % 400 == 0)
{
			count ++;
			System.out.print(year + (count % 10 == 0 ? "\n": " "));
		}
		}
		System.out.println();*/
	System.out.println(" \n The count of years is " +count);
		}
	}


