import java.util.Scanner;
public class Problem4_11 {
public static void main(String[] args)
{
	Scanner input = new Scanner(System.in);
	//Prompt the user to enter a decimal value 0 to 15
	System.out.print(" Enter a  decimal value between 0 to 15 :" );
	int decimalValue = input.nextInt();
	//Display its corresponding hex number
	if(decimalValue >=0 && decimalValue <=9)
		System.out.println(" The hex value is :" +decimalValue);
	else if(decimalValue > 9 && decimalValue <=15)
		System.out.println(" The hex value is : " +(char)(decimalValue + 'A' - 10));
	else 
	System.out.println( +decimalValue + "  is  an invalid output.");
		
}
}
