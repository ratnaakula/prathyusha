import java.util.Scanner;
public class DoubtProgram 
{
public static void main(String[] args)
{
	Scanner input = new Scanner(System.in);
	System.out.print(" Enter an integer: ");
	int value = input.nextInt();
	System.out.println(" The value is " +value);
	System.out.print(" Enter a line : \n " );
	String line = input.nextLine();
	System.out.println(" The line is " + line);
}
}
 // input.nextLine() is used after input.nextInt().Don't use a line based input after a token based input.