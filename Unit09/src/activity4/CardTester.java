package activity4;
/**
 * This is a class that tests the Card class.
 */
public class CardTester {

	/**
	 * The main method in this class checks the Card operations for consistency.
	 *	@param args is not used.
	 */
	public static void main(String[] args) {
		/* *** TO BE IMPLEMENTED IN ACTIVITY 1 *** */
		Card aceDiamonds1 = new Card("ace", "diamonds", 1);
		Card twoClubs1 = new Card("2", "clubs", 2);
		Card twoClubs2 = new Card("2", "clubs", 2);
		
		System.out.println("ace of diamonds 1 tests");
		System.out.println(aceDiamonds1.rank());
		System.out.println(aceDiamonds1.suit());
		System.out.println(aceDiamonds1.pointValue());
		System.out.println(aceDiamonds1.toString());
		
		System.out.println("matches: " + aceDiamonds1.matches(twoClubs1));
		
		System.out.println("two of clubs 1 tests");
		System.out.println(twoClubs1.rank());
		System.out.println(twoClubs1.suit());
		System.out.println(twoClubs1.pointValue());
		System.out.println(twoClubs1.toString());
		
		System.out.println("two of clubs 2 tests");
		System.out.println(twoClubs2.rank());
		System.out.println(twoClubs2.suit());
		System.out.println(twoClubs2.pointValue());
		System.out.println(twoClubs2.toString());
		
		System.out.println("matches: " + twoClubs2.matches(twoClubs1));
	}
}
