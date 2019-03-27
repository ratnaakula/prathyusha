import java.util.Scanner;

public class Number_Main
{
/** Main method */
	public static void main(String[] args) {
		
		Number value = new Number();
		value.setN(98);
		 boolean result = value.nearHundred(value.getN());
		 System.out.println(value.calculateSomething(value.getN()));
		 System.out.println("The outcome of the number is " +result);
		 
	}
}
