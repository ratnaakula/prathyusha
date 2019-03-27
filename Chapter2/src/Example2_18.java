import java.util.Scanner;

public class Example2_18 //cast floating point numbers into integers
{
 public static void main(String[] args)
 {
	 float a,b;
	 System.out.println("a        b       pow(a,b) " );
	 a = 1 ;
	 b = 2 ;
	 System.out.println((int)a +"        "+(int)b +"        "+(int)Math.pow(a,b));
	 a++;
	 b++;
	 System.out.println((int)a +"        "+(int)b +"        "+(int)Math.pow(a,b));
	 a++;
	 b++;
	 System.out.println((int)a +"        "+(int)b +"        "+(int)Math.pow(a,b));
	 a++;
	 b++;
	 System.out.println((int)a +"        "+(int)b +"        "+(int)Math.pow(a,b));
	 a++;
	 b++;
	 System.out.println((int)a +"        "+(int)b +"        "+(int)Math.pow(a,b)); 
 }
}
