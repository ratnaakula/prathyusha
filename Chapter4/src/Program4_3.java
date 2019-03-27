import java.util.Scanner;

public class Program4_3 // Geography: estimated areas
{
	public static void main(String[] args) {
		final double AVERAGE_EARTH_RADIUS = 6371.01;
		// The latitude is 33.7489954 and longitude is -84.38734 for atlanta, Georgia
		double atlantaGeox1 = 33.7489954;
		double atlantaGeoy1 = -84.38734;
		// The latitude is 28.538336 and longitude is -81.379234 for orlando, Florida
		double orlandoFlorx2 = 28.538336;
		double orlandoFlory2 = -81.379234;
		// The latitude is 32.0809 and longitude is -81.0912 for savannah , Georgia
		double savannahGeox3 = 32.0809;
		double savannahGeoy3 = -81.0912;
		// The latitiude is 35.2271 and longitude is -80.8431 for charlotte ,
		// Northcarolina
		double charlotteNcx4 = 35.2271;
		double charlotteNcy4 = -80.8431;
		// Calculating 1st triangle ; p1, p2 and p3 i.e (x1, y1), (x2, y2) and (x3, y3)
		double side1 = Math.sqrt(Math.pow(orlandoFlorx2 - atlantaGeox1, 2) + Math.pow(orlandoFlory2 - atlantaGeoy1, 2));
		double side2 = Math.sqrt(Math.pow(savannahGeox3 - orlandoFlorx2, 2) + Math.pow(savannahGeoy3 - orlandoFlory2, 2));
		double side3 = Math.sqrt(Math.pow(savannahGeox3 - atlantaGeox1, 2) + Math.pow(savannahGeoy3 - atlantaGeoy1, 2));
		// calculate area of 1st triangle
		double s = side1 + side2 + side3;
		double area = Math.sqrt(s * (s - side1) * (s - side2) * (s - side3));
		// Calculating 2nd triangle ; p3 , p4 and p1 i.e (x3, y3), (x4, y4) and (x1, y1)
		side1 = Math.sqrt(Math.pow(charlotteNcx4 - savannahGeox3, 2) + Math.pow(charlotteNcy4 - savannahGeoy3, 2));
		side2 = Math.sqrt(Math.pow(atlantaGeox1 - charlotteNcx4, 2) + Math.pow(atlantaGeoy1 - charlotteNcy4, 2));
		side3 = Math.sqrt(Math.pow(savannahGeox3 - atlantaGeox1, 2) + Math.pow(savannahGeoy3 - atlantaGeoy1, 2));
		// calculate area of 2nd triangle
		s = side1 + side2 + side3 / 3;
		area = Math.sqrt(s * (s - side1) + (s - side2) + (s - side3)) + area;
		System.out.println(" The area enclosed by 4 cities is  ," + area + " km ");

	}
}