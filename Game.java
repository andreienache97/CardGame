import java.util.*;
/**
 * This is an abstract class to print out a message.
 * @author Andrei-Ionut Enache
 *
 */
abstract class Start { abstract void Print(); }

/**
 * This is the class where the game gets input from user and contains all the logic steps for game.
 * 
 * @author Andrei-Ionut Enache
 *
 */
public class Game {
	/** the number of round*/
	private int round = 1;
	/** initialise the human player*/
	Player human;
	/** initialise the computer player*/
	Player computer;
	/** initialise each card the human player will be playing with*/
	Card humanCard;
	/** initialise each card the computer player will be playing with*/
	Card computerCard;
	/** holds the information whether the human player won the round or not*/
	private boolean humanWinRound = true;
	/** initialise each attribute the human player will be playing with*/
	Attribute humanAttribute;
	/** initialise each card the computer player will be playing with*/
	Attribute computerAttribute;
	/** holds the index (number) of the attribute*/
	private int attributeIndex;
	/** initialise the human player's deck*/
	ArrayDeque<Card> humanDeck;
	/** initialise the computer player's deck*/
	ArrayDeque<Card> computerDeck;
	/** the number of attributes for every card*/
	public int numberAttributes;
	/** the type of the deck (Bands deck or Cars deck)*/
	private int deckType;
	/** the number of cards for decks*/
	private int numberCards;
	/** the name of the human player*/
	private String name;
	/** the number of option regarding the type of computer to play with*/
	private int option;
	
	/**
	 * Constructs a new game
	 */
	public Game(){}

	/** initialise the abstract class*/
	Start start = new Start() {
		/**
		 * prints a welcome message for game.
		 */
		public void Print() {
			System.out.println();
			System.out.println( "-------This is a card game!-------" );
			System.out.println();
		}
	};
	
	/**
	 * This method generates a certain type of deck having the number of cards and attributes.
	 * @param numCards the number of cards for each deck
	 * @param numAttributes the number of attributes for each deck
	 * @return the complete deck
	 */
	public static ArrayDeque<Card> generateDeck (int numCards, int numAttributes)
	{
		ArrayDeque<Card> fullDeck = new ArrayDeque<>( numCards );
		for ( int i =0; i<numCards; i++ ) 
		{   int name = (int) ( Math.random() * 100 );
			Card card = new Card( "Card " + String.valueOf( name ), numAttributes );
			fullDeck.add( card );
		}
		return fullDeck;
	}
	
	
	   /**
	    * This method prints out the options for a computer player to play with,
	    * and does not allow the user to input an invalid number.
	    * @return the type of computer player the user wishes to play against
	    */
	   static public int option()
	 {   
		System.out.println();
		System.out.println("Select type of computer player:");
		System.out.println();
		
		int option;
		
		System.out.println("Press 1 for predictable computer");
		System.out.println("Press 2 for random computer");
		System.out.println("Press 3 for smart computer");
		System.out.println();
        
		String a = System.console().readLine();
		
		option=Integer.parseInt( a );
		if(option!=1 && option!=2 && option != 3)
		{
		do{
		{
		System.out.println();	
		System.out.println("You entered an invalid number, try again!");
		System.out.println();
		System.out.println("Press 1 for predictable computer");
		System.out.println("Press 2 for random computer");
		System.out.println("Press 3 for smart computer");
		System.out.println();
		
		String s = System.console().readLine();
		
		option=Integer.parseInt( s );	
		
		}
		
		}while(option!=1 && option!=2 && option != 3);}
		
		return option;
	}
	
	
	/**
	 * This method checks if the players' decks are empty.
	 * @return if the decks are empty or not through a boolean value
	 */
	public boolean emptyDeck()
	{
		if(human.getdeck().isEmpty() == false && computer.getdeck().isEmpty() == false)
			return true;
		else
		    return false;
	}
	
	/**
	 * This method asks the human user for a name to play with and return that name. 
	 * @return the String name as the name of human player
	 */
	public String playerName()
	{
		System.out.println();
	    System.out.println("Insert a name to play with");
	    System.out.println();
		String name = System.console().readLine();
		return name;
	}
	
	/**
	 * This method asks the human user to input the number of cards for each deck
	 * and return that value.
	 * @return the number of cards for each deck
	 */
	public int numberCards()
	{   
		System.out.println();
		System.out.println("Insert the number of cards");
		System.out.println();
		String cards = System.console().readLine();
		int numberCards = Integer.parseInt( cards );
		return numberCards;
	}
	
	/**
	 * This method asks the human user to choose the type of deck
	 * he wants to play with (3 or 4 attributes) and check for a correct input.
	 * @return the number of attributes for each deck
	 */
    public int numberAttributes()
    {
	System.out.println();
	System.out.println("Insert the type of deck to play with: ");
	System.out.println();
	System.out.println("Press 1: Bands deck with 3 attributes");
	System.out.println("Press 2: Cars deck with 4 attributes");
	System.out.println();

	String attributes = System.console().readLine();
	deckType = Integer.parseInt( attributes );
	
	if(deckType != 1 && deckType != 2)
	{
	do{
	System.out.println();
	System.out.println("You entered an invalid number, try again!");	
	System.out.println();	
	System.out.println("Insert the type of deck to play with: ");
	System.out.println();
	System.out.println("Press 1: Bands deck with 3 attributes");
	System.out.println("Press 2: Cars deck with 4 attributes");
	System.out.println();
	String attributes1 = System.console().readLine();
	deckType = Integer.parseInt( attributes1 );
	}while(deckType != 1 && deckType != 2);}
	
	if(deckType == 1)
		{numberAttributes = 3;
	    return numberAttributes;}
	else
		{numberAttributes = 4;
	    return numberAttributes;}
    }
	
    /**
     * This method generates the human player and his deck
     * @return the deck of human player
     */
    public Player generateHumanDeck()
    {
    	ArrayDeque<Card> humanDeck = generateDeck( numberCards, numberAttributes );
	    human = new humanPlayer(humanDeck, numberAttributes);
	    return human;
    }
    
    /**
     * This method generates the random computer player and his deck
     * @return the deck of random computer player
     */
    public Player generateRandomComputerDeck()
    {
    	ArrayDeque<Card> humanDeck = generateDeck( numberCards, numberAttributes );
	    computer = new randomComputer(humanDeck, numberAttributes);
	    return computer;
    }
    
    /**
     * This method generates the predictable computer player and his deck
     * @return the deck of predictable computer player
     */
    public Player generatePredictableComputerDeck()
    {
    	ArrayDeque<Card> humanDeck = generateDeck( numberCards, numberAttributes );
	    computer = new predictableComputer(humanDeck, numberAttributes);
	    return computer;
    }
    
    /**
     * This method generates the random computer player and his deck
     * @return the deck of smart computer player
     */
    public Player generateSmartComputerDeck()
    {
    	ArrayDeque<Card> humanDeck = generateDeck( numberCards, numberAttributes );
	    computer = new smartComputer(humanDeck, numberAttributes);
	    return computer;
    }
    
    
    /**
     * This method initialise all the elements for used to run this game,
     * contains all the logic operations and outputs the layout of the game.
     */
	public void run()
	{
	/** initialise the method of the abstract class*/	
	start.Print();
	/** get the human player's name*/	
	name = playerName();
	/** get the number of cards*/	
    numberCards = numberCards();
    /** get the number of attributes*/
    numberAttributes = numberAttributes();
    /** initialise the human player's deck*/	
	human = generateHumanDeck();   
	/** get the option for the type of computer player*/
	option = option();
	    
	/** chooses which type of player to be initialised according to the user player's option*/
	    if(option == 1)
		computer = generateRandomComputerDeck();
	    
	       else if(option == 2)
		             computer = generatePredictableComputerDeck();
	                   else
	                 computer = generateSmartComputerDeck();
	 
	    /** Prints out the participants of the game and the initial number of cards each player has*/
	    System.out.println();
	    System.out.println("----- " +name+ " who has "+human.getdeck().size()+ " cards in deck");
	    System.out.println("----- Is playing against");
	    System.out.println("----- Computer player who has "+computer.getdeck().size()+ " cards in deck");
	    System.out.println();
	    
	    /** the game continues until a player's deck is empty*/
	    while(emptyDeck())
	    {   System.out.println();
            System.out.println("-----------The round number is: " + round +"-------------");
            System.out.println();  
            /** get the human deck's last card*/
            humanCard = human.getCard();
            /** get the computer deck's last card*/
            computerCard = computer.getCard();
            
            /** Decides who will be choosing the attribute to play with
             * based on the rule: who won the last round chooses the attribute.
             * The human player is the first one to choose an attribute to play with.
             * */
			if(humanWinRound)
				attributeIndex = human.selectAttribute();
			 else
				attributeIndex = computer.selectAttribute();
				 
			
			/** get the selected attribute from the human card*/
			humanAttribute = humanCard.attributes.get(attributeIndex);
			/** get the selected attribute from the computer card*/
			computerAttribute = computerCard.attributes.get(attributeIndex);
			
			
			/** print out the both cards of human and computer player*/
			System.out.println();
			System.out.println();
			System.out.println( name +"'s card ");
			humanCard.print();
			System.out.println();
			System.out.println("        VS");
			System.out.println();
			System.out.println("Computer's card");
			computerCard.print();
			System.out.println();
			
			
			
			/** initialise the logic rules for this game,
			 * if the human player's attribute value is bigger than the computer's one
			 * then the current card is removed from computer's deck and added
			 * at the bottom of human's deck along with his current cars,
			 * in case computer's attribute is bigger the opposite happens*/
			if(humanAttribute.getAttributeValue() > computerAttribute.getAttributeValue())
			{
				humanWinRound = true;
				human.addCard(computerCard);
				human.addCard(humanCard);
				human.removeCard();
				computer.removeCard();
				System.out.println();
				/** shows the round number and winner of this round*/
				System.out.println("Round number: " + round +"| The winner is " + name);
				System.out.println();
				/** shows how many cards each has left*/
				System.out.println(name+ " has "+human.getdeck().size()+ " cards in deck");
				System.out.println("Computer has "+computer.getdeck().size()+ " cards in deck");
				System.out.println();
			}
			else
			{
				humanWinRound = false;
				computer.addCard(humanCard);
				computer.addCard(computerCard);
				computer.removeCard();
				human.removeCard();
				System.out.println();
				/** shows the round number and winner of this round*/
				System.out.println("Round number: " + round +"| The winner is the computer player");
				System.out.println();
				/** shows how many cards each player has left*/
				System.out.println(name+ " has " + human.getdeck().size() + " cards in deck");
				System.out.println("Computer has " + computer.getdeck().size() + " cards in deck");
				System.out.println();
				
			}
			
			/** treats the case when the attribute values are equal 
			 * and assign to victory to the player that did not win the last round*/
			if(humanAttribute.getAttributeValue() == computerAttribute.getAttributeValue())
			{
				if(humanWinRound)
				{
					humanWinRound = false;
					computer.addCard(humanCard);
					computer.addCard(computerCard);
					computer.removeCard();
					human.removeCard();
					System.out.println();
					System.out.println("Round number: " + round +"| The winner is the computer player");
					System.out.println();
					System.out.println(name+ " has " + human.getdeck().size() + " cards in deck");
					System.out.println("Computer has " + computer.getdeck().size() + " cards in deck");
					System.out.println();
				}
			     
				else
				{
					humanWinRound = true;
					human.addCard(computerCard);
					human.addCard(humanCard);
					human.removeCard();
					computer.removeCard();
					System.out.println();
					System.out.println("Round number: " + round +"| The winner is " + name);
					System.out.println();
					System.out.println(name+ " has "+human.getdeck().size()+ " cards in deck");
					System.out.println("Computer has "+computer.getdeck().size()+ " cards in deck");
					System.out.println();
				}
			}
			/** increase the number of rounds*/
			round++;
			
	    }
	
	/**
	 * Treats the case when human player ran out of cards and computer game won the game.    
	 */
	if(human.getdeck().isEmpty()== true)
		{System.out.println();
		System.out.println("Computer player won the game !!!");	}
	
	else
		/**
		 * Treats the case when computer player ran out of cards and human game won the game.    
		 */
	    if(computer.getdeck().isEmpty()== true)
	    	{System.out.println();  
	    	System.out.println( name +" won the game !!!");}
		
    }
			
	   
	    }

	
	
