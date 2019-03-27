package Arrays;


public class Sample1
{
	public static void main(String[] args) { 
		/*
		int[] list = {1, 2, 3, 4, 5};   
		reverse(list);
		for (int i = 0; i < list.length; i++)  
			System.out.print(list[i] + " "); 
		}
	public static void reverse(int[] list) 
	{ 
		int[] newList = new int[list.length];
	
	for (int i = 0; i < list.length; i++)  
		newList[i] = list[list.length - 1 - i];
	
	    list = newList; 
	    
	    } */
		printMax(34, 3, 3, 2, 56.5);
		printMax(new double[] {1, 2, 3});
	}
	public static void printMax(double...numbers) {
		if(numbers.length == 0) {
			System.out.println("No argument passed");
			return;
		}
		double result = numbers[0];
		
		for(int i = 1; i < numbers.length; i++) 
			if(numbers[i] > result)
				result = numbers[i];
			
			System.out.println("The max value is " +result);
		}
	}
