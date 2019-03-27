/**   (Palindrome integer) Write the methods with the following headers // Return the reversal of an integer, 
 * i.e., reverse(456) returns 654 public static int reverse(int number)
// Return true if number is a palindrome public static boolean isPalindrome(int number) Use the reverse method to 
 * implement isPalindrome. A number is a palindrome if its reversal is the same as itself. 
 * Write a test program that prompts the user to enter an integer and reports whether the integer is a palindrome 
 */
import java.util.*;

public class Exercise6_3 {
	/** Main method */
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		// Prompt the user to enter an integer
		System.out.print("Enter an integer : ");
		int number = input.nextInt();
		// Check whether the integer is palindrome
		System.out.println(number + (isPalindrome(number) ? " is " : " is not ") + " a palindrome");
	}

	/** Method isPallindrome returns true if number is a palindrome */
	public static boolean isPalindrome(int number) {
		return number == reverse(number) ? true : false;

	}

	/** Method reverse returns the reversal of an integer */
	public static int reverse(int number) {
		String reverse = "";// Holds reversed number
		String n = number + "";// Convert number to a string
		// Reverse string
		for (int i = n.length() - 1; i >= 0; i--) {
			reverse += n.charAt(i);

		}
		return Integer.parseInt(reverse);// returns reversed integer
	}
}
