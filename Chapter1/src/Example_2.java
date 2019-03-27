import java.util.Scanner;
public class Example_2 //Subtraction quiz
{
public static void main(String[] args)
   // 1.Generate two random  single-digit numbers
{
	int number1  = (int)(Math.random() *10);
	int number2 = (int)(Math.random() *10);
	// 2.If (number1 < number2),swap number1 with number2
	if(number1 < number2)
	{
		int temp = number1;
		number1 = number2;
		number2 = temp;
	}
	// 3.prompt the student to answer " what is number1 - number2?"
	System.out.print(" what is "  + number1 +" - " +number2 + " ?");
	Scanner input = new Scanner(System.in);
	int answer = input.nextInt();
	input.close();
	// Grade the answer and display the result
	if (number1 - number2 == answer)
		System.out.println(" your answer is correct");
	else
	{
		System.out.println(" your answer is wrong");
	    System.out.println(number1 + 
	    		" - " + number2 + " should be "  + (number1 - number2));
	}
}
}