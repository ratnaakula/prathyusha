/**
 * 
 * @author prathyusha
 *
 */
import java.util.Scanner;
public class Sample
{
	public static void main(String[] args) {
		 int[] marks = {22, 33, 44, 55, 66, 77, 88};
		display(marks);
		int[] list1 = reverse(marks);
		System.out.println("Reversed array elements");
		display(reverse(marks));
	}
	public static void display(int[] input) {
		for(int i = 0; i < input.length; i++) {
			System.out.println(input[i]);
		}
	}

	public static int[] reverse(int[] input) {
		int[] result = new int[input.length];
		for(int i = 0, j = result.length -1; i < input.length; i++, j--) {
			result[j] = input[i];
		}
		return result;
		

		}
		
	}

