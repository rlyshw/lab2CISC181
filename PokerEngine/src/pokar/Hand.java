package pokar;

import java.util.ArrayList;

public class Hand {
	private ArrayList<Card> handArray = new ArrayList<Card>();
	
	public Hand(Deck myDeck){
		for(int i=0; i<5; i++){
			this.handArray.add(myDeck.draw());
		}
	}
	
	public String toString() {
		String returnString = new String();
		for(Card i: this.handArray){
			returnString += i.toString() +"\n";
		}
		return returnString;
	}
}
