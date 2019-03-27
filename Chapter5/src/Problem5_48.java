/**(Process string) Write a program that prompts the user to enter a string and displays the characters at odd positions.
 *  Here is a sample run:
 *  Enter a string: Beijing Chicago 
  BiigCiao */

import java.util.Scanner;
public class Problem5_48 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		//Prompt the user to enter a string
		System.out.print("Enter a string: ");
		String string = input.nextLine();
		String oddPositions = "";//Hold the characters at odd positions
		//concat that characters in the string at odd positions
		for(int i = 0; i < string.length(); i +=2) {
			oddPositions += string.charAt(i) ;
			
		}
		//Display output
		System.out.println(oddPositions);
	}

}
