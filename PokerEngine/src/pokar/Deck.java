package pokar;

import java.util.ArrayList;
import java.util.Collections;

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
				Card c = new Card(cardRank, suitRank);
				cardArray.add(c);
				Collections.shuffle(cardArray);
				
			}
		}
	}

	public Card draw() {
		
	}

	public int cardsLeft() {
		
	}

}
