/** (Reverse the numbers entered) Write a program that reads ten integers and displays them 
 * in the reverse of the order in which they were read.
 * @author prathyusha
 *
 */
import java.util.Scanner;

public class Problem7_2
{
	/** Main method */
	public static void main(String[] args) {
		Scanner obj = new Scanner(System.in);
		int val;
		val = obj.nextInt();
		System.out.println(val);
		
		int [] array = new int[10];
		// Prompt the user to enter ten integers
		System.out.print("Enter ten integers: ");
		// complete the array
		complete(array);
		
		//Display integers in reverse order
		for(int i = array.length-1; i >= 0; i--) {
			System.out.print(array[i] + " ");
		}
	}
		/** Method complete */
		public static void complete(int[] array) {
			Scanner input = new Scanner(System.in);
			for(int i = 0; i < array.length; i++) {
				array[i] = input.nextInt();
			}
		}
	}


