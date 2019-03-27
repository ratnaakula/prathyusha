import java.util.Scanner;
public class Problem5_8 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		//Prompt the user to enter number of students
		System.out.print("Enter the number of students :");
		int numberOfStudents = input.nextInt();// to get rid of compiler error add input.nextline()
		input.nextLine();
		System.out.print("Enter the  student's name and score:");
		String studentNameScore = input.nextLine();
		//casting string into int
		int studentScore = Integer.parseInt(studentNameScore.substring(studentNameScore.indexOf(' ')+1, studentNameScore.length()));	
		
		for(int i = 1 ; i < numberOfStudents ; i++) {
			System.out.print("Enter the  students name and score :" );// Smith 90
		String tempNameScore = input.nextLine();
		int tempScore=Integer.parseInt(studentNameScore.substring(studentNameScore.indexOf(' ')+1, studentNameScore.length()));	
		
		
		if(studentScore < tempScore)
			studentNameScore = tempNameScore;

	}
	System.out.println("The top student is " +studentNameScore.substring(0,studentNameScore.indexOf(' ')));	
		
	
}
}

/*(Find the highest score) Write a program that prompts the user 
 * to enter the number of students and each student’s name and score,
and finally displays the name of the student with the highest score. */