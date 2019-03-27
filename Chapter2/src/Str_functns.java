import java.util.Scanner;

public class Str_functns
{

	public static void main(String[] args)
	{

		String s1 = "RajKiran";
		//char ch = s1.charAt(3);
		//System.out.print(ch);
		String s2 = "rajkiran";
		boolean str = s1.equalsIgnoreCase(s2);
		//System.out.println(s1.equalsIgnoreCase(s2));
		
		
		String s3 = "hello java world";
		String s4 = s3.replaceFirst("h", "welcome");
		System.out.println(s4);
		
		//System.out.println(s3.replace('h', 'B'));
		// System.out.println(s3.contains("java"));
		// String s4 = s1.concat(s2);
		// System.out.println(s4);
		// System.out.println(s1.startsWith("Pa"));
		System.out.println(s1.compareTo(s2));
		System.out.println(s1.concat(s2));
		System.out.println(s1.substring(0,5));
		System.out.println(s1.toUpperCase());
		System.out.println(s1.trim());
		System.out.println(s1.compareToIgnoreCase(s3));
		System.out.println(s2.indexOf('r'));
		System.out.println(s1.indexOf('r', 4));
		System.out.println(s1.indexOf('a'));
		System.out.println(s2.lastIndexOf('a', 4));
		
		String s5 = "";
		System.out.println(s5.isEmpty());
		System.out.println(s2.isEmpty());
		
		
		
		
		
		
		
	}
}
