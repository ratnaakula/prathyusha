import java.util.Scanner;

public class Maximum15_Main
{

	public static void main(String[] args)
	{

		Maximum15 maxValue = new Maximum15();
		maxValue.setA(10);
		maxValue.setB(20);
		boolean maxResult = maxValue.max1020(maxValue.getA(), maxValue.getB());
		System.out.println("The maximum values of two integers " +maxValue.getA() + " and " +maxValue.getB() + " is " + maxResult);

	}
}
