package activity2;

/**
 * This is a class that tests the Deck class.
 */
public class DeckTester {

	/**
	 * The main method in this class checks the Deck operations for consistency.
	 *	@param args is not used.
	 */
	public static void main(String[] args) {
		/* *** TO BE IMPLEMENTED IN ACTIVITY 2 *** */
		Deck deck1 = new Deck(new String[]{"A", "B", "C"}, new String[]{"Giraffes", "Lions"}, new int[]{2,1,6});
		System.out.println("empty: " + deck1.isEmpty());
		System.out.println("size: " + deck1.size());
		System.out.println("deal a card: " + deck1.deal());
		System.out.println("print whole deck:\n" + deck1);
		System.out.println("\n");
		
		Deck deck2 = new Deck(new String[]{"jack", "queen", "king"}, new String[]{"blue", "red"}, new int[]{11,12,13});
		System.out.println("empty: " + deck2.isEmpty());
		System.out.println("size: " + deck2.size());
		System.out.println("deal a card: " + deck2.deal());
		System.out.println("print whole deck:\n" + deck2);
		System.out.println("\n");
	}
}
