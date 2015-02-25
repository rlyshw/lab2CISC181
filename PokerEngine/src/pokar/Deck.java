package pokar;

public class Deck {
	private Card[] cardArray = new Card[52];

	public Card[] getCardArray() {
		return cardArray;
	}

	public Deck() {
		//Todo: generate deck of 52 cards
		for(int i=1; i<=13; i++){
			this.cardArray[i-1]=new Card(i, 'S');
			this.cardArray[i+12]=new Card(i, 'D');
			this.cardArray[i+25]=new Card(i, 'H');
			this.cardArray[i+38]=new Card(i, 'C');
		}
	}
	
	public void shuffle() {
		// this is a returnless procedure
		// shuffles the current deck. Manipulate this.cardArray;
	}
}
