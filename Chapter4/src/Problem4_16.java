import java.util.Scanner;
public class Problem4_16 {
	public static void main(String[] args)
	{
		//Generate a letter as a string
		int number = 65 +(int)(Math.random() * (91-65)); 
		//int number = (int)(Math.random() *91);
		// Display results
		System.out.println( " The uppercase letter is " +(char)number);
		}
}