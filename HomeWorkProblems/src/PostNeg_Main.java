import java.util.Scanner;

public class PostNeg_Main
{
/** Main method */
public static void main(String[] args) {
	 PostNegt result = new PostNegt();
	 result.setA(7);
	 result.setB(-2);
	 result.setNegative(true);
	 boolean result1 = result.posNeg(result.getA(), result.getB(), result.isNegative());
	 System.out.println("The outcome of " +result.getA() + " and " +result.getB() + ""
	 		+ " of boolean negative " + result.isNegative() + " is " +result1);
	 
}
	
}
