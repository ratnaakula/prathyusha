import java.util.Scanner;
public class Program3_25 // Geometry : intersecting point
{
 public static void main(String[] args)
 {
	 Scanner input = new Scanner(System.in);

	 // Prompt the user to enter the values on lines
	 System.out.print(" Enter x1,y1,x2,y2,x3,y3,x4,y4 :");
		double x1 = input.nextDouble();
		double y1 = input.nextDouble();
		double x2 = input.nextDouble();
		double y2 = input.nextDouble();
		double x3 = input.nextDouble();
		double y3 = input.nextDouble();
		double x4 = input.nextDouble();
		double y4 = input.nextDouble();
		
		// Calculate the intersecting point
		// Get a,b,c,d,e,f
		// use cramer's rule to solve the problem
		// ax+by =e, cx+dy=f >> x = ed - bf/ad-bc , y = af-ec/ad-bc
		double a = y1 - y2;
		double b = -1 * (x1 - x2);
		double c = y3 - y4;
		double d = -1 * (x3 - x4);
		double e = (y1 - y2) * x1 - (x1 - x2) * y1;
		double f = (y3 - y4) * x3 - (x3 - x4) * y3;
		if ((a * d - b * c) == 0) 
		{
			System.out.println(" The two lines are parallel ");
		}
		else
		{
			double x = (e * d - b * f) / (a * d - b * c);
			double y = (a * f - e * c) / (a * d - b * c);
		//	double rounded = Math.round(x *100)/100.0;

			//System.out.println(" The intersecting point is at (" + Math.round(x * 100)/100.0+ "," + Math.round(+ y * 100 ) / 100.0 +" )");
			System.out.printf("The intersecting point is at  ( %.5f , %.5f ) " , x ,y);
			//System.out.printf(", %4.4f )",y);
	}
}
} 
		 

	 
	
 