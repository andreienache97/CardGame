import java.util.*;

/**
 * This class implements the random computer player,is an extension of gamePlayer class, inheriting
 *  all the methods and implements the interface Player.
 * @author Andrei-Ionut Enache
 *
 */
public class randomComputer extends gamePlayer implements Player{
	
	/**
	 * This is the constructor that assigns the values of a deck and the number of attributes
	 * from the superclass gamePlayer.
	 * @param deck represents the deck of the human player
	 * @param numberAttributes is the deck's feature of having 3 or 4 attributes
	 */
	public randomComputer (ArrayDeque<Card> deck, int numberAttributes)
	{ 
	  super(deck,numberAttributes);	
	}
	
	/**
	 * This method returns a random number with values between a specified range.
	 * @param min the minimum range of random numbers
	 * @param max the maximum range of random numbers
	 * @return the random number with value between @param min and @param max
	 */
	private int getRandomNumberInRange(int min, int max) {
             
       if (min >= max) {
		throw new IllegalArgumentException("Max must be greater than min");
        }
			Random r = new Random();
			return r.nextInt((max - min) + 1) + min;
		}
		
	/**
	 * This method returns the randomly selected attribute to play with by the random computer player,
	 * the minimum value could be 0 and the maximum value could be 3 or 4, it depends of the type of the deck.
	 * @return the number of the selected attribute 
	 */
	public int selectAttribute()
	{
		Card card = getCard(); 
		Attribute a = card.attributes.get(getRandomNumberInRange(0, numberAttributes - 1 ));
		System.out.println();
		System.out.println( "--------Random computer selected attribute: " + a.name );
		return a.numberAttribute;
	}
	

	
}