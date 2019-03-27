import java.util.Scanner;
public class Test1 {
public static void main(String[] args)
{
	Scanner input = new Scanner(System.in);
	int sum = 0 ;
	System.out.println(" Enter an integer " + "( the input ends if it is  0)");
	int number = input.nextInt();
	
	do {
		sum += number;
		System.out.println(" Enter an integer " + "( the input ends if it is  0)");
		number = input.nextInt();
		//sum += number;
	} while(number !=0);
	System.out.println(" The number is " +sum);
}
}
