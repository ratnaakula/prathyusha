import java.util.Scanner;
/**
 * 
 * @author prathyusha
 * this program is getting numner 
 */

public class EmirpProgram
{
	public static void main(String[] args) 
	{
			final int NUMBER_OF_EMIRPS = 100;
			final int NUMBER_OF_EMIRPS_PER_LINE = 10;
			int count = 0;
			
	getNumber(100);
	
	}
	
	// it is returning an integer what I am giving
	public static int getNumber(int number)
	{
    for(int i = 13; i <= 100; i++) 
    {
    	System.out.print(i);
    }
    return number;
    }
	public static boolean isEmirp(int number) 
	{
		for (int divisor = 13; divisor <= number / 2; divisor++)
		{
			if (number % divisor == 0)
				return false;
		}
		return true;
	}
	}