import java.util.Scanner;
public class Problem4_6 // random points on a circle
{
      public static void main(String[] args)
		{
    	   final double RADIUS = 40;
			System.out.println(" The three random points are " );
			//Generate random angle in radians between 0 and 2PI
			double angle = Math.random() * 360;
			double x = RADIUS * Math.cos(angle * Math.PI / 180);
			double y = RADIUS * Math.sin(angle * Math.PI / 180);
			System.out.println("(" +x  +"," +y +  ")");
			angle = Math.random() * 360;
			x = RADIUS * Math.cos(angle * Math.PI / 180);
			y  =  RADIUS * Math.sin(angle * Math.PI / 180);
			System.out.println("(" +x +"," +y +")");
			
			
			
		}			
}
