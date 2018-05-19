import java.util.*;

/**
 * This class implements the human player,is an extension of gamePlayer class, inheriting all the methods
 * and implements the interface Player.
 * @author Andrei-Ionut Enache
 *
 */
public class humanPlayer extends gamePlayer implements Player{
	
	/**
	 * This is the constructor that assigns the values of a deck and the number of attributes
	 * from the superclass gamePlayer.
	 * @param deck represents the deck of the human player
	 * @param numberAttributes is the deck's feature of having 3 or 4 attributes
	 */
	public humanPlayer(ArrayDeque<Card> deck, int numberAttributes)
	{
		super(deck,numberAttributes);
	}
	
	/**
	 * This is a method that returns the selected attribute by the human player,
	 * it does not allow the user to insert the number of an attribute that does not exist.
	 * @return the number of the selected attribute
	 */
	public int selectAttribute()
	{   
		Card card = getCard();
		card.print();
		do{
		System.out.println();	
		System.out.println("Insert the number of attribute you want to play with");
		String option = System.console().readLine();
		attribute = Integer.parseInt( option );
		}while(attribute >= numberAttributes );
		Attribute a = card.attributes.get(attribute);
		System.out.println();
		System.out.println("You choose to play with attribute " + a.name);
		return a.numberAttribute;
	}
	
	
}
