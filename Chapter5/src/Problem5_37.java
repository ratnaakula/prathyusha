
/**  (Decimal to binary) Write a program that prompts the user to enter a decimal integer and displays its corresponding binary value.
 *  Don’t use Java’s Integer .toBinaryString(int) in this program.
 */
import java.util.Scanner;

public class Problem5_37 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		//Prompt the user to enter a decimal integer
		System.out.print("Enter a decimal integer: ");
		int decimal = input.nextInt();
		//Convert the decimal number to a binary number
		String binary = "";
		for(int i = decimal; i > 0; i /= 2) {
			binary = i % 2 + binary;
		}
		System.out.println("The decimal integer " +decimal + " of binary is " +binary);
		}

}
