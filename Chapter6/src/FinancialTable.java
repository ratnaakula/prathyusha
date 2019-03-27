/**  (Financial application: print a tax table) Listing 3.5 gives a program to compute tax. 
 * Write a method for computing tax using the following header:
 */
import java.util.Scanner;

public class FinancialTable {
	/** Main method */
	public static void main(String[] args) {
		// Display table header
		System.out.println(
				"\nTaxable       Single         Married joint          Married        Head Of\n" +
				 "Income      	            or Qualifying          Seperate       a House\n" +
				 "                               widow(er)\n" +    
				 "---------------------------------------------------------------------------------" );
		// Display data
		for (double taxableIncome = 50000; taxableIncome <= 60000; taxableIncome += 50) {
			System.out.printf("%-13.0f", taxableIncome);
			System.out.printf("%-12d", Math.round(computeTax(0, taxableIncome)));
			System.out.printf("%-20d", Math.round(computeTax(1, taxableIncome)));
			System.out.printf("%-15d", Math.round(computeTax(2, taxableIncome)));
			System.out.printf("%-10d\n", Math.round(computeTax(3, taxableIncome)));

		}
	}
	/* Method computeTax */
    public static double computeTax(int status, double taxableIncome) {
    	double tax,//Total tax
    	taxRate, // Tax rate
    	incomeTaxed, // Taxed income
    	incomeUntaxed, // Untaxed income
    	taxAt15Percent,//Marginal amount of 15% tax bracket
    	taxAt25Percent,
    	taxAt28Percent,
    	taxAt33Percent,
    	taxAt35Percent;
    	
    	//Intialize variables to zero
    	taxAt15Percent = taxAt25Percent = taxAt28Percent = taxAt33Percent = taxAt35Percent = incomeUntaxed  =
    			incomeTaxed = taxRate = tax = 0.0;
    	switch (status) {//Get minimum taxable income for tax brackets
    	case 0: //Single
    		taxAt15Percent = 8351;
        	taxAt25Percent = 33951;
        	taxAt28Percent = 82251;
        	taxAt33Percent = 171551;
        	taxAt35Percent = 372951;break;
        	
    	case 1: //Married joint or Qualifying widower
    		taxAt15Percent = 16701;
        	taxAt25Percent = 67901;
        	taxAt28Percent = 137051;
        	taxAt33Percent = 208851;
        	taxAt35Percent = 372951; break;
        	
    	case 2: // Married Filling Seperately
    		taxAt15Percent = 8351;
        	taxAt25Percent = 33951;
        	taxAt28Percent = 68526;
        	taxAt33Percent = 104426;
        	taxAt35Percent = 186476; break;
        	
    	case 3: // Head of house
    		taxAt15Percent = 11951;
        	taxAt25Percent = 45501;
        	taxAt28Percent = 117451;
        	taxAt33Percent = 190201;
        	taxAt35Percent = 372951;
        	
    	}
        	//Compute tax
    	while(taxableIncome >= taxAt15Percent) {
    		
    		//Compute tax rate and untaxed income
    		if(taxableIncome >= taxAt35Percent) {
    			taxRate = 0.35;
    			incomeUntaxed = taxAt35Percent - 1;
    		}
    		
    		else if(taxableIncome >= taxAt33Percent) {
    			taxRate = 0.33;
    			incomeUntaxed = taxAt33Percent - 1;
    		}
    		
    		else if(taxableIncome >= taxAt28Percent) {
    			taxRate = 0.28;
    			incomeUntaxed = taxAt28Percent - 1;
    		}
    		
    		else if(taxableIncome >= taxAt25Percent) {
    			taxRate = 0.25;
    			incomeUntaxed = taxAt25Percent - 1;
    		}
    		
    		else if(taxableIncome >= taxAt15Percent) {
    			taxRate = 0.15;
    			incomeUntaxed = taxAt15Percent - 1;
    		}
    		
    		//Accumulate tax for income above the 10% bracket
    		tax += (incomeTaxed = taxableIncome - incomeUntaxed) * taxRate;
    		taxableIncome -= incomeTaxed;
    	}
    	
    	//Accumulate tax for income in the 10% tax bracket
    	return tax += taxableIncome * 0.10;
    	
    }
        	
      }
