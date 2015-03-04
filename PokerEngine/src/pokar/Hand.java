package pokar;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Hand {
	private static ArrayList<Card> handArray = new ArrayList<Card>();

	public Hand(Deck myDeck) {
		for (int i = 0; i < 5; i++) {
			this.handArray.add(myDeck.draw());
		}
	}

	public String toString() {
		String returnString = new String();
		for (Card i : this.handArray) {
			returnString += i.toString() + "\n";
		}
		return returnString;
	}

	public void judgeHand() {
		Collections.sort(handArray);
		/*
		 * 1. Hand Strength (eg. 2 pair of 7s and 3s vs 2 pair of 6s and 4s)
		 * 2. High Hand (the 7s in the 2 pair vs the 6s)
		 * 3. Low Hand (3s vs 4s)
		 * 4. Kicker (Remaining cards that don't add to hand strength, eg. 4 kickers in a high card)
		 */
		ArrayList<Card> highCard = new ArrayList<Card>();
		ArrayList<Card> lowCard = new ArrayList<Card>();
		ArrayList<Card> kicker = new ArrayList<Card>();

	}
}
