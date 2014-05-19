
public class Players<Card> {

	/**
	 * Fields
	 */

	// The player's hands
	Card[] cards;

	// Rank
	int rank;

	// Constucts the player
	public void contructPlayer(int rank, Card[] hand) 
	{
		this.cards = hand;
		this.rank = rank;
	}// player

	
	public Card playCard(Card playedCard)
	{
		int i = 0;
		//Finds the card that was played
		while(this.cards[i] != playedCard)
		{
			i++;
		}//while
		//Set it to null(This might need to be changed since I don't know
		//if this will work(?)
		this.cards[i] = null;
		return playedCard;
	}//PlayCard
	
}//class

