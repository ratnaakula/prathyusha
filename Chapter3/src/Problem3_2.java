import java.util.Scanner;

public class Problem3_2 
{
	public static void main(String[] args)
	{
		Scanner input = new Scanner(System.in);
		// Generate three random integers
		int digit1 = (int)(Math.random()*10);
		int digit2 = (int)(Math.random()*10);
		int digit3 = (int)(Math.random()*10);
		System.out.print(" what is " + digit1 + " + " + digit2 + "  + " + digit3 + " ? ");
		int answer = input.nextInt();
		if (digit1 + digit2 + digit3  == answer)
		{
			System.out.println(" your answer is correct ");
		}
		else
		{
			
			System.out.println(" your answer is wrong ");
		System.out.println( digit1 + " + " + digit2 + " + " + digit3  + " is "
		                 + (digit1 + digit2 + digit3 ));

	}

}
}