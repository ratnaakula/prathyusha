import java.util.Scanner;

public class Temp_Main
{
	/** Main method */
	
	public static void main(String[] args) {
		
		Temperature14  tempDegree = new Temperature14();
		tempDegree.setTemp1(-10);
		tempDegree.setTemp2(150);
		boolean temp = tempDegree.icyHot(tempDegree.getTemp1(), tempDegree.getTemp2());
		System.out.println("The result of the temperature condition is " +temp);
		
	}
}
