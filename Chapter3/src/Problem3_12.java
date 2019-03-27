import java.util.Scanner;

public class Problem3_12// check whether entered number is palindrome or not
{ 
 public static void main(String[] args)
 {
	 Scanner input = new Scanner(System.in);
	 // Prompt the user to enter a 3 digit number
	 System.out.print(" Enter a three digit number : ");
	 int number = input.nextInt();
	 int first = number / 100;
	 int last= number % 10;
	 
	 if(last==first) 
	 {
		 System.out.print( number + " is a pallindrome");
	 }
	 else
	 {
		 System.out.print( number+ " is not a pallindrome");
	 }
	 }
}
