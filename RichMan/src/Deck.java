
public class Deck {
	
	//Fields
	
	Card[] deck = new Card[52];
	
	
	public <T> T[] shuffle(T[] vals)
	{
		//Length of array
		int len = vals.length - 1;
		int i = 0; 
		int swapVal = (int) (Math.random() * len);
		int swappedVal = (int) (Math.random() * len);
	
		while(i < vals.length)
		{
			vals = swap(vals, swapVal, swappedVal);
			swapVal = (int) (Math.random() * len);
			swappedVal = (int) (Math.random() * len);
			i++;
		}//while 
		
		return vals;
	}//shuffle 

	
	public <T> T[] swap(T[] vals, int val1, int val2)
	{
		T temp = vals[val1];
		vals[val1] = vals[val2];
		vals[val2] = temp;
		return vals;
		
	}//swap
	
	public Deck()
	{
		String[] suits = {"Spade", "Diamonds", "Clubs","Hearts"};
		String[] type  = {"Ace", "Two", "Three", "Four", "Five", "Six", "Seven"
				,"Eight", "Nine", "Ten", "Jack","Queen", "King"};
		int[] numbers = {1, 2, 3, 4, 5, 6, 7,8, 9, 10, 11, 12, 13};
		Card cardThing;
		
		for(int i = 0; i < suits.length; i++)
		{
			for (int j = 0; j < type.length; j++)
			{
				cardThing = new Card(suits[i] + "of" + type[j], numbers[j]);
				this.deck[(j * i) + j] = cardThing;
			}//for 
		}//for 

	}//Make Deck

}//Class
