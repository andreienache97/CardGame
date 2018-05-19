# CardGame

 
Design, implement and document a simple card game in the Java programming language. You are advised that in order to accomplish this assessment correctly you should use the techniques regarding class structure, object usage and data structures that have been taught to you during the lectures.
The first round of the game starts with all players having the same number of cards in their deck, and the cards are facing down (i.e. not visible to the play-ers); all cards have a number of attributes, each attribute having a numerical value, e.g. a digit from 0 to 9 (inclusive).
Every player picks up a card from the top of their deck and looks at it.
The nominated first player then chooses an attribute, say Attribute i, to “play with”; all the players compare the values of this Attribute i on the cards they have picked up.
The player with the highest value wins the round, collects the cards that the other players had picked up and puts them (together with his/her card) facing down at the bottom of his/her deck.
The next round starts with every player picking up the card on top of his/her deck and looking at it, and a next player (or random player or the previous winner etc) chooses the attribute they wish to play with.
The game continues in the same fashion for an unlimited number of rounds until only one player, the winner, has cards left in their deck.
BACKGROUND: A CARD GAME
CardGame is intended to be an application that simulates the above described card game with the following features:
▪	In the simplest form, there is one human player (the user of the applica-tion) and one computer player.
▪	The user is prompted to enter his/her name.
▪	After entering their name, the user is prompted to select a type of com-puter player they wish to play against. The options are:
­	a predictable computer, i.e., one that always chooses the same attribute in every round in which they play first, or
­	a random computer, i.e., one that randomly (uniformly at ran-dom) chooses one of the available attributes in every round in which they play first.
▪	After the players have been initialised, the game starts and the screen shows the names of the players and the number of cards in each play-er’s deck.
▪	Then, the name of the player who plays first in the current round (i.e., current player) is shown on the screen, followed by the card at the top of their deck. If the current player is human, then there is a prompt on the screen for them to choose which attribute they wish to play with on the current round.
▪	After the attribute is selected by the current player, the winner is found by comparing numerical values of the selected attribute from the top cards in the decks of all players. You could display the top cards on the screen. The game moves to the next round, where another current player will be selecting a new attribute.
Note: if you have a tie (equal numerical values), simply choose a winner randomly or in another way described in your comments.
▪	The game continues until there is only one player left with some cards in their deck, and all other players have 0 cards.
Card Class: This class should hold the attributes of a card in the deck.
Attribute Class: This class should hold the name and value of the attribute. All cards in a deck should have the same number of attributes. 
Having an attribute as a class will allow you to dynamically create as many at-tributes as you want for the cards in a deck. This class can be useful if at the beginning of the game you want to give a human user a choice of decks to play with. For example, in a Band deck all cards might have only 3 attributes includ-ing “popularity”, while in a Cars deck all cards might have 4 attributes including “speed” or “price”.
Player Class: This class should make the correct use of collections to hold a player’s deck. It will also contain information about the player, for example the type of the player (human or computer). It might be useful to also have meth-ods in this class that can perform operations on any collections it might make use of, for example adding or removing cards from the player’s deck.
Extension of Classes: You should create classes that extend some of the ones above where appropriate. For example, you could extend the player class to create classes specifically for a human player or different types of computer players.
Game Class: You should create a class that initialises the game and contains all of the logic for the game itself.
Main Class: You should have a Main Class with a Main Method that will instan-tiate the game. It is good practice to have nothing else present here as it allows you to create attributes and functions that are not static and therefore allow for the correct use of multiple instances.
✓	You can set up some intelligence to the computer player(s):
▪	 A Smart Computer can select the highest attribute on their card if it was their turn to select an attribute.
▪	A Predictable Computer will always select the same (say the first) attribute on their card if it was their turn.

