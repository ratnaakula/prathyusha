

/** 
 * 
 * @author prathyusha
 *
 */
/*import java.util.Scanner;

public class SampleLoop
{

	public static void main(String[] args)
	{

		Scanner input = new Scanner(System.in);
		System.out.print("Enter n : ");
		int n = input.nextInt();

		for (int i = 1; i <= n; i++)
		{

			if (i % 2 == 0)
			{
				System.out.print(i + " is Even");
			}
			else
				System.out.println("\n" + i + " is Odd");

		}
	}
}*/

/* import java.util.Scanner;

public class SampleLoop
{

	public static void main(String[] args)
	{
		//Create a scanner object
		Scanner input = new Scanner(System.in);
		// Prompt the user to enter an number
		System.out.print("Enter number: ");
		int n = input.nextInt();
		int count = 0;//Initialize count to 0

		do
		{

			n = input.nextInt();
			for (count = 1; count <= 100; count++)
			{
				if (count % 2 == 0)
					System.out.print(count + " is even ");
				else
					System.out.println("\n" + count + " is odd ");

			}

		}
		while (count <= 100);

	}
	
}*/

import java.util.Scanner;

public class SampleLoop
{

	public static void main(String[] args)
	{

		Scanner input = new Scanner(System.in);
		// Prompt the user to enter a number
		System.out.print("Enter a number:");
		int n = input.nextInt();
		int count = 0;// Initialize count to 0

		while (count <= 100)
		{

			System.out.print("Enter a number:");
			n = input.nextInt();
			for (count = 1; count <= 100; count++)
			{
				if (count % 2 == 0)
					System.out.print(count + " is even ");
				else
					System.out.println("\n" + count + " is odd ");

			}

		}

	}
}