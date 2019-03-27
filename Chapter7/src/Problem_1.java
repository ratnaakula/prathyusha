/** 
 * Assigning grades based on the scheme to the student scores to choose best one
 * and displaying scores according to grades
 * @author prathyusha
 */
import java.util.Scanner;

public class Problem_1
{
	/** Main method */
	public static void main(String[] args) {
	Scanner input = new Scanner(System.in);
	
	//Prompt the user to enter the total no.of students
	System.out.print("Enter the total number of students : " );
	int [] scores = new int[input.nextInt()];
	char[] grades = new char[scores.length];
	
	// Prompt the user to enter all the scores
	System.out.print("Enter all " + scores.length + " scores : ");
	for(int i = 0; i < scores.length; i++) {
		scores[i] = input.nextInt();
		
	}
	
	// Get grades
	getGrades(scores, grades);
	
	//Display results
	for(int i = 0; i< scores.length; i++) {
		System.out.println("Student " + i + " score is " + scores[i] + " and grade is " + grades[i]);
	}
	}
	/** Method max returns the highest score */
	public static int max(int[] array) {
		int max = array[0];
		for(int i = 0; i < array.length; i++) {
			if(array[i] > max)
				max = array[i];
		}
		return max;
	}

	/** Method getGrades assigns grades according to the grading scheme */
	public static void getGrades(int[] scores, char[] grades) {
		int best = max(scores);
		for(int i = 0; i < scores.length; i++) {
			if(scores[i] >= best - 10)
				grades[i] = 'A';
			else if(scores[i] >= best - 20)
				grades[i] = 'B';
			else if(scores[i] >= best - 30)
				grades[i] = 'C';
			else if(scores[i] >= best - 40)
				grades[i] = 'D';
			else 
				grades[i] = 'F';
			
		}
	}
}
		