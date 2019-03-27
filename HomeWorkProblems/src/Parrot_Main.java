import java.util.Scanner;

public class Parrot_Main
{
	/** Main method */
	public static void main(String[] args) {
		
		Parrot loudNoise = new Parrot();
		loudNoise.setTalking(false);
		loudNoise.setHour(4);
		boolean parrotNoise = loudNoise.parrotTrouble(loudNoise.isTalking(), loudNoise.getHour());
		System.out.println("If the parrot talking loudly then there will be trouble " +parrotNoise);
	}

}
