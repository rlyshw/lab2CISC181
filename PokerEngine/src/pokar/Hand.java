package pokar;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Hand {
	private static ArrayList<Card> handArray = new ArrayList<Card>();
	
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
	
	
	
	public void judgeHand(){
		Collections.sort(handArray);
	}
}
