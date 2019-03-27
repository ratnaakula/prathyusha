import java.util.Scanner;
public class Program3_34 //Geomentry : point on line segment
{
 public static void main(String[ ] args)
 {
	 Scanner input =new Scanner(System.in);
	// prompt the user to enter three points for p0,p1,and p2
			System.out.print(" Enter three points for p0,p1 ,and p2 :");
			double x0 = input.nextDouble();
			double y0 = input.nextDouble();
			double x1 = input.nextDouble();
			double y1 = input.nextDouble();
			double x2 = input.nextDouble();
			double y2 = input.nextDouble();
			// Calculate point position
			 double slope= ((y1 - y0)/(x1 - x0));
			 double y_Intercept = y0 - (slope * x0);
			 double calculatedY = slope * x2 + y_Intercept;
			 if(calculatedY == y2)
			 {
				 System.out.println("(" +x2 + "," + y2 + ")" +" is on the line segment from " + 
			 "(" +x0 + "," +y0 + ") to (" +x1 + " ," +y1 +")");
			 }
			 else
			 {
				 System.out.println("(" +x2 + "," + y2 + ")" +" is  not on the line segment from " +
			 "(" +x0 + "," +y0 + ")to (" +x1 + " ," +y1 +")");
			 }
			 
 }
 }
                                                                                                                                                                                                                                         