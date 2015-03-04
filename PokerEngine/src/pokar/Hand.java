package pokar;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Hand {
	private static ArrayList<Card> handArray = new ArrayList<Card>();
	private HandStrength strength;

	public Hand(Deck myDeck) {
		for (int i = 0; i < 5; i++) {
			this.handArray.add(myDeck.draw());
			System.out.print(handArray);
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
		
		HandStrength strength = null;
		
		/* Only top 3 cases for this lab, top three cases are all part of the hand strength thing.
		 * 1. Hand Strength (eg. 2 pair of 7s and 3s vs 2 pair of 6s and 4s)
		 * 2. High Hand (the 7s in the 2 pair vs the 6s)
		 * 3. Low Hand (3s vs 4s)
		 * 4. Kicker (Remaining cards that don't add to hand strength, eg. 4 kickers in a high card)
		 * 
		 */ 
		boolean sameSuit = false;
		Suit firstCardSuit = handArray.get(0).getSuit();
		
		for(int i =0, r = 10  ; i<5 && r< 15; i++, r++){
			if(handArray.get(i).getSuit() != firstCardSuit) {
				break;
			}
			else if (i == 4 && handArray.get(i).getSuit() == firstCardSuit) sameSuit = true;
		}
		if(sameSuit == true){
			if(handArray.get(0).getRank() == CardRank.TEN && handArray.get(4).getRank() == CardRank.ACE ) {
				strength = HandStrength.ROYALFLUSH;
			}
			if(handArray.get(4).getRank().getCardValue() - handArray.get(0).getRank().getCardValue() == 4) {
				strength = HandStrength.STRAIGHTFLUSH;				
			}

		}
		
		ArrayList<Card> highCard = new ArrayList<Card>();
		ArrayList<Card> lowCard = new ArrayList<Card>();
		ArrayList<Card> kicker = new ArrayList<Card>();

	}
}
