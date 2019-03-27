/**
 * 
 * @author prathyusha
 *
 */
import java.util.Scanner;

public class CaseStatement
{

	public static void main(String[] args) {
		
		//Create a Scanner object
		Scanner input = new Scanner(System.in);
		
		//Prompt the user to enter a name
		System.out.print("Enter a name: ");
		int name = input.nextInt();
		switch(name) {
			case 0 : System.out.println("Venkata");break;
			case 1 : System.out.println("Raj");break;
			case 2 : System.out.println("Ratna");break;
			case 3 : System.out.println("Prathyusha");break;
		}
	}
}
