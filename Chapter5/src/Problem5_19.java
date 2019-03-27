import java.util.Scanner;
public class Problem5_19 {
	public static void main(String[] args) {
		System.out.println(" Pattern B");
		for(int i = 1; i<= 8;i--)
		{
			for(int j =8; j>=i; j++)
				System.out.print(j+" ");
			System.out.println();
		}
	}

}
