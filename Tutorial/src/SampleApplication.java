import java.util.Scanner;

public class SampleApplication
{

	public static void main(String[] args)
	{
		
	
		// declare a variable count of int data type
		int count = 30;

		// declare and initialize a value to the variable of double data type
		double amount = 100.50;

		String txt = "Happy Birthday";

		String text = " ";

		String name = "Prathyusha";

		String output = txt + text + name;
		
		System.out.println(output);
		
		System.out.println("Hello" + "   " + "World");
		
		System.out.println("The amount is " +amount);
		
		while(count <= 45) {
			
			System.out.println("Java Programming " + count);
		
		     count ++;

	}
		for(int i=0; i < 10; i++) {
			System.out.printf("Computer %d\n",
					i);
		}
		
	}
}

