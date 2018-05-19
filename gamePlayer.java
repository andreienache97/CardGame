import java.util.ArrayDeque;

/**
 * This class is made to be extended for each player type class,
 * having all the common methods.
 * @author Andrei-Ionut Enache
 *
 */

public class gamePlayer{

	protected ArrayDeque<Card> deck;
	protected int numberAttributes;
	/**
	 * this variable is used in the extended classes to choose the right
	 * attribute to play with.
	 */
	protected int attribute;
	
	/**
	 * This constructs a game player and holds the cards deck
	 * along with the type of deck.
	 * @param deck the player's deck
	 * @param numberAttributes the number of attributes for every card
	 */
	public gamePlayer(ArrayDeque<Card> deck, int numberAttributes)
	{this.deck=deck;
	this.numberAttributes = numberAttributes;}
	
	/**
	 * This method returns the player's deck.
	 * @return the deck
	 */
	public ArrayDeque<Card> getdeck()
	{
		return deck;
	}

	/**
	 * This method returns the head of the deck.
	 * @return the first card of the deck
	 */
	public Card getCard()
	{
		return deck.peek();
	}
	
	/**
	 * This method removes the head of the deck.
	 */
	public void removeCard()
	{
		deck.poll(); 
	}
	
	/**
	 * This method adds a card in deck at the last position (tail).
	 * @param c is added at the bottom of the deck
	 */
	public void addCard(Card c)
	{
		deck.addLast(c);
	}
	
	/**
	 * This method shows the size of the deck.
	 * @return the current size of the deck
	 */
	public int size()
	{
		return deck.size();
	}
	
	
	
}
