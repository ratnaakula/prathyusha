import java.util.Scanner;
public class Problem4_20 {
public static void main(String[] args)
{
	Scanner input = new Scanner(System.in);
	//Prompt the user to enter a string
	System.out.print(" Enter a string :");
	String s = input.nextLine();
	//Display string length and its first character
	System.out.println( s +" has a length of " +s.length() + "and its first character is " +s.charAt(0));
	}
}
