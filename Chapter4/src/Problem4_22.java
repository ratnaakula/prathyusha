import java.util.Scanner;
public class Problem4_22 {
	public static void main(String[] args)
	{
		Scanner input = new Scanner(System.in);
		//Prompt the user to enter two strings
		System.out.print("Enter string s1: ");
		String s1 = input.nextLine();
		System.out.print("Enter string s2: ");
		String s2 = input.nextLine();
		//Display whether the second string 
		//is a substring of the first string
		//System.out.println( s2 + (( s1.contains(s2)) ? " is " : "  is not ")+ " a substring of " + s1);
		if(s1.contains(s2))
		{
		System.out.println(s2 + " is a substring of " +s1);
		}
		else
			System.out.println(s2 + " is not a substring of " +s1);
		
	}

}
