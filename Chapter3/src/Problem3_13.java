
/* Marginal Tax Rate 
 * Single Married Filing Jointly or Qualifying Widow(er) Married Filing Separately Head of Household 
10%    $0 – $8,350          $0 – $16,700        $0 – $8,350              $0 – $11,950 
15% $8,351 – $33,950     $16,701 – $67,900    $8,351 – $33,950         $11,951 – $45,500
25% $33,951 – $82,250   $67,901 – $137,050  $33,951 – $68,525       $45,501 – $117,450 
28%  $82,251 – $171,550  $137,051 – $208,850  $68,526 – $104,425     $117,451 – $190,200 
33%  $171,551 – $372,950  $208,851 – $372,950 $104,426 – $186,475      $190,201 – $372,950 
35%  $372,951+               $372,951+          $186,476+            $372,951+            
Use multi-way if-else statements
You are to write a program to compute personal income tax. 
Your program should prompt the user to enter the filing status and taxable income and compute the tax
. Enter 0 for single filers, 1 for married filing jointly or qualified widow(er), 
2 for married filing separately, and 3 for head of household.*/
import java.util.Scanner;

public class Problem3_13 {
	public static final int firstSingleBracket = 8350;
	public static final int secondSingleBracket = 33950;
	public static final int thirdSingleBracket = 82250;
	public static final int fourthSingleBracket = 171550;
	public static final int fifthSingleBracket = 372950;

	public static final int firstMarriedBracket = 16700;
	public static final int secondMarriedBracket = 67900;
	public static final int thirdMarriedBracket = 137050;
	public static final int fourthMarriedBracket = 208850;
	public static final int fifthMarriedBracket = 372950;

	public static final int firstMarriedSepBracket = 8350;
	public static final int secondMarriedSepBracket = 33950;
	public static final int thirdMarriedSepBracket = 68525;
	public static final int fourthMarriedSepBracket = 104425;
	public static final int fifthMarriedSepBracket = 186475;

	public static final int firstHoHBracket = 11950;
	public static final int secondHoHBracket = 45500;
	public static final int thirdHoHBracket = 117450;
	public static final int fourthHoHBracket = 190200;
	public static final int fifthHoHBracket = 372950;

	public static final float firstBracketPercentage = 0.10f;
	public static final float secondBracketPercentage = 0.15f;
	public static final float thirdBracketPercentage = 0.25f;
	public static final float fourthBracketPercentage = 0.28f;
	public static final float fifthBracketPercentage = 0.33f;
	public static final float sixthBracketPercentage = 0.35f;

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		// Prompt the user to enter filing status
		System.out.print("(0 - Single filers \n " + 
		"1 - Married filling jointly or Qualified widow(er) \n "
				+ "2 - Married seperately \n" + "3 - Head of household )\n Enter the filing status: ");
		int status = input.nextInt();

		System.out.print(" Enter the amount :");
		double income = input.nextDouble();
		double tax = 0;
		if (status == 0) {
			tax = calculateSingleFilersTaxes(income);// using switch statement
		} else if (status == 1) {                    // switch(status)
			                                                                                                                     //case 0 : tax = calculateSingleFilersTaxes(income);
			tax = calculateMarriedFilerTaxes(income);
		} else if (status == 2) {
			tax = calculateMarriedSepTaxes(income);
		} else if (status == 3) {
			tax = calculateHoHTaxes(income);

		} else {
			System.out.println("Invalid input");
			System.exit(0);
		}
		System.out.printf(" Tax is %.1f\n " , tax);
	}

	private static double calculateSingleFilersTaxes(double income) {
		double tax;
		if (income <= firstSingleBracket)

			tax = income * firstBracketPercentage;

		else if (income <= secondSingleBracket)

			tax = firstSingleBracket * firstBracketPercentage + 
			(income - firstSingleBracket) * secondBracketPercentage;

		else if (income <= thirdSingleBracket)

			tax = firstSingleBracket * firstBracketPercentage
					+ (secondSingleBracket - firstSingleBracket) * secondBracketPercentage
					+ (income - secondSingleBracket) * thirdBracketPercentage;

		else if (income <= fourthSingleBracket)

			tax = firstSingleBracket * firstBracketPercentage
					+ (secondSingleBracket - firstSingleBracket) * secondBracketPercentage
					+ (thirdSingleBracket - secondSingleBracket) * thirdBracketPercentage
					+ (income - thirdSingleBracket) * fourthBracketPercentage;

		else if (income <= fifthSingleBracket)

			tax = firstSingleBracket * firstBracketPercentage
					+ (secondSingleBracket - firstSingleBracket) * secondBracketPercentage
					+ (thirdSingleBracket - secondSingleBracket) * thirdBracketPercentage
					+ (fourthSingleBracket - thirdSingleBracket) * fourthBracketPercentage
					+ (income - fifthSingleBracket) * fifthBracketPercentage;

		else

			tax = firstSingleBracket * firstBracketPercentage
					+ (secondSingleBracket - firstSingleBracket) * secondBracketPercentage
					+ (thirdSingleBracket - secondSingleBracket) * thirdBracketPercentage
					+ (fourthSingleBracket - thirdSingleBracket) * fourthBracketPercentage
					+ (fifthSingleBracket - fourthSingleBracket) * fifthBracketPercentage
					+ (income - fifthSingleBracket) * sixthBracketPercentage;
		return tax;

	}

	private static double calculateMarriedFilerTaxes(double income) {
		double tax;
		if (income <= firstMarriedBracket)

			tax = income * firstBracketPercentage;

		else if (income <= secondMarriedBracket)

			tax = firstMarriedBracket * firstBracketPercentage
					+ (income - firstMarriedBracket) * secondBracketPercentage;

		else if (income <= thirdMarriedBracket)
			
			tax = firstMarriedBracket * firstBracketPercentage
					+ (secondMarriedBracket - firstMarriedBracket) * secondBracketPercentage
					+ (income - secondMarriedBracket) * thirdBracketPercentage;
		
		else if(income <= fourthMarriedBracket)
			
			tax = firstMarriedBracket * firstBracketPercentage
			+ (secondMarriedBracket - firstMarriedBracket) * secondBracketPercentage +
			  (thirdMarriedBracket - secondMarriedBracket) * thirdBracketPercentage +
			  (income -thirdMarriedBracket) * fourthBracketPercentage;
		
		else if( income <= fifthMarriedBracket)
			
			tax = firstMarriedBracket * firstBracketPercentage
			+ (secondMarriedBracket - firstMarriedBracket) * secondBracketPercentage +
			  (thirdMarriedBracket - secondMarriedBracket) * thirdBracketPercentage + 
			  (fourthMarriedBracket - thirdMarriedBracket) * fourthBracketPercentage +
			  (income - fourthMarriedBracket) * fifthBracketPercentage;
		else 
			 
			tax = firstMarriedBracket * firstBracketPercentage
			+ (secondMarriedBracket - firstMarriedBracket) * secondBracketPercentage +
			  (thirdMarriedBracket - secondMarriedBracket) * thirdBracketPercentage + 
			  (fourthMarriedBracket - thirdMarriedBracket) * fourthBracketPercentage +
			  (fifthMarriedBracket - fourthMarriedBracket) * fifthBracketPercentage +
			  (income - fifthMarriedBracket) * sixthBracketPercentage ;
		
		return tax;
		

	}
	private static double calculateMarriedSepTaxes(double income) {
		double tax;
		if (income <= firstMarriedBracket)

			tax = income * firstBracketPercentage;

		else if (income <= secondMarriedBracket)

			tax = firstMarriedBracket * firstBracketPercentage
					+ (income - firstMarriedBracket) * secondBracketPercentage;

		else if (income <= thirdMarriedBracket)
			
			tax = firstMarriedBracket * firstBracketPercentage
					+ (secondMarriedBracket - firstMarriedBracket) * secondBracketPercentage
					+ (income - secondMarriedBracket) * thirdBracketPercentage;
		
		else if(income <= fourthMarriedBracket)
			
			tax = firstMarriedBracket * firstBracketPercentage
			+ (secondMarriedBracket - firstMarriedBracket) * secondBracketPercentage +
			  (thirdMarriedBracket - secondMarriedBracket) * thirdBracketPercentage +
			  (income -thirdMarriedBracket) * fourthBracketPercentage;
		
		else if( income <= fifthMarriedBracket)
			
			tax = firstMarriedBracket * firstBracketPercentage
			+ (secondMarriedBracket - firstMarriedBracket) * secondBracketPercentage +
			  (thirdMarriedBracket - secondMarriedBracket) * thirdBracketPercentage + 
			  (fourthMarriedBracket - thirdMarriedBracket) * fourthBracketPercentage +
			  (income - fourthMarriedBracket) * fifthBracketPercentage;
		else 
			 
			tax = firstMarriedBracket * firstBracketPercentage
			+ (secondMarriedBracket - firstMarriedBracket) * secondBracketPercentage +
			  (thirdMarriedBracket - secondMarriedBracket) * thirdBracketPercentage + 
			  (fourthMarriedBracket - thirdMarriedBracket) * fourthBracketPercentage +
			  (fifthMarriedBracket - fourthMarriedBracket) * fifthBracketPercentage +
			  (income - fifthMarriedBracket) * sixthBracketPercentage ;
		
		return tax;
		

	}
	private static double calculateHoHTaxes(double income) {
		
		double tax;
		if (income <= firstHoHBracket)

			tax = income * firstBracketPercentage;

		else if (income <= secondHoHBracket)

			tax = firstHoHBracket * firstBracketPercentage
					+ (income - firstHoHBracket) * secondBracketPercentage;

		else if(income <= thirdHoHBracket)
			
			tax = firstHoHBracket * firstBracketPercentage +
			(secondHoHBracket - firstHoHBracket) * secondBracketPercentage + 
			(income - secondHoHBracket) * thirdBracketPercentage;
		
		else if (income <= fourthHoHBracket)
			
			tax = firstHoHBracket * firstBracketPercentage +
			(secondHoHBracket - firstHoHBracket) * secondBracketPercentage + 
			(thirdHoHBracket -secondHoHBracket) * thirdBracketPercentage +
			(income- thirdHoHBracket ) * fourthBracketPercentage;
		
		else if(income <= fifthHoHBracket)
			
			tax = firstHoHBracket * firstBracketPercentage +
			(secondHoHBracket - firstHoHBracket) * secondBracketPercentage + 
			(thirdHoHBracket -secondHoHBracket) * thirdBracketPercentage +
			(fourthHoHBracket - thirdHoHBracket) * fourthBracketPercentage +
			(income - fourthHoHBracket) * fifthBracketPercentage;
		
		else
			tax = firstHoHBracket * firstBracketPercentage +
			(secondHoHBracket - firstHoHBracket) * secondBracketPercentage + 
			(thirdHoHBracket -secondHoHBracket) * thirdBracketPercentage +
			(fourthHoHBracket - thirdHoHBracket) * fourthBracketPercentage +
			(fifthHoHBracket - fourthHoHBracket) * fifthBracketPercentage +
			(income - fifthHoHBracket) * sixthBracketPercentage;
		
		 return tax;
		
		

	}
	

}


