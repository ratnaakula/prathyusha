import java.util.Scanner;
public class Example2_5// Financial application: Calculation tips
{
public static void main(String[] args)
{
 
	Scanner input = new Scanner(System.in);
	System.out.print("Enter the subtotal and a gratuity rate:");
	double subtotal = input.nextDouble();
	double gratuityRate = input.nextDouble();
   double gratuity = subtotal*(gratuityRate/100) ;
   double total   = subtotal+ gratuity;
	System.out.println("The gratuity is $ " +gratuity +" and total is $ " +total);
}
}

