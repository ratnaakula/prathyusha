import java.util.Scanner;
public class Problem4_8 {
	public static void main(String[] args)
	{
		Scanner input = new Scanner(System.in);
		//Prompt the user to enter an ASCII code
		// an integer between 0 and 127
		System.out.print(" Enter an ASCII code:");
		int i = input.nextInt();
		System.out.println(" The character for ASCII code" +i +" is "+ (char)i);
		
	}

}
