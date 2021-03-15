package activity4;

/**
 * This is a class that tests the Deck class.
 */
public class DeckTester {

	/**
	 * The main method in this class checks the Deck operations for consistency.
	 * 
	 * @param args is not used.
	 */
	public static void main(String[] args) {

		String[] rank1 = { "8", "10", "8" };
		String[] suit1 = { "Clubs", "Spades", "Spades" };
		int[] value1 = { 8, 10, 8 };
		Deck deck1 = new Deck(rank1, suit1, value1);
		System.out.println("The size is: " + deck1.size());

		String[] rank2 = { "3", "8", "4" };
		String[] suit2 = { "Diamonds", "Hearts", "Diamonds" };
		int[] value2 = { 3, 8, 4 };
		Deck deck2 = new Deck(rank2, suit2, value2);
		System.out.println("The deck is not empty because isEmpty returned " + deck2.isEmpty());

		String[] rank3 = { "King", "Jack", "8" };
		String[] suit3 = { "Spades", "Spades", "Hearts" };
		int[] value3 = { 12, 11, 8 };
		Deck deck3 = new Deck(rank3, suit3, value3);
		System.out.println("The card dealt is: " + deck3.deal());

		System.out.println("Shuffling cards...\n");
		
		String[] ranks2 = new String[52];
		String[]suits2 = new String[52];
		int[] pointValues2 = new int[52];
		
		for(int i = 0; i < 52; i++)
		{
		    String rank = "";
		    String suit = "";
		    
		    if ( (i+1) % 13 == 11 )
                rank = "Jack";
            else if ( (i+1) % 13 == 12 ) 
                rank = "Queen";
            else if ( (i+1) % 13 == 0 )
                rank = "King";
            else if ( (i+1) % 13 == 1 )
                rank = "Ace";
            
            if (i < 13)
                suit = "Hearts";
            else if (i < 26)
                suit = "Diamonds";
            else if (i < 39)
                suit = "Clubs";
            else
                suit = "Spades";
            
            ranks2[i] = rank;
            suits2[i] = suit;
            pointValues2[i] = ((i+1) % 13);
        }
        
        Deck deck4 = new Deck(ranks2, suits2, pointValues2);
        System.out.println(deck4);
		}

	}