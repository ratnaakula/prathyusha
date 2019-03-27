import java.util.Scanner;

public class Factorial
{

public static void main(String[] args) {
	
	Scanner type = new Scanner(System.in);
	
	System.out.print("Enter a number:");
	
	int number = type.nextInt();// nextInt() is a method of Scanner class which converts the data value from keyboard in to int
	int factor = 1;
	 while(number!= 0) {// or we can write (n!= 0){
		factor = factor * number;
		number--;
	 }
	 System.out.println("The factorial of number "+ number +" is " +factor);
	
}
}
	/*for(int i = 1; i <= number ; i++) {
		factor = factor * i ;
		
	}
	System.out.println("The output of given number is " +factor);
	
}
}*/