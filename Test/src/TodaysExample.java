/* 
 * Write a program to input a list of ten arrays as list1, list2...list10
 *  and sort them in an increasing order
 */
import java.util.Scanner;
import java.util.Arrays;
 
public class TodaysExample
{
/** Main method */
	public static void main(String[] args) {
		
		int[] array = createArray();
		
		sortArray(array);
		
	}

private static void sortArray(int[] array)
{
	
	Arrays.sort(array);
	System.out.println("After sorting the array is " );
}
	
	private static int[] createArray()
	{

		Scanner input = new Scanner(System.in);

		System.out.println("Please enter ten numbers of comma seperated : ");
		String list1 = input.nextLine();
		
		String[] array = list1.split(",");
		int[] array1 = new int[array.length];
		
		for (int i = 0; 0 < array.length; i++)
		{
			array1[i] = Integer.parseInt(array[i]);

		}
		
		return array1;
		
	
}
}
