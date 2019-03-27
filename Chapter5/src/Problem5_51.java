/**(Longest common prefix) Write a program that prompts the user to enter two strings and displays 
 * the largest common prefix of the two strings. Here are some sample runs:**/
import java.util.Scanner;
public class Problem5_51 {
	public static void main(String[] args) {
		//Create a Scanner
		Scanner input = new Scanner(System.in);
		//Prompt the user to enter two strings 
		System.out.print("Enter the first string: ");
		String s1 = input.nextLine();
		System.out.print("Enter the second string: ");
		String s2 = input.nextLine();
		int index = 0; // Initialize index to 0
		String prefix = ""; // Initialize prefix as empty string
		//Get the largest common prefix of the two strings
		while(s1.charAt(index) == s2.charAt(index) )
		{
			prefix += s2.charAt(index);
			index++;
			
		}
		//Display result
		if(prefix.length() > 0) {
			System.out.println("The common prefix is " +prefix);
			
		}
		else
			System.out.println(s1  + " and " +s2 +" have no common prefix");
	}
}

