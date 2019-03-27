import java.util.Scanner;
import java.util.Arrays;

public class SelectionSort
{

	public static void main(String[] args)
	{

		int array[] = readArray();
		sortArray(array);
		int numberToFind = readFindNumber();
		int numberIs = findNumber(array, numberToFind);
		System.out.println("Index where we found value: " + numberIs);
		
	}

	private static int readFindNumber()
	{

		Scanner input = new Scanner(System.in);
		System.out.print("Enter the number: ");
		int findNumber = input.nextInt();
		return findNumber;

	}

	private static int findNumber(int[] array, int numberToFind)
	{

		int low = 0;
		int high = array.length - 1;
		while( low <= high)
		{
			int mid = (low + high) / 2;
			System.out.println("Mid value is: " + mid);
			if (numberToFind < array[mid])
			{
				high = mid - 1;
			}
			else if (numberToFind == array[mid])
			{
				return mid;				
			}
			else
			{
				low = mid + 1;
			}
		}
		return -1;
	}

	private static void sortArray(int[] array)
	{

		Arrays.sort(array);

	}

	private static int[] readArray()
	{

		Scanner input = new Scanner(System.in);

		System.out.print("Please enter the 10 numbers comma seperated : ");
		String arrayLine = input.nextLine();

		String[] array = arrayLine.split(",");
		int array1[] = new int[array.length];

		for (int i = 0; i < array.length; i++)
		{
			array1[i] = Integer.parseInt(array[i]);

		}
		return array1;

	}
}
