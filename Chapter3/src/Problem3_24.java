import java.util.Scanner;
public class Problem3_24 //Picking a card 
{
public static void main(String[] args)
{
	
	//Generate a random integer 1-13
	int rank = (int)(Math.random() *  13);
	// Generate a random integer 1- 4
	int suit = (int)(Math.random() *  4);
	//Display card picked from deck
	
	//System.out.println("Rank is: " + rank);
	//System.out.println("Suit is: " + suit);

	
	System.out.print(" The card you picked is ");

	switch(rank)// Get rank
	{
	case 0 : System.out.print("Ace");
	break;
	case 1 : System.out.print("rank 2");
	break;
	case 2 : System.out.print( "rank 3");
	break;
    case 3 : System.out.print("rank 4");
	break;
	case 4 : System.out.print("rank 5");
	break;
	case 5 : System.out.print("rank 6");
	break;
	case 6 : System.out.print("rank 7 ");
	break;
	case 7 : System.out.print("rank 8");
	break;
	case 8 : System.out.print("rank9 ");
	break;
	case 9 : System.out.print("rank 10");
	break;
	case 10 : System.out.print("Jack");
	break;
	case 11 : System.out.print("Queen");
	break;
	case 12 : System.out.print("King");
	
	
	}
	System.out.print(" of ");
	switch (suit)// Get suit
	{
	case 0 : System.out.print("Clubs");break;
	case 1 : System.out.print("Diamonds");break;
	case 2 : System.out.print("Hearts");break;
	case 3 : System.out.print("Spades");
	
	
	
	}
}
}
