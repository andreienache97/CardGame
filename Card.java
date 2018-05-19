import java.util.*;
/**
 * This class implements a card in deck.
 * @author Andrei-Ionut Enache
 *
 */
public class Card 
{	
	/** name of the card */
	private String name;
	/** an array list with attributes, forming a card */
	public ArrayList<Attribute> attributes;
	/** a string with name of attributes for Bands deck (3 attributes) */
	private String[] bands = {"popularity", "history", "success"};
	/** a string with name of attributes for Cars deck (4 attributes) */
	private String[] cars = {"speed", "price", "exclusivity", "durability"};
	/** the number of attributes for every card in deck */
	static int numberAttribute;
	
	
	/**
	 * This constructs a card with a fixed number of attributes,
	 * and assigns a random number between 0 and 9 for each attribute
	 * and gives a name for every attribute depending of number of attributes.
	 * @param nameCard the name of the card
	 * @param numAttributes the number of attributes
	 */
	public Card (String nameCard, int numAttributes) 
	{ 
	 	this.name = nameCard;
	 	attributes = new ArrayList<Attribute>( numAttributes );
	 	
	 	if (numAttributes == 3)
	 	{ for ( int i =0; i<numAttributes; i++ ) 
		
			{
			double value = (double) ( Math.random() * 10 );
			attributes.add( new Attribute( i , bands[i] ,value ) );}}
		
	 	else
	 	{for ( int i =0; i<numAttributes; i++ ) 
		{
			double value = (double) ( Math.random() * 10 );
			attributes.add( new Attribute( i , cars[i] ,value ) );}}
		}
	
	 	
	/**
	* @return String name the name of the card
	*/
	public String getName ()
	{
		return name; 
	}
	
	
	/** 
	* Prints name of the card and its attributes as long as the array list
	* attributes contains elements. 
	*/
	public void print() 
	{  System.out.println();
		System.out.println("------------------------------");
    	System.out.println("          " + getName() );	
    	for ( Attribute a : attributes )
		
		{a.print();
		 
		}
    	
	}
	

}