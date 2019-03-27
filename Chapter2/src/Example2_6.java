import java.util.Scanner;
public class Example2_6 // sum the digits in an integer
{
public static void main(String[] args)
{
	Scanner input= new Scanner(System.in);
	System.out.print(" Enter a number between 0 and 1000 : ");
	 int number = input.nextInt();
	 int firstDigit = number % 10;
	 int remainingNumber = number / 10;
	 int secondDigit = remainingNumber %10;
	 remainingNumber = number/10;
	 int thirdDigit = remainingNumber % 10;
	 int sum = firstDigit + secondDigit + thirdDigit;
	 System.out.println("The sum of the digits in "  +number +" is " +sum );
	
}
}
