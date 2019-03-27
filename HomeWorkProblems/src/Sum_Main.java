import java.util.Scanner;

public class Sum_Main{
	public static void main(String[] args) {
	Sum sum1 = new Sum();
	sum1.setA(10);
	sum1.setB(20);
	int sumResult = sum1.sumDouble(sum1.getA(), sum1.getB());
	System.out.println("The sum of two numbers is " +sumResult);
	
}
}