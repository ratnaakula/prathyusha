import java.util.Scanner;

public class SumEquals_Main
{
	/** Main method */
	
	public static void main(String[] args) {
		SumEquals value = new SumEquals();
		value.setA(30);
		value.setB(20);
	boolean	resultOfVal = value.makes10(value.getA(), value.getB());
		System.out.println("The result of two int values is " +resultOfVal);
	}

}
