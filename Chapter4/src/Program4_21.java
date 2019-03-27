 /**(Check SSN) Write a program that prompts the user to enter a 
 Social Security number in the format DDD-DD-DDDD, where D is a digit. 
 Your program should check whether the input is valid. Here are sample runs: */
import java.util.Scanner;

public class Program4_21 {
	public static void main(String[] args) {
		//Create a Scanner
		Scanner input = new Scanner(System.in);
		//Prompt the user to enter a SSN
		System.out.print("Enter a SSN: ");
		String ssn = input.nextLine();
		input.close();
		if (ssn.length() == 11) {
		
			if (ssn.charAt(3) == '_' && ssn.charAt(6) == '_') {
			
				if ((Character.isDigit(ssn.charAt(0))) && 
				   (Character.isDigit(ssn.charAt(1))) &&
	               (Character.isDigit(ssn.charAt(2))) &&
				    (Character.isDigit(ssn.charAt(4))) &&
				    (Character.isDigit(ssn.charAt(5))) &&
				    (Character.isDigit(ssn.charAt(7))) &&
				    (Character.isDigit(ssn.charAt(8))) &&
				    (Character.isDigit(ssn.charAt(9))) &&
				    (Character.isDigit(ssn.charAt(10))))
				     System.out.println(ssn + " is a valid social security number");
			}
		}
				    
		
				    else 
				    
				    	System.out.println( ssn + " is an invalid social security number");
				    
		
	}

}
