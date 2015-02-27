package pokar;

public class Card {
	// In class bert said to use numerics for all variables. Rank should be 0=2,
	// 1=3, and so on with ace at the top I presume.
	
	//He said to use enumerators

	private cardRank rank;
	private Suit suit;

	private boolean avail = true; // This variable determines if the card is
									// drawn from the deck yet

	public int getRank() {
		return rank;
	}

	public char getSuit() {
		return suit;
	}

	public Card(int rank, char suit) {
		this.rank = rank;
		this.suit = suit;
	}

	public String toString() {
		return "Card [rank=" + rank + ", suit=" + suit + "]";
	}

	public boolean isAvail() {
		return true;
	}
}
