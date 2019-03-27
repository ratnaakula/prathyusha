import java.util.Scanner;
public class DecToHex {
public static void main(String[] args) {
	Scanner input = new Scanner(System.in);
	System.out.print(" Enter a decimal integer:");
	int decimal = input.nextInt();
	String hex= " " ;
	while(decimal != 0) 
	//Convert decimal to hex
		
	{
		int hexValue = decimal % 16;
		//Convert a decimal value to hex
		char hexDigit = (hexValue <=  9 &&  hexValue >= 0) ? 
				(char)(hexValue + '0') : (char)(hexValue - 10+'A');
				hex = hexDigit + hex;
				decimal = decimal/ 16;
	}
				System.out.println(" The decimal integer in hexDecimal vlaue is : "+hex);

	
}
}
