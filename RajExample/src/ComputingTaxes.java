import java.util.Scanner;

public class ComputingTaxes {
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

		// prompt the user to enter filing status
		System.out.print("0 - Single Filer \n" + "1 - Married Jointly or qualifying widow(er) \n"
				+ "2 - Married Seperately \n" + "3 - Head of Household \n" + "Enter the filing status:");
		int status = input.nextInt();

		// prompt the user to enter taxable income
		System.out.print("Enter the taxable income : ");
		double income = input.nextDouble();

		// compute tax
		double tax = 0;
		if (status == 0) // compute tax for single filers
		{
			tax = calculateSingleFilerTaxes(income);
		} else if (status == 1)// compute tax for married file jointly or qualifying widow(er)
		{
			tax = calculateMarriedFilerTaxes(income);
		} else if (status == 2)// compute tax for married seperately
		{
			tax = calculateMarriedSepTaxes(income);
		} else if (status == 3)// compute tax for head of household
		{
			tax = calculateHoHTaxes(income);
		} else {
			System.out.println("Error : invalid status");
			System.exit(1);
		}
		System.out.println("Tax is : " + tax);
	}

	private static double calculateHoHTaxes(double income) {
		double tax;
		if (income <= firstHoHBracket)
			tax = income * firstBracketPercentage;
		else if (income <= secondHoHBracket)
			tax = firstHoHBracket * firstBracketPercentage + (income - firstHoHBracket) * secondBracketPercentage;
		else if (income <= thirdHoHBracket)
			tax = firstHoHBracket * firstBracketPercentage
					+ (secondHoHBracket - firstHoHBracket) * secondBracketPercentage
					+ (income - secondHoHBracket) * thirdBracketPercentage;
		else if (income <= fourthHoHBracket)
			tax = firstHoHBracket * firstBracketPercentage
					+ (secondHoHBracket - firstHoHBracket) * secondBracketPercentage
					+ (thirdHoHBracket - secondHoHBracket) * thirdBracketPercentage
					+ (income - thirdHoHBracket) * fourthBracketPercentage;
		else if (income <= fifthHoHBracket)
			tax = firstHoHBracket * firstBracketPercentage
					+ (secondHoHBracket - firstHoHBracket) * secondBracketPercentage
					+ (thirdHoHBracket - secondHoHBracket) * thirdBracketPercentage
					+ (fourthHoHBracket - thirdHoHBracket) * fourthBracketPercentage
					+ (income - fourthHoHBracket) * fifthBracketPercentage;
		else
			tax = firstHoHBracket * firstBracketPercentage
					+ (secondHoHBracket - firstHoHBracket) * secondBracketPercentage
					+ (thirdHoHBracket - secondHoHBracket) * thirdBracketPercentage
					+ (fourthHoHBracket - thirdHoHBracket) * fourthBracketPercentage
					+ (fifthHoHBracket - fourthHoHBracket) * fifthBracketPercentage
					+ (income - fifthHoHBracket) * sixthBracketPercentage;
		return tax;
	}

	private static double calculateMarriedSepTaxes(double income) {
		double tax;
		if (income <= firstMarriedSepBracket)
			tax = income * firstBracketPercentage;
		else if (income <= secondMarriedSepBracket)
			tax = firstMarriedSepBracket * firstBracketPercentage
					+ (income - firstMarriedSepBracket) * secondBracketPercentage;
		else if (income <= thirdMarriedSepBracket)
			tax = firstMarriedSepBracket * firstBracketPercentage
					+ (secondMarriedSepBracket - firstMarriedSepBracket) * secondBracketPercentage
					+ (income - secondMarriedSepBracket) * thirdBracketPercentage;
		else if (income <= fourthMarriedSepBracket)
			tax = firstMarriedSepBracket * firstBracketPercentage
					+ (secondMarriedSepBracket - firstMarriedSepBracket) * secondBracketPercentage
					+ (thirdMarriedSepBracket - secondMarriedSepBracket) * thirdBracketPercentage
					+ (income - thirdMarriedSepBracket) * fourthBracketPercentage;
		else if (income <= fifthMarriedSepBracket)
			tax = firstMarriedSepBracket * firstBracketPercentage
					+ (secondMarriedSepBracket - firstMarriedSepBracket) * secondBracketPercentage
					+ (thirdMarriedSepBracket - secondMarriedSepBracket) * thirdBracketPercentage
					+ (fourthMarriedSepBracket - thirdMarriedSepBracket) * fourthBracketPercentage
					+ (income - fourthMarriedSepBracket) * fifthBracketPercentage;
		else
			tax = firstMarriedSepBracket * firstBracketPercentage
					+ (secondMarriedSepBracket - firstMarriedSepBracket) * secondBracketPercentage
					+ (thirdMarriedSepBracket - secondMarriedSepBracket) * thirdBracketPercentage
					+ (fourthMarriedSepBracket - thirdMarriedSepBracket) * fourthBracketPercentage
					+ (fifthMarriedSepBracket - fourthMarriedSepBracket) * fifthBracketPercentage
					+ (income - fifthMarriedSepBracket) * sixthBracketPercentage;
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
		else if (income <= fourthMarriedBracket)
			tax = firstMarriedBracket * firstBracketPercentage
					+ (secondMarriedBracket - firstMarriedBracket) * secondBracketPercentage
					+ (thirdMarriedBracket - secondMarriedBracket) * thirdBracketPercentage
					+ (income - thirdMarriedBracket) * fourthBracketPercentage;
		else if (income <= fifthMarriedBracket)
			tax = firstMarriedBracket * firstBracketPercentage
					+ (secondMarriedBracket - firstMarriedBracket) * secondBracketPercentage
					+ (thirdMarriedBracket - secondMarriedBracket) * thirdBracketPercentage
					+ (fourthMarriedBracket - thirdMarriedBracket) * fourthBracketPercentage
					+ (income - fourthMarriedBracket) * fifthBracketPercentage;
		else
			
			tax = firstMarriedBracket * firstBracketPercentage
					+ (secondMarriedBracket - firstMarriedBracket) * secondBracketPercentage
					+ (thirdMarriedBracket - secondMarriedBracket) * thirdBracketPercentage
					+ (fourthMarriedBracket - thirdMarriedBracket) * fourthBracketPercentage
					+ (fourthMarriedBracket - fifthMarriedBracket) * fifthBracketPercentage
					+ (income - fifthMarriedBracket) * sixthBracketPercentage;
		return tax;
	}

	private static double calculateSingleFilerTaxes(double income) {
		double tax;
		if (income <= firstSingleBracket)
			tax = income * firstBracketPercentage;
		else if (income <= secondSingleBracket)
			tax = firstSingleBracket * firstBracketPercentage + (income - firstSingleBracket) * secondBracketPercentage;
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
					+ (fourthSingleBracket - fifthSingleBracket) * fifthBracketPercentage;
		else
			tax = firstSingleBracket * firstBracketPercentage
					+ (secondSingleBracket - firstSingleBracket) * secondBracketPercentage
					+ (thirdSingleBracket - secondSingleBracket) * thirdBracketPercentage
					+ (fourthSingleBracket - thirdSingleBracket) * fourthBracketPercentage
					+ (fifthSingleBracket - 171551) * fifthBracketPercentage
					+ (income - fifthSingleBracket) * sixthBracketPercentage;
		return tax;
	}
}
