package pokar;

import java.util.ArrayList;

public class Deck {
	private ArrayList<Card> cardArray = new ArrayList<Card>();

	public ArrayList<Card> getCardArray() {
		return cardArray;
	}

	public Deck() {
		// Todo: generate deck of 52 cards
		/* Commented out because this is assuming cardArray is an array not an arraylist
		 *  for (int i = 1; i <= 13; i++) {
			this.cardArray[i - 1] = new Card(i, 'S');
			this.cardArray[i + 12] = new Card(i, 'D');
			this.cardArray[i + 25] = new Card(i, 'H');
			this.cardArray[i + 38] = new Card(i, 'C');
		}*/
		for(int j = 0; j<=4; j++){
			Suit suitRank = Suit.values()[j];
			for(int i =0; i<14; i++){
				CardRank cardRank = CardRank.values()[i];
				card c = new card(suitRank, cardRank);
				cardArray.asdd(c)
				
			}
		}
	}

	public Card draw() {
		// draws a card
		for (Card i : cardArray) {
			// returns the first card in the cardArray with i.isAvail()==true
			if (i.isAvail())
				return i;
		}
		return null; // if deck is empty, return null
		// I like how this method must return type Card but it lets me return
		// null. That's nifty.
	}

	public int cardsLeft() {
		// returns how many cards are left.
		int cardsLeft = 0;
		for (Card i : cardArray) {
			// increments cardsLeft for every i.isAvail in cardArray
			if (i.isAvail())
				cardsLeft++;
		}
		return cardsLeft;
	}

	public void shuffle() {
		// this is a returnless procedure
		// shuffles the current deck. Manipulate this.cardArray;
	}
}
