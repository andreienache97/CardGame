import java.util.ArrayDeque;

/**
 * This class implements the predictable computer player,is an extension of gamePlayer class, inheriting
 * all the methods and implements the interface Player.
 * @author Andrei-Ionut Enache
 *
 */
public class predictableComputer extends gamePlayer implements Player{
	
/**
*This is the constructor that assigns the values of a deck and the number of attributes
* from the superclass gamePlayer.
* @param deck represents the deck of the human player
* @param numberAttributes is the deck's feature of having 3 or 4 attributes
*/
	public predictableComputer (ArrayDeque<Card> deck, int numberAttributes)
	{ 
	  super(deck,numberAttributes); 
	}
	
	/**
	 * This is a method that returns always the first attribute selected by the predictable computer player.
	 *@return the number of the selected attribute
	 */
	public int selectAttribute()
	{   
	
		Card card = getCard();
		Attribute a = card.attributes.get(1); // first attribute
		System.out.println();
		System.out.println( "-------Predictable computer selected attribute: " + a.name );
		return a.numberAttribute;
	}

}