import java.util.Scanner;

public class Employee_Main
{
	
	public static void main(String args[]) {
		// name: venkata age:50 salary:100000 totalcompensationbasedon15%
		// raj 30 120000 25%
		// ratna 40 80000 10%
		// prathyusha 27 60000 50%
		/* Compute data for employee 1 */
		Employee employee1 = new Employee();
		Scanner scan = new Scanner(System.in);
		String str = scan.next();
		employee1.setName(str);
		int age = scan.nextInt();
		employee1.setAge(age);
		employee1.setSalary(100000);
		double totCompensationForEmp1 = employee1.incrementAmount(0.15);
		System.out.println("Name: " + employee1.getName() +
				"\nAge: " +employee1.getAge() +"\nSalary: " +employee1.getSalary() +
				"\nTotalCompensation : " +totCompensationForEmp1);
		/* Compute data for employee 2*/
		Employee employee2 = new Employee();
		employee2.setName("Raj");
		employee2.setAge(30);
		employee2.setSalary(120000);
		double totCompensationForEmp2 = employee2.incrementAmount(0.25);
		System.out.println("Name: " + employee2.getName() +
				"\nAge: " +employee2.getAge() +"\nSalary: " +employee2.getSalary() +
				"\nTotalCompensation : " +totCompensationForEmp2);
		/* Compute data for employee 3*/
		Employee employee3 = new Employee();
		employee3.setName("Ratna");
		employee3.setAge(40);
		employee3.setSalary(80000);
		double totCompensationForEmp3 = employee3.incrementAmount(0.10);
		System.out.println("Name: " + employee3.getName() +
				" Age: " +employee3.getAge() +" Salary: " +employee3.getSalary() +
				" TotalCompensation : " + totCompensationForEmp3);
		/* Compute data for employee 4 */
		Employee employee4 = new Employee();
		employee4.setName("Prathyusha");
		employee4.setAge(27);
		employee4.setSalary(60000);
		double totCompensationForEmp4 = employee4.incrementAmount(0.50);
		System.out.println("Name: " + employee4.getName() +
				" Age: " +employee4.getAge() +" Salary: " +employee4.getSalary() +
				" TotalCompensation : " +totCompensationForEmp4);
		
		
		Employee emp1 = new Employee();
		emp1.setName("Venkata");
		Employee emp2 = new Employee();
		emp1.setAge(12);
		
		
		
		
		
	}
}
	
