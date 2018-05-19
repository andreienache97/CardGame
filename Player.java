import java.util.*;

/**
 * This interface shows the behaviour each player class should have by adding abstract methods to be
 * initialised later in player type classes.
 * @author Andrei-Ionut Enache
 *
 */
public interface Player {
    /**
     * This method returns the selected attribute to play with for each player.
     * @return the selected attribute
     */
	public int selectAttribute();
	
	/**
	 * This method returns the first card of the deck.
	 * @return the head of the deck
	 */
	public Card getCard();
	
	/**
	 * This method removes the head of the deck.
	 */
	public void removeCard();
	
	/**
	 * This method adds a card at the bottom of the deck
	 * @param c is added at the deck's bottom or tail
	 */
	public void addCard(Card c);
	
	/**
	 * This method returns the player's deck
	 * @return the deck of each player
	 */
	public ArrayDeque<Card> getdeck();
	
	/**
	 * This method returns the size of the deck
	 * @return the current size of a deck
	 */
	public int size();
	
}
