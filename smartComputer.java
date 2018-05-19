import java.util.*;

/**
 * This class implements the random computer player,is an extension of gamePlayer class, inheriting
 *  all the methods and implements the interface Player.
 * @author Andrei-Ionut Enache
 *
 */
public class smartComputer extends gamePlayer implements Player{
    /**
     * This Attribute value is created to go through each attribute of card apart from the first one
     * and find the one with the highest value.
     */
	private Attribute x;
	
	/**
	 * This is the constructor that assigns the values of a deck and the number of attributes
	 * from the superclass gamePlayer.
	 * @param deck represents the deck of the human player
	 * @param numberAttributes is the deck's feature of having 3 or 4 attributes
	 */
	public smartComputer (ArrayDeque<Card> deck, int numberAttributes)
	{ 
	  super(deck, numberAttributes);  
	}
	
	/**
	 * This method assigns the first attribute as having the highest value
	 * after that is going through every attribute to find if exists another one that is greater
	 * if it exists, the number of it is saved, if it does not then the number of the first attribute is returned.
	 * @return the number of the selected attribute
	 */
		public int selectAttribute()
	{
		Card card = getCard(); // first card
		double maxValue;
		int i=1;
		Attribute a = card.attributes.get(0);
		maxValue = a.getAttributeValue();
		attribute = 0;
		while(i < numberAttributes)
		{
		 x = card.attributes.get(i);
		 if(maxValue<x.getAttributeValue())
			 {maxValue = x.getAttributeValue();
			  attribute = i;
			 }
		i++;
		x = null;
		}
		
		Attribute x = card.attributes.get(attribute);
		System.out.println();
		System.out.println( "--------Smart computer selected attribute: " + x.name );
		return x.numberAttribute;
	}
	

	
}