/** Write a program to search to a binary key in the list */

import java.util.Scanner;

public class BinarySearch
{
/** Main method */
	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		int[] list = new int[10];
		System.out.println("The array of list is :" +list);
		System.out.print("Enter the key to search  is : ");
		
		int key  = input.nextInt();
		int index  = binarySearch(list,key);
		if (index != -1) {
			System.out.println("Element found at position " +index);
		}
		else {
			System.out.println("key element not found in the array. ");
	}
	}
	
	public static int binarySearch(int[] arr, int k)
	{

		int low = 0;
		int high = arr.length - 1;

		while (high >= low)
		{
			int mid = low + high / 2;
			if (k < arr[mid]) 
				high = mid - 1;
			
			else if (k == arr[mid]) 
				return mid;
			
			else
				low = mid + 1;
		}
		return -1;
	}
	}


