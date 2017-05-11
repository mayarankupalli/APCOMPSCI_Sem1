/**
 * This is a class that tests the Deck class.
 */
public class DeckTester {

	/**
	 * The main method in this class checks the Deck operations for consistency.
	 *	@param args is not used.
	 */
	public static void main(String[] args) 
	{
		String[] r1 = {"Ace", "Queen", "Ace"};
		String[] s1 = {"Clubs", "Hearts", "Diamonds"};
		int[] v1 = {1, 12, 1};
		Deck d1 = new Deck(r1, s1, v1);
		System.out.println("The first deck should be empty: " + d1.isEmpty());
		
		String[] r2 = {"4", "8", "Queen"};
		String[] s2 = {"Hearts", "Diamonds", "Ace"};
		int[] v2 = {4, 8, 12};
		Deck d2 = new Deck(r2, s2, v2);
		System.out.println("The second deck's size should be: " + d2.size());
		
		String[] r3 = {"1", "7", "Jack"};
		String[] s3 = {"Diamonds", "Spades", "Hearts"};
		int[] v3 = {1, 7, 11};
		Deck d3 = new Deck(r3, s3, v3);
		System.out.println("The third deck's dealt card is: " + d3.deal());
	}
}