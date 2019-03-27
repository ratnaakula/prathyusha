import java.util.Scanner;
/**
 * using sleepin class and making sure holiday or not
 * @author prathyusha
 *
 */
public class SleepIn_Main
{

	public static void main(String[] args) {
		 
		SleepIn insleep = new SleepIn();
		insleep.setWeekday(true);
		insleep.setVacation(true);
		boolean sleepIn1 = insleep.sleepIn(insleep.isWeekday(), insleep.isVacation());
		System.out.println("The result of sleep  " + sleepIn1);
		
		
		SleepIn gotowork = new SleepIn();
		insleep.setWeekday(false);
		if (!insleep.isWeekday()) {
			System.out.println("I can go to sleep");
		} else {
			System.out.println("I hate it. I should go to work");
		}
		
		SleepIn insleep2 = new SleepIn();
		insleep2.setWeekday(false);
		boolean sleepIn2 = insleep2.sleepIn(insleep2.isWeekday(), insleep2.isVacation());
		System.out.println("The result of sleep  " + sleepIn2);
		
		
		SleepIn insleep3 = new SleepIn();
		insleep3.setVacation(true);
		boolean sleepIn3= insleep3.sleepIn(insleep3.isWeekday(), insleep3.isVacation());
		System.out.println("The result of sleep  " + sleepIn3);
		
		
	}
}
