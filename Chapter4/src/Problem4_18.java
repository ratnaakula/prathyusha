import java.util.Scanner;
public class Problem4_18 {
	public static void main(String[] args)
	{
		Scanner input = new Scanner(System.in);
		//Prompt the user to enter two characters
		System.out.print("Enter two characters :");
		String s = input.nextLine();
		// Extract major and status  from string
		char m = Character.toUpperCase(s.charAt(0));
		char status = s.charAt(1);
	
	
	switch(m)
	{
	case 'M' : System.out.print("Mathematics");
	break;
	case 'C' :System.out.print("Computer Science ");
	break;
	case 'I' : System.out.print("Information Technology ");
	break;
	default : System.out.print("Invalid input ");
	
	}
	switch(status)
	{
	case '1' : System.out.println("Freshman");
	break;
	case '2' : System.out.println("Sophomore");
	break;
	case '3' : System.out.println("Junior");
	break;
	case '4' : System.out.println("Senior");
	break;
	default: System.out.println("Invalid Input");
	}
}
}