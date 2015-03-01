package pokar;

import java.util.ArrayList;
import java.util.Collections;

public class Deck {
	private ArrayList<Card> cardArray = new ArrayList<Card>();

	public ArrayList<Card> getCardArray() {
		return cardArray;
	}

	public Deck() {
		for(int j = 0; j<4; j++){
			Suit suitRank = Suit.values()[j];
			for(int i =0; i<13; i++){
				CardRank cardRank = CardRank.values()[i];
				Card c = new Card(cardRank, suitRank);
				cardArray.add(c);
				Collections.shuffle(cardArray);
			}
		}
	}

	public Card draw() {
		Card c = cardArray.get(0);
		cardArray.remove(0);
		return c;
	}

	public int cardsLeft() {
		return cardArray.size();
	}

}
