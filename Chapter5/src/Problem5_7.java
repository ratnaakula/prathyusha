import java.util.Scanner;
public class Problem5_7 {
	public static void main(String[] args) {
		 int tuition = 10000;
		 int totalCost = 0 ;
		 int tuitionInTenthYear = 0;
	
	   //double interestRate = 0.05;
	   for(int year = 1; year <= 14; year ++ ) {
		   tuition +=  tuition * 0.05;
		   if(year > 10)//Test for after 10 years
			   totalCost += tuition;
		   //Cost of tuition in 10 years
		   if(year == 10)
			   tuitionInTenthYear = tuition;
		   
	   }
	   //Display the cost of tuition in ten years
	   
	   System.out.println(" Tuition in ten years $ " +tuitionInTenthYear);
	   //Display the cost of four years worth of tuition after the tenth year
	   System.out.println(" Total cost for four years worth of tuition" +
	   " after the tenth year:$" +totalCost);
	}

}
/**(Financial application: compute future tuition)
Suppose that the tuition for a university is $10,000 this year and increases 5% every year.
In one year, the tuition will be $10,500. Write a program that computes the tuition in ten years and 
the total cost of four years� worth of tuition after the tenth year.*/