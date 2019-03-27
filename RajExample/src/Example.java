import java.util.*;

public class Example // All operands function between two numbers
{
	

	public static void main(String[] args)
	{
		
		
		//prompt the user to enter names of  all operands
		System.out.print("* Addition \n" );
		System.out.print("* Subtraction\n");
		System.out.print("* Multiplication\n");
		System.out.print("* Division\n");
		System.out.print("* modula\n");
		System.out.print("* Squared\n");
		System.out.print("* cubed\n");
		// Create a scanner object
		 Scanner input = new Scanner(System.in);
		System.out.println("Please enter in a calculation option:\n");
	    int number1 = input.nextInt();
		int number2 = input.nextInt();
		//Compute sum 
		int sum = number1 + number2 ; 
		//Compute difference
		int difference = number1 - number2 ;
		//Compute product
		int product = number1 * number2 ;
		//Compute quotient
		int quotient = number1 / number2 ;
		// Compute remainder
		int remainder = number1 % number2 ;
		// Compute square root
		double root = (Math.sqrt(number1));
		// compute cube root
		double croot = (number2 )* 0.333 ;
		
		
	// Display result
		
   System.out.println("\n The sum of firstnumber " +number1 + " and second number " +number2 + 
		  " is " + sum );
   
  System.out.println(" \n The difference of firstnumber " +number1 +" and second number " +number2 + 
		" is " + difference);
  
  System.out.println(" \n The product of firstnumber " +number1 +" and secondnumber " +number2 + 
		  " is "+ product  );
  
  System.out.println("\n The quotient of firstnumber " +number1 + " and secondnumber " +number2 + 
		  " is " + quotient);
  
  System.out.println("\n The remainder of firstnumber " +number1 + " and secondnumber " +number2 + 
		  " is " + remainder);
  
  System.out.println("\n The square root of firstnumber " +number1+ " is : " +root);
  
  System.out.println("\n The cube root of secondnumber " +number2+ " is :"  +croot);
	}
}

  
		

		

		
		
	


