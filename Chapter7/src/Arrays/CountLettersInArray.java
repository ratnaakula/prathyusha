package Arrays;


public class CountLettersInArray
{
/** Main method */
	public static void main(String[] args) {
		// Declares and creates an array 
		char[] chars = createArray();
		
		// Display the array 
		System.out.println("The lower case letters are :");
		displayArray(chars);
		
		// Count the occurence of each letter 
		int[] counts = countLetters(chars);
		
		// Display counts
		System.out.println();
		System.out.println("The occurence of each letters are : ");
		displayCounts(counts);
		
	}
	 /** Create an array of characters */
	public static char[] createArray() {
		// Declare an array of characters and create it
		char[] chars = new char[100];
		
		// Create lowercase letters randomly and assign them to array 
		for(int i = 0; i < chars.length; i++) {
			chars[i] = RandomCharacter.getRandomLowerCaseLetter();
		}
		return chars;
		}
	/** Display the array of characters */
	public static void displayArray(char[] chars) {
		// Display the characters in the array 20 on each line
		for(int i = 0; i < chars.length; i++) {
			if ((i + 1) % 20 == 0 )
	{
		System.out.println(chars[i]);
		}
		
		else
		{
			System.out.print(chars[i] + " ");
		
		}
	}
	}
	/** Count the occurences of each letter */
	public static int[] countLetters(char[] chars) {
		// Declare and create an array of 26 int 
		int[] counts = new int[26];
		
		// For each lowercase letter in the array, count it 
		for(int i = 0; i < counts.length; i++) 
			counts[chars[i] - 'a']++;
			
			return counts;
		}
		
		/** Display counts */
		public static void displayCounts(int[] counts) {
			for(int i = 0; i < counts.length; i++) {
				if((i + 1) % 10 == 0)
					System.out.println(counts[i] + " " +(char)(i + 'a'));
				else
					System.out.println(counts[i] + " " + (char)( i + 'a') + " ");
			}
			
		}
}
