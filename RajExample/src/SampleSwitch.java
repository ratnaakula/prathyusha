import java.util.Scanner;

public class SampleSwitch
{
   public static void main(String[] args) 
	{

		Scanner input = new Scanner(System.in);
		System.out.print(" Enter number of day :");
		int day = input.nextInt();

		switch (day) {
		case 0:
			System.out.print(" Sunday ");
			break;
		case 1:
			System.out.println(" Monday ");
		case 2:
			System.out.print(" Tuesday ");
			break;
		case 3:
			System.out.print(" Wednesday ");
			break;
		case 4:
			System.out.print(" Thursday ");
			break;
		case 5:
			System.out.print(" Friday ");
			break;
		case 6:
			System.out.print(" Saturday ");
			break;
		}

	}
}