/** 
 * 
 * @author prathyusha
 *
 */

public class Employee
{
	
	private String name;
	private int age;
	private double salary;
	
	// function - return type is there
	public String getName()
	{
	
		return name;
	}
	
	//method - return type is void
	public void setName(String name)
	{
	
		this.name = name;
	}
	
	public int getAge()
	{
	
		return age;
	}
	
	public void setAge(int age)
	{
	
		this.age = age;
	}
	
	public double getSalary()
	{
	
		return salary;
	}
	
	public void setSalary(double salary)
	{
	
		this.salary = salary;
	}
	
	public double incrementAmount(double increment) {
		return salary + salary * increment;
	}
	
	

}
