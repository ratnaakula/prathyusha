import java.util.Scanner;

public class Problem4_23 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		// Prompt the user to enter payroll information
		System.out.print("Enter employee's name: ");
		String name = input.nextLine();
		System.out.print("Enter number of hours worked in a week: ");
		double hoursWorked = input.nextDouble();
		System.out.print("Enter hourly pay rate: ");
		double payRate = input.nextDouble();
		System.out.print("Enter federal tax withholding rate : ");
		double federalTax = input.nextDouble();
		System.out.print("Enter state tax withholding rate : ");
		double stateTax = input.nextDouble();
		input.close();
		// Display payroll statement
		double grossPay, federal, state, totalDeduction;
		System.out.println("Employee Name : " + name + "\n Hours Worked :  " + hoursWorked + "\n Pay Rate : $ "
				+ payRate + " n Gross Pay : $ " + (grossPay = hoursWorked * payRate)
				+ "\n Deductions :\n  Federal withholding (20.0 %) : $ " + (federal = grossPay * federalTax)
				+ "\n State withholding (9.0%) : $ " + (state = grossPay * stateTax) + "\n Total Deduction : $ "
				+ (totalDeduction = federal + state) + "\n Net Pay : $ " + (grossPay - totalDeduction));

	}

}
