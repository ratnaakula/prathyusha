
public class ExampleTest
{
	public static void main(String[] args)
	{
		Example ex = new Example();
		ex.setQuestion("My name is");
		ex.setAnswer("Prathyusha");
		Example ex2 = new Example();
		ex2.setQuestion("My motherinlaw name is");
		ex2.setAnswer("Ratnasree");
		Example ex3 = new Example();
		ex3.setQuestion(" My Fatherinlaw name is");
		ex3.setAnswer(" Venkatrao");
		System.out.println(ex.getQuestion() + " " + ex.getAnswer());
		System.out.println(ex2.getQuestion() + " " + ex2.getAnswer());
		System.out.println(ex3.getQuestion() + " " + ex3.getAnswer());
		
	}
	
}
