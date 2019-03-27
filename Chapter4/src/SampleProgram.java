import java.util.Scanner;
public class SampleProgram //Compute angles
{
	public static void main(String[] args)
	{
		Scanner input = new Scanner(System.in);
		// prompt the user to enter three points 
		System.out.print(" Enter three  coordinate points of  a triangle  x1, y1, x2, y2, x3, y3 : ");
		double x1 = input.nextDouble();
		double y1= input.nextDouble();
		double x2 = input.nextDouble();
		double y2 = input.nextDouble();
		double x3 = input.nextDouble();
		double y3 = input.nextDouble();
		// Compute three sides
		// By using distance formula between two points(x2, y2) and (x3, y3)
		double a = Math.sqrt((x3-x2) * (x3-x2) + (y3-y2) * (y3-y2));
		double b = Math.sqrt((x3-x1) * (x3-x1) + (y3-y1) * (y3-y1));
		double c = Math.sqrt((x2-x1) * (x2-x1) + (y2-y1) * (y2-y1));
		//Compute three angles
		double A = Math.toDegrees(Math.acos((a * a - b * b - c * c) / ( -2  * b * c)));
		double B = Math.toDegrees(Math.acos((b * b - c * c - a * a) / ( -2  * a * c)));
		double C = Math.toDegrees(Math.acos((c * c - b * b - a * a) / ( -2  * b * a)));
		//Display results
		System.out.println(" The three angles are " + Math.round(A * 100 )/ 100.0 + "  " + Math.round( B * 100 )/100.0 + "  " +
		 Math.round( C * 100 )/ 100.0);
		
	}

}


/*import java.util.Scanner;
public class SampleProgram //AlphabeticalOrderOfCities
{
	public static void main(String[] args)
	{
		Scanner input = new Scanner(System.in);
		System.out.print(" Enter the first city :");
		String city1 = input.nextLine();
		System.out.print(" Enter the second city : ");
		String city2 = input.nextLine();
		if (city1.compareTo(city2)<0)
			System.out.println(" The cities in Alphabetical order are "  + city1 + "  "+city2);
		else 
			System.out.println(" The cities in Alphabetical order are  " +city2 + "  " +city1);
	}
}*/








