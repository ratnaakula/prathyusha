import java.util.Scanner;
public class Problem3_16 // Random point of rectangle
{
 public static void main(String[] args)
 {
	 Scanner input = new Scanner(System.in);
	 int width = (int)((Math.random() *1000 % 100 )-50);
	 int height = (int)((Math.random()*1000 % 200)-100);
	 // Display coordinate
	 System.out.println(" Random coordinate in a rectangle centered at (0,0)");
	 System.out.println(" with width 100 and height 200 :(" +width + "," + height + ")");
	 
 }
}
